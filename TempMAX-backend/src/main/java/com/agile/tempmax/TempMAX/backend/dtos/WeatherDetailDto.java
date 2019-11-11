package com.agile.tempmax.TempMAX.backend.dtos;

import lombok.Data;

@Data
public class WeatherDetailDto {
    private String place;

    private double temperature;
}
