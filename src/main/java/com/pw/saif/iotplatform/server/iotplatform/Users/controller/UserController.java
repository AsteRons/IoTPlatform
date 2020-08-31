package com.pw.saif.iotplatform.server.iotplatform.Users.controller;


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

    public UserController(UserService userService) {
        this.userService = userService;
    }


    // add mapping for "/list"
    @RequestMapping("/list")
    public String showMyMainPage(ModelMap theModel) {

        List<User> theUserService = userService.findAll();
        theModel.addAttribute("userService", theUserService);

        return "user/list";

    }
}
