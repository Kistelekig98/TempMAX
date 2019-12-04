package com.agile.tempmax.TempMAX.backend.service;

import com.agile.tempmax.TempMAX.backend.dtos.ForecastDto;
import com.agile.tempmax.TempMAX.backend.helpers.ForecastMapper;
import com.agile.tempmax.TempMAX.backend.model.Forecast;
import com.agile.tempmax.TempMAX.backend.repository.ForecastRepository;
import lombok.Setter;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForecastService {
    @Setter(onMethod=@__({@Autowired}))
    private ForecastRepository forecastRepository;

    public List<ForecastDto> getForecasts() {
        var forecastModels = forecastRepository.findAll();

        List<ForecastDto> listDtos = new ArrayList<>(forecastModels.size());
        forecastModels.forEach((x -> listDtos.add(ForecastMapper.map(x, new ForecastDto()))));

        return listDtos;
    }

    public void saveForecast(ForecastDto dto) {
        forecastRepository.save(ForecastMapper.map(dto, new Forecast()));
    }
}
