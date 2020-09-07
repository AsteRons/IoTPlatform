package com.pw.saif.iotplatform.server.iotplatform.Monitoring.Controller;

import java.util.Date;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;


import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.service.SensorDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    private SensorDataService sensorDataService;

    // load sensorData data
    public DashboardController(SensorDataService theSensorDataService) {
        sensorDataService = theSensorDataService;
    }

    @GetMapping("/1/view")
    public String graphSensorData(Model theModel){

        List<SensorData> theSensorData = sensorDataService.findAll();

        Map<Date, Integer> sensorDataMaps = new TreeMap<>();

        for(SensorData sensorDataMap : theSensorData)
        {
            sensorDataMaps.put(sensorDataMap.getTimestamp(), sensorDataMap.getNtuValue());
        }
        theModel.addAttribute("sensorDataMaps", sensorDataMaps);

        return "sensor/viewSensorDashboardList";
    }

}
