package com.pw.saif.iotplatform.server.iotplatform.SensorsData.service;

import java.util.List;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;

public interface SensorDataService {

    public List<SensorData> findAll();

    public SensorData findById(int theId);

    public void save(SensorData theSensorData);

    public void deleteById(int theId);
}
