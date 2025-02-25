package com.example.anuncios_api.controller;
import com.example.anuncios_api.controller.AnuncioController;

import com.example.anuncios_api.service.AnuncioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean; // Importa @MockBean
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AnuncioController.class)
class AnuncioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Simula el bean del servicio para que se pueda inyectar en el controlador
    @MockBean
    private AnuncioService anuncioService;

    @Test
    void getAnuncios_shouldReturnOk() throws Exception {
        mockMvc.perform(get("/api/anuncios"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));
    }
}
