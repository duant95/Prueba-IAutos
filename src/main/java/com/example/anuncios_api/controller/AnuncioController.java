package com.example.anuncios_api.controller;

import com.example.anuncios_api.model.Anuncio;
import com.example.anuncios_api.service.AnuncioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/anuncios")  // Define el endpoint principal
public class AnuncioController {
    private final AnuncioService anuncioService;

    public AnuncioController(AnuncioService anuncioService) {
        this.anuncioService = anuncioService;
    }

    @GetMapping
    public List<Anuncio> getAnuncios(@RequestParam(required = false) String modelo) {
        List<Anuncio> anuncios = anuncioService.getAnuncios();

        // Si se pasa un modelo como parámetro, filtra los resultados
        if (modelo != null) {
            return anuncios.stream()
            .filter(anuncio -> anuncio.getModelo().toLowerCase()
               .contains(modelo.toLowerCase()))
            .toList();

        }
        return anuncios;
    }
}
