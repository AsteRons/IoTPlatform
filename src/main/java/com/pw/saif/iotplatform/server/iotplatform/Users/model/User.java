package com.pw.saif.iotplatform.server.iotplatform.Users.model;


import com.pw.saif.iotplatform.server.iotplatform.SensorsData.model.Sensor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

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

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    @Column(name="permissions")
    private String permissions;


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
