package com.pw.saif.iotplatform.server.iotplatform.SensorsData.controller;

import com.pw.saif.iotplatform.server.iotplatform.SensorsData.service.SensorDataService;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String showMyMainPage(ModelMap theModel) {

        List<SensorData> theSensorData = sensorDataService.findAll();

        theModel.addAttribute("sensorData", theSensorData);

        return "sensorData/list";

    }

}