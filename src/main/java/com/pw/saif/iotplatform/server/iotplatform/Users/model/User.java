package com.pw.saif.iotplatform.server.iotplatform.Users.model;


import javax.persistence.*;

import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    @Column(name="permissions")
    private String permissions;

    @ManyToMany
    @JoinTable(name = "user_sensor",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "sensor_id"))
    private Set<Sensor> sensor = new HashSet<>();


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", permissions='" + permissions + '\'' +
                '}';
    }
}
