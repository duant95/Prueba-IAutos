package com.example.anuncios_api.controller;

import com.example.anuncios_api.model.Anuncio;
import com.example.anuncios_api.service.AnuncioService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/anuncios")  // Define el endpoint principal
@Tag(name = "Anuncios", description = "API para gestionar anuncios de autos")  // Categoría en la doc
public class AnuncioController {
    private final AnuncioService anuncioService;

    public AnuncioController(AnuncioService anuncioService) {
        this.anuncioService = anuncioService;
    }

    @Operation(summary = "Obtener anuncios", description = "Retorna una lista de anuncios, opcionalmente filtrando por modelo.")
    @GetMapping
    public List<Anuncio> getAnuncios( @Parameter(description = "Modelo del auto para filtrar los anuncios") 
    @RequestParam(required = false) String modelo) {
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
