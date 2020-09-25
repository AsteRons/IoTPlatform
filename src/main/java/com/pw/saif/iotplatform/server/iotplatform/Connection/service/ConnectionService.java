package com.pw.saif.iotplatform.server.iotplatform.Connection.service;

import com.pw.saif.iotplatform.server.iotplatform.Connection.model.Connection;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;

import java.util.List;

public interface ConnectionService {

    public List<Connection> findAll();

    public Connection findById(int theId);

    public void save(Connection theConnection);

    public void deleteById(int theId);

}
