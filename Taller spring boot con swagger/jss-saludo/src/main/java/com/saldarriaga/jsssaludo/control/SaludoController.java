package com.saldarriaga.jsssaludo.control;

import com.saldarriaga.jsssaludo.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/saludo")
public class SaludoController {

    private final SaludoService service;

    @Autowired
    public SaludoController(SaludoService service) {
        this.service = service;
    }

    @GetMapping
    public String saludar(@RequestParam String nombre) {
        return service.generarSaludo(nombre);
    }
}

