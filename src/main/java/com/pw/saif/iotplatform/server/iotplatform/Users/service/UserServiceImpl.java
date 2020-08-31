package com.pw.saif.iotplatform.server.iotplatform.Users.service;


import java.util.List;
import java.util.Optional;

import com.pw.saif.iotplatform.server.iotplatform.SensorsData.dao.SensorDataRepository;
import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;
import com.pw.saif.iotplatform.server.iotplatform.Users.dao.UserRepository;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository theUserRepository) {
        userRepository = theUserRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAllByOrderByIdAsc();
    }

    @Override
    public User findById(int theId) {
        Optional<User> result = userRepository.findById(theId);

        User theUser = null;

        if (result.isPresent()) {
            theUser = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find User id - " + theId);
        }
        return theUser;
    }

    @Override
    public void save(User theSensorData) {
        userRepository.save(theSensorData);
    }

    @Override
    public void deleteById(int theId) {
        userRepository.deleteById(theId);
    }
}
