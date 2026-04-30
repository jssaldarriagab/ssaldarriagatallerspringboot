package com.saldarriaga.jssmoneda.control;

import com.saldarriaga.jssmoneda.service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moneda")
public class MonedaController {

    private final MonedaService service;

    @Autowired
    public MonedaController(MonedaService service) {
        this.service = service;
    }

    @GetMapping("/convertir")
    public String convertir(@RequestParam double usd) {
        double cop = service.convertirDolaresAPesos(usd);
        return usd + " USD equivalen a " + cop + " COP.";
    }
}

