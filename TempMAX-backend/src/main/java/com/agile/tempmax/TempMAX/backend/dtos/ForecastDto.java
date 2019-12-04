package com.agile.tempmax.TempMAX.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForecastDto {
    private String title;
    private String details;
    private Date creationDate;
}
