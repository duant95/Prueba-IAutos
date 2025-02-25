package com.example.anuncios_api.service;

import com.example.anuncios_api.model.Anuncio;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service  // Marca la clase como un servicio manejado por Spring
public class AnuncioService {
    private final List<Anuncio> anuncios = new ArrayList<>();

    public AnuncioService() {
        // Anuncios de prueba
        anuncios.add(new Anuncio(UUID.randomUUID(), "Juan Pérez", 15000, "Toyota Corolla", 2020, "FWD", 25000, "Rojo", "Gasolina"));
        anuncios.add(new Anuncio(UUID.randomUUID(), "María López", 18000, "Honda Civic", 2021, "AWD", 15000, "Negro", "Gasolina"));
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }
}
