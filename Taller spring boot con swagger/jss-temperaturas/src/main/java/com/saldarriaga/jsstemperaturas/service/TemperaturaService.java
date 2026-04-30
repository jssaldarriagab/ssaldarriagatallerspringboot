package com.saldarriaga.jsstemperaturas.service;

import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
