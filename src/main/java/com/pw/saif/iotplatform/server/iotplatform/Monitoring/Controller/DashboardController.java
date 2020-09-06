package com.pw.saif.iotplatform.server.iotplatform.Monitoring.Controller;

import com.pw.saif.iotplatform.server.iotplatform.Sensor.service.SensorService;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.service.SensorDataService;
import com.pw.saif.iotplatform.server.iotplatform.Users.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    private SensorDataService sensorDataService;
    private UserService userService;
    private SensorService sensorService;


    public DashboardController(UserService userService, SensorService sensorService, SensorDataService sensorDataService) {
        this.userService = userService;
        this.sensorService = sensorService;
        this.sensorDataService = sensorDataService;
    }



}
