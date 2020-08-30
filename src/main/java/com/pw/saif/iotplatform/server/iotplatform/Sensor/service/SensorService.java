package com.pw.saif.iotplatform.server.iotplatform.Sensor.service;

import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import java.util.List;


public interface SensorService {

    public List<Sensor> findAll();

    public Sensor findById(int theId);

    public void save(Sensor theSensor);

    public void deleteById(int theId);
}
