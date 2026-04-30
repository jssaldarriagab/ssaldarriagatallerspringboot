package com.saldarriaga.jssedad.control;

import com.saldarriaga.jssedad.service.EdadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/edad")
public class EdadController {

    private final EdadService service;

    @Autowired
    public EdadController(EdadService service) {
        this.service = service;
    }

    @GetMapping("/validar")
    public String validar(@RequestParam String nombre, @RequestParam int edad) {
        return service.validarEdad(nombre, edad);
    }
}

