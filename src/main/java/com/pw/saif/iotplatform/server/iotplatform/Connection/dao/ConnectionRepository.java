package com.pw.saif.iotplatform.server.iotplatform.Connection.dao;

import com.pw.saif.iotplatform.server.iotplatform.Connection.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnectionRepository  extends JpaRepository<Connection, Integer> {

    public List<Connection> findAllByOrderByIdAsc();
}
