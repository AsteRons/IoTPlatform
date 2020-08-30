package com.pw.saif.iotplatform.server.iotplatform.Sensor.dao;

import java.util.List;

import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SensorRepository  extends JpaRepository<Sensor, Integer> {

    // add a method to sort by last name
    public List<Sensor> findAllByOrderByIdAsc();

}