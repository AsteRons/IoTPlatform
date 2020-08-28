package com.pw.saif.iotplatform.server.iotplatform.SensorsData.controller;

import com.pw.saif.iotplatform.server.iotplatform.SensorsData.service.SensorDataService;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;

import java.util.Date;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sensorData")
public class SensorDataController {


    private SensorDataService sensorDataService;

    // load sensorData data
    public SensorDataController(SensorDataService theSensorDataService) {
        sensorDataService = theSensorDataService;
    }

    // add mapping for "/list"
    @RequestMapping("/list")
    public String showMyMainPage(Model theModel) {

        List<SensorData> theSensorData = sensorDataService.findAll();
        theModel.addAttribute("sensorData", theSensorData);
        return "sensorData/list";

    }

}