package com.xworkz.bag.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {
    private String recordedBy;
    private String location;
    private int temperature;
    private LocalDate date;

    public WeatherDTO(){}

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRecordedBy(String recordedBy) {
        this.recordedBy = recordedBy;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getRecordedBy() {
        return recordedBy;
    }
}
