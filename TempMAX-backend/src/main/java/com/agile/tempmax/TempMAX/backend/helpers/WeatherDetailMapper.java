package com.agile.tempmax.TempMAX.backend.helpers;

import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;

public class WeatherDetailMapper {

    public static WeatherDetailDto map(WeatherDetail weather, WeatherDetailDto weatherDto) {

        weatherDto.setPlace(weather.getPlace());
        weatherDto.setTemperature(weather.getTemperature());
        weatherDto.setCreated_at(weather.getCreated_at());
        weatherDto.setHumidity(weather.getHumidity());
        weatherDto.setLng(weather.getLng());
        weatherDto.setLat(weather.getLat());
        weatherDto.setWindDirection(weather.getWindDirection());
        weatherDto.setWindSpeed(weather.getWindSpeed());

        return weatherDto;
    }

    public static WeatherDetail map(WeatherDetailDto weatherDto, WeatherDetail weather) {
        weather.setPlace(weatherDto.getPlace());
        weather.setTemperature(weatherDto.getTemperature());
        weather.setCreated_at(weatherDto.getCreated_at());
        weather.setHumidity(weatherDto.getHumidity());
        weather.setLng(weatherDto.getLng());
        weather.setLat(weatherDto.getLat());
        weather.setWindDirection(weatherDto.getWindDirection());
        weather.setWindSpeed(weatherDto.getWindSpeed());

        return weather;
    }
}
