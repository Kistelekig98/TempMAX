package com.agile.tempmax.TempMAX.backend.helpers;

import com.agile.tempmax.TempMAX.backend.model.WeatherDetail;
import com.agile.tempmax.TempMAX.backend.repository.WeatherRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDB implements ApplicationRunner {
    @Setter(onMethod=@__({@Autowired}))
    private WeatherRepository weatherRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        weatherRepository.save(new WeatherDetail("Budapest", 18.5));
        weatherRepository.save(new WeatherDetail("Salgótarján", 15));
    }

}
