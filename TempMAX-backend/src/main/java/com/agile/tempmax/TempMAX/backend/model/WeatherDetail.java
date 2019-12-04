package com.agile.tempmax.TempMAX.backend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDetail {
    @GeneratedValue
    @Id
    private int id;

    private String place;

    private double temperature;
    private double humidity;
    private double windDirection;
    private double windSpeed;

    private double lat;
    private double lng;

    private Date created_at;
    public WeatherDetail(String place,
                         double temperature,
                         double humidity,
                         double windDirection,
                         double windSpeed,
                         double lat,
                         double lng) {
        this.place = place;
        this.humidity = humidity;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.lat = lat;
        this.lng = lng;
        this.temperature = temperature;
        this.created_at=new Date();
    }
}
