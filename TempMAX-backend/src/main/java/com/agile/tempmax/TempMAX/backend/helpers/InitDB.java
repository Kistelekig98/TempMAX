package com.agile.tempmax.TempMAX.backend.helpers;

import com.agile.tempmax.TempMAX.backend.model.Forecast;
import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import com.agile.tempmax.TempMAX.backend.repository.ForecastRepository;
import com.agile.tempmax.TempMAX.backend.repository.WeatherRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class InitDB implements ApplicationRunner {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherRepository weatherRepository;

    @Setter(onMethod=@__({@Autowired}))
    private ForecastRepository forecastRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        weatherRepository.save(new WeatherDetail("Budapest", 0,0.4,30,10,44.333,33.444));
        weatherRepository.save(new WeatherDetail("Szentendre", -5,0.1,10,13.4,34.33,55.56));

        forecastRepository.save(new Forecast("Budapest előrejelzés", "Elég hideg lesz...", new Date()));
        forecastRepository.save(new Forecast("Szentendre előrejelzés", "Itt is elég hideg lesz...", new Date()));
    }

}
