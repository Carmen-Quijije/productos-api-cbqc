package com.istlc.backend.productos_api_cbqc.categoria.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;


    // Constructores
    public categoria() {}

    public categoria(String nombre) { this.nombre = nombre; }

    // Getters y Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

}