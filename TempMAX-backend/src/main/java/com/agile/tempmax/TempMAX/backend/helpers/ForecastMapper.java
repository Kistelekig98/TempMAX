package com.agile.tempmax.TempMAX.backend.helpers;

import com.agile.tempmax.TempMAX.backend.dtos.ForecastDto;
import com.agile.tempmax.TempMAX.backend.model.Forecast;

public class ForecastMapper {

    public static ForecastDto map(Forecast forecast, ForecastDto dto) {
        dto.setTitle(forecast.getTitle());
        dto.setDetails(forecast.getDetails());
        dto.setCreationDate(forecast.getCreationDate());

        return dto;
    }

    public static Forecast map(ForecastDto dto, Forecast forecast) {
        forecast.setTitle(dto.getTitle());
        forecast.setDetails(dto.getDetails());
        forecast.setCreationDate(dto.getCreationDate());

        return forecast;
    }
}
