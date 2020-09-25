package com.pw.saif.iotplatform.server.iotplatform.Connection.controller;

import com.pw.saif.iotplatform.server.iotplatform.Connection.model.Connection;
import com.pw.saif.iotplatform.server.iotplatform.Connection.service.ConnectionService;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.service.SensorDataService;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/connection")
public class ConnectionController {



    private ConnectionService connectionService;
    private SensorService sensorService;
    private SensorDataService sensorDataService;



    public ConnectionController(ConnectionService connectionService, SensorService sensorService, SensorDataService sensorDataService) {
        this.connectionService = connectionService;
        this.sensorService = sensorService;
        this.sensorDataService = sensorDataService;
    }


    //Pobranie pomiaru JSON HTTP
    @RequestMapping("/{id}/measurement")
    public SensorData viewUser(@PathVariable String id) {

        SensorData sensorData = sensorDataService.findById(Integer.valueOf(id));
        return sensorData;
    }

    // Zapis danych JSON HTTP
    @PostMapping("/{idSensor}/{idtoken}/measurement")
    public ResponseEntity postController(
            @RequestBody SensorData sensorData, @PathVariable int idtoken, @PathVariable int idSensor) {
        Sensor sensor = sensorService.findById(idSensor);
        if(sensor.getSensornumber() == idtoken){
            sensorData.setSensor(sensor);
            sensorDataService.save(sensorData);
            return ResponseEntity.ok(HttpStatus.OK);
        }
        else return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
