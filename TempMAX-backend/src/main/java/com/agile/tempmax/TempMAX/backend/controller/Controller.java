package com.agile.tempmax.TempMAX.backend.controller;

import com.agile.tempmax.TempMAX.backend.dtos.ForecastDto;
import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.service.ForecastService;
import com.agile.tempmax.TempMAX.backend.service.WeatherService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherService weatherService;

    @Setter(onMethod=@__({@Autowired}))
    private ForecastService forecastSerivce;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/temps", method = RequestMethod.GET)
    public List<WeatherDetailDto> getTemps() {
        return weatherService.getWeatherDetails();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/temps", method = RequestMethod.POST)
    public void addTemp(@RequestBody WeatherDetailDto weatherDto) {
        weatherService.saveWeatherDetail(weatherDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/forecast", method = RequestMethod.GET)
    public List<ForecastDto> getForecasts() {
        return forecastSerivce.getForecasts();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/forecast", method = RequestMethod.POST)
    public void postForecasts(@RequestBody ForecastDto forecastDto) {
        forecastSerivce.saveForecast(forecastDto);
    }
}