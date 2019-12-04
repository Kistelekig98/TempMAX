package com.agile.tempmax.TempMAX.backend.service;

import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.helpers.WeatherDetailMapper;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import com.agile.tempmax.TempMAX.backend.repository.WeatherRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherRepository weatherRepository;

    public List<WeatherDetailDto> getWeatherDetails() {
        List<WeatherDetail> weathers = weatherRepository.findAll();

        ArrayList<WeatherDetailDto> weatherDtos = new ArrayList<WeatherDetailDto>(weathers.size());
        for (WeatherDetail weather: weathers) {
            weatherDtos.add(WeatherDetailMapper.map(weather, new WeatherDetailDto()));
        }
        return weatherDtos;
    }

    public void saveWeatherDetail(WeatherDetailDto weatherDto) {
        weatherRepository.save(WeatherDetailMapper.map(weatherDto, new WeatherDetail()));
    }
}
