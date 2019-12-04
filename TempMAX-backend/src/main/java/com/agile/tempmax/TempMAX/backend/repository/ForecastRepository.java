package com.agile.tempmax.TempMAX.backend.repository;

import com.agile.tempmax.TempMAX.backend.dtos.ForecastDto;
import com.agile.tempmax.TempMAX.backend.model.Forecast;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ForecastRepository extends CrudRepository<Forecast, Integer> {
    List<Forecast> findAll();
}
