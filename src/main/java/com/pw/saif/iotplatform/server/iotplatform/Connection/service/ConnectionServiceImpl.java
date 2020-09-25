package com.pw.saif.iotplatform.server.iotplatform.Connection.service;

import com.pw.saif.iotplatform.server.iotplatform.Connection.dao.ConnectionRepository;
import com.pw.saif.iotplatform.server.iotplatform.Connection.model.Connection;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ConnectionServiceImpl implements ConnectionService {


    private ConnectionRepository connectionRepository;

    @Autowired
    public ConnectionServiceImpl(ConnectionRepository theConnectionRepository) {
        connectionRepository = theConnectionRepository;
    }

    @Override
    public List<Connection> findAll() {
        return connectionRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Connection findById(int theId) {
        Optional<Connection> result = connectionRepository.findById(theId);

        Connection theConnection = null;

        if (result.isPresent()) {
            theConnection = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find sensor id - " + theId);
        }
        return theConnection;
    }

    @Override
    public void save(Connection theConnection) {
        connectionRepository.save(theConnection);
    }

    @Override
    public void deleteById(int theId) {
        connectionRepository.deleteById(theId);
    }
}
