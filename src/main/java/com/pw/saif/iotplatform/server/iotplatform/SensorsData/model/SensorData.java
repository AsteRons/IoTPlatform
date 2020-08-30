package com.pw.saif.iotplatform.server.iotplatform.SensorsData.model;


import java.util.Date;
import com.pw.saif.iotplatform.server.iotplatform.Users.model.User;

import javax.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="sensordata")
public class SensorData {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="ntuvalue")
    private int ntuValue;

    @Column(name="timestamp")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    @Override
    public String toString() {
        return "SensorData{" +
                "id=" + id +
                ", ntuValue=" + ntuValue +
                ", timestamp=" + timestamp +
                ", sensor=" + sensor +
                '}';
    }
}

