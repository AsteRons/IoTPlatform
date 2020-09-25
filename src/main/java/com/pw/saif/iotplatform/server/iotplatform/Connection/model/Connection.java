package com.pw.saif.iotplatform.server.iotplatform.Connection.model;

import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="connection")
public class Connection {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    public String name;

    @Column(name="type")
    public String type;

    @Column(name="endpoint")
    public String endpoint;

    @Column(name="port")
    public String port;

    @Column(name="hostname")
    public String hostname;

    @ManyToOne
    @JoinColumn(name = "sensor")
    private Sensor sensor;

    @Column(name="timeout")
    public String timeout;
}
