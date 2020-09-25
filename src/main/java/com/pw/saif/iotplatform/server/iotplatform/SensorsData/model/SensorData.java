package com.pw.saif.iotplatform.server.iotplatform.SensorsData.model;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.pw.saif.iotplatform.server.iotplatform.Sensor.model.Sensor;

import javax.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    @JsonBackReference
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

