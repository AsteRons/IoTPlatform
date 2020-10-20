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
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/connection/view/")
public class ConnectionViewController {



    private ConnectionService connectionService;
    private SensorService sensorService;
    private SensorDataService sensorDataService;



    public ConnectionViewController(ConnectionService connectionService, SensorService sensorService, SensorDataService sensorDataService) {
        this.connectionService = connectionService;
        this.sensorService = sensorService;
        this.sensorDataService = sensorDataService;
    }



    // Lista wszystkich połączeń
    @RequestMapping("/sensor/all")
    public String viewConnection(ModelMap theModel) {

        List<Connection> theConnectionList = connectionService.findAll();
        theModel.addAttribute("theConnectionList", theConnectionList);

        return "connection/viewSensorConnectionList";
    }


    // Lista połączeń dla określonego sensora
    @RequestMapping("/sensor/{id}")
    public String viewConnectionSensor(ModelMap theModel) {

        return "connection/viewSensorConnectionList.";
    }

}
