package com.agile.tempmax.TempMAX.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String details;
    private Date creationDate;

    public Forecast( String title, String details, Date creationDate) {
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
    }
}
