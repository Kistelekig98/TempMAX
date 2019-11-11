package com.agile.tempmax.TempMAX.backend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class WeatherDetail {
    @GeneratedValue
    @Id
    private int id;

    private String place;

    private double temperature;

    public WeatherDetail(String place, double temperature) {
        this.place = place;
        this.temperature = temperature;
    }
}
