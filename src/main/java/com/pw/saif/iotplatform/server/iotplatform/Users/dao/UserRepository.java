package com.pw.saif.iotplatform.server.iotplatform.Users.dao;


import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository  extends JpaRepository<User, Integer> {


    public List<User> findAllByOrderByIdAsc();

}
