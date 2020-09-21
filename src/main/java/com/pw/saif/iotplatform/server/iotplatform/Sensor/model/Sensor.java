package com.pw.saif.iotplatform.server.iotplatform.Sensor.model;

import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.SensorData;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

@Setter
@Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name="sensor")
    public class Sensor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="importance")
    public String importance;

    @Column(name="url")
    public String url;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sensor")
    private Set<SensorData> sensorData = new HashSet<>();

    @ManyToMany(mappedBy ="sensor")
    private Set<User> user = new HashSet<>();

    @Column(name="name")
    public String name;

    @Column(name="place")
    public String place;

    @Column(name="measurementFrequency")
    public String measurementFrequency;

    @Column(name="accuracy")
    public String accuracy;

    @Column(name="descriptions")
    public String descriptions;
}
