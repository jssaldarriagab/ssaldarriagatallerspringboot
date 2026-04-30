package com.saldarriaga.jssmensajes.control;

import com.saldarriaga.jssmensajes.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    private final MensajeService service;

    @Autowired
    public MensajeController(MensajeService service) {
        this.service = service;
    }

    @GetMapping("/aleatorio")
    public String obtenerMensaje() {
        return service.obtenerMensajeAleatorio();
    }
}

