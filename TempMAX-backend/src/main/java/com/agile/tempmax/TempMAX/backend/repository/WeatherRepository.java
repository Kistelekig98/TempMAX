package com.agile.tempmax.TempMAX.backend.repository;

import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeatherRepository extends CrudRepository<WeatherDetail, Integer> {
    List<WeatherDetail> findAll();
}
