package com.pw.saif.iotplatform.server.iotplatform.Users.controller;


import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import com.pw.saif.iotplatform.server.iotplatform.Users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private  UserService userService;

    private SensorService sensorService;

    public UserController(UserService userService, SensorService sensorService) {
        this.userService = userService;
        this.sensorService = sensorService;
    }

    // add mapping for "/list"
    @RequestMapping("/list")
    public String showMyMainPage(ModelMap theModel) {

        List<User> theUserService = userService.findAll();
        theModel.addAttribute("userService", theUserService);
        return "user/list";

    }
}
