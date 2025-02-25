package com.example.anuncios_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.UUID;

@Data  // Genera automáticamente los getters, setters y toString()
@AllArgsConstructor  // Genera un constructor con todos los atributos
public class Anuncio {
    private UUID id;
    private String nombreVendedor;
    private double precio;
    private String modelo;
    private int año;
    private String traccion;
    private int kilometraje;
    private String color;
    private String tipoCombustible;
}
