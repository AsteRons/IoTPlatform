package com.pw.saif.iotplatform.server.iotplatform.Users.controller;


import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import com.pw.saif.iotplatform.server.iotplatform.Users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("/{id}/view")
    public String viewUser(@PathVariable String id, ModelMap theModel) {

        User theUserService = userService.findById(Integer.valueOf(id));
        theModel.addAttribute("userService", theUserService);
        return "user/viewUser";

    }


    @RequestMapping("/list")
    public String viewUsersList(ModelMap theModel) {

        List<User> theUserService = userService.findAll();
        theModel.addAttribute("userService", theUserService);
        return "user/listUser";

    }

}
