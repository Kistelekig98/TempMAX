package com.agile.tempmax.TempMAX.backend.controller;

import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.helpers.WeatherDetailMapper;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import com.agile.tempmax.TempMAX.backend.repository.WeatherRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherRepository weatherRepository;

    @RequestMapping("/")
    public String index() {
        return "Időjárás adatok: /temps";
    }

    @RequestMapping(value = "/temps", method = RequestMethod.GET)
    public List<WeatherDetailDto> getTemps() {
        List<WeatherDetail> weathers = weatherRepository.findAll();

        ArrayList<WeatherDetailDto> weatherDtos = new ArrayList<WeatherDetailDto>(weathers.size());
        for (WeatherDetail weather: weathers) {
            weatherDtos.add(WeatherDetailMapper.map(weather, new WeatherDetailDto()));
        }
        return weatherDtos;
    }

    @RequestMapping(value = "/temps", method = RequestMethod.POST)
    public void addTemp(@RequestBody WeatherDetailDto weatherDto) {
        weatherRepository.save(WeatherDetailMapper.map(weatherDto, new WeatherDetail()));
    }
}