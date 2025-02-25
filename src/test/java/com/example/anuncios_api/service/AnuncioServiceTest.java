package com.example.anuncios_api.service;

import com.example.anuncios_api.service.AnuncioService;
import com.example.anuncios_api.model.Anuncio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnuncioServiceTest {

    private AnuncioService anuncioService;

    @BeforeEach
    void setUp() {
        anuncioService = new AnuncioService();
    }

    @Test
    void testGetAnuncios() {
        List<Anuncio> anuncios = anuncioService.getAnuncios();
        assertNotNull(anuncios);
        assertFalse(anuncios.isEmpty());
    }
}
