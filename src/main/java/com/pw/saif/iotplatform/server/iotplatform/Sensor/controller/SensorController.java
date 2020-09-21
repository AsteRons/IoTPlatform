package com.pw.saif.iotplatform.server.iotplatform.Sensor.controller;


import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import com.pw.saif.iotplatform.server.iotplatform.Users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/sensor")
public class SensorController {

    private SensorService sensorService;
    private UserService userService;

    public SensorController(SensorService sensorService, UserService userService) {
        this.sensorService = sensorService;
        this.userService = userService;
    }

    // add mapping for "/list"
    @RequestMapping("/list")
    public String showMyMainSensorPage(ModelMap theModel) {

        List<Sensor> theSensor = sensorService.findAll();

        theModel.addAttribute("theSensors", theSensor);

        return "sensor/viewUserSensor";

    }

    // add mapping for "/list"
    @RequestMapping("/user/{id}/view")
    public String viewUser(@PathVariable String id, ModelMap theModel) {

        User theUserService = userService.findById(Integer.valueOf(id));
        Set<Sensor> sensors = theUserService.getSensor();

        theModel.addAttribute("theSensors", sensors);
        return "sensor/viewUserSensor";
    }

    @RequestMapping("/connection/{id}/view")
    public String viewSensorConnection(@PathVariable String id, ModelMap theModel) {

        return "sensor/viewSensorConnectionList";
    }

    @RequestMapping("/dashboard/{id}/view")
    public String viewSensorDashboard(@PathVariable String id, ModelMap theModel) {

        return "sensor/viewSensorDashboardList";
    }

    @RequestMapping("/{id}/view")
    public String viewSensorDetails(@PathVariable String id, ModelMap theModel) {
        Sensor thesensorService = sensorService.findById(Integer.valueOf(id));

        Set<User> theUser = thesensorService.getUser();

        theModel.addAttribute("theSensorDetails", thesensorService);
        theModel.addAttribute("theUserList", theUser);
        return "sensor/viewSensorDetails";
    }


}
