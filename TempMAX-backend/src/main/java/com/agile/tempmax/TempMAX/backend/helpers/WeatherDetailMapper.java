package com.agile.tempmax.TempMAX.backend.helpers;

import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;

public class WeatherDetailMapper {

    public static WeatherDetailDto map(WeatherDetail weather, WeatherDetailDto weatherDto) {
        weatherDto.setPlace(weather.getPlace());
        weatherDto.setTemperature(weather.getTemperature());

        return weatherDto;
    }

    public static WeatherDetail map(WeatherDetailDto weatherDto, WeatherDetail weather) {
        weather.setPlace(weatherDto.getPlace());
        weather.setTemperature(weatherDto.getTemperature());

        return weather;
    }
}
