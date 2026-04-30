package com.saldarriaga.jssmensajes.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class MensajeService {

    private final List<String> mensajes = Arrays.asList(
        "El único modo de hacer un gran trabajo es amar lo que haces.",
        "No cuentes los días, haz que los días cuenten.",
        "El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
        "Cree en ti mismo y en todo lo que eres.",
        "Tu tiempo es limitado, no lo malgastes viviendo la vida de otro."
    );

    public String obtenerMensajeAleatorio() {
        Random rand = new Random();
        return mensajes.get(rand.nextInt(mensajes.size()));
    }
}
