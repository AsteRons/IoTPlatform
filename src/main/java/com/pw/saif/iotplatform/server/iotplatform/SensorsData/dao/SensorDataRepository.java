package com.pw.saif.iotplatform.server.iotplatform.SensorsData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;

public interface SensorDataRepository  extends JpaRepository<SensorData, Integer>{

    // add a method to sort by last name
    public List<SensorData> findAllByOrderByIdAsc();

}
