package com.saldarriaga.jsstemperaturas.control;

import com.saldarriaga.jsstemperaturas.service.TemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperaturas")
public class TemperaturaController {

    private final TemperaturaService temperaturaService;

    @Autowired
    public TemperaturaController(TemperaturaService temperaturaService) {
        this.temperaturaService = temperaturaService;
    }

    @GetMapping("/convertir")
    public String convertir(@RequestParam double celsius) {
        double fahrenheit = temperaturaService.celsiusAFahrenheit(celsius);
        return celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.";
    }
}

