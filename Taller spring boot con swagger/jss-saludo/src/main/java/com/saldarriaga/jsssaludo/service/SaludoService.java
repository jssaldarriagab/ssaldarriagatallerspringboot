package com.saldarriaga.jsssaludo.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String generarSaludo(String nombre) {
        return "¡Hola, " + nombre + "! Bienvenido/a a nuestro sistema. Esperamos que tengas un excelente día.";
    }
}
