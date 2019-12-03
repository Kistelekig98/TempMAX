package com.agile.tempmax.TempMAX.backend.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class WeatherDetailDto {
    private String place;

    private double temperature;
    private double humidity;
    private double windDirection;
    private double windSpeed;

    private double lat;
    private double lng;

    private Date created_at;
}
