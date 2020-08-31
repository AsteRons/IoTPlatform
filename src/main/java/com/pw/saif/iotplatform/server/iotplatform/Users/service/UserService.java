package com.pw.saif.iotplatform.server.iotplatform.Users.service;

import java.util.List;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;

public interface UserService {

    public List<User> findAll();

    public User findById(int theId);

    public void save(User theSensorData);

    public void deleteById(int theId);

}
