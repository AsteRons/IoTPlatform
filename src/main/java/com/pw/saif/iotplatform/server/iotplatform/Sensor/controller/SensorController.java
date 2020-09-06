package com.pw.saif.iotplatform.server.iotplatform.Sensor.controller;


import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sensor")
public class SensorController {

    private SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    // add mapping for "/list"
    @RequestMapping("/list")
    public String showMyMainSensorPage(ModelMap theModel) {

        List<Sensor> theSensor = sensorService.findAll();

        theModel.addAttribute("sensor", theSensor);

        return "sensor/list";

    }

}
