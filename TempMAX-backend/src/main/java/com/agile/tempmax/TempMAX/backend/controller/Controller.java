package com.agile.tempmax.TempMAX.backend.controller;

import com.agile.tempmax.TempMAX.backend.dtos.WeatherDetailDto;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import com.agile.tempmax.TempMAX.backend.repository.WeatherRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherRepository weatherRepository;

    // TODO: Add mapping or service layer?

    @RequestMapping("/")
    public String index() {
        return "Időjárás adatok: /temps";
    }

    @RequestMapping(value = "/temps", method = RequestMethod.GET)
    // TODO: Use DTO instead of entity
    public List<WeatherDetail> getTemps() {
        return weatherRepository.findAll();
    }
}
