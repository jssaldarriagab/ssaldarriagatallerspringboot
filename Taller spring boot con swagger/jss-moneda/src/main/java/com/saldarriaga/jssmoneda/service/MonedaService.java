package com.saldarriaga.jssmoneda.service;

import org.springframework.stereotype.Service;

@Service
public class MonedaService {
    private final double TASA_FIJA = 3900.0; // 1 USD = 3900 COP

    public double convertirDolaresAPesos(double usd) {
        return usd * TASA_FIJA;
    }
}
