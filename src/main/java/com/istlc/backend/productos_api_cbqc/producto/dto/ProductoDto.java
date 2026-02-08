package com.istlc.backend.productos_api_cbqc.producto.dto;

import java.util.Set;
import java.math.BigDecimal;

public class ProductoDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Boolean activo;
    private Set<String> categorias;

    public ProductoDto() {
    }

    public ProductoDto(Long id, String nombre, String descripcion, BigDecimal precio, Boolean activo, Set<String> categorias) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
        this.categorias = categorias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Set<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<String> categorias) {
        this.categorias = categorias;
    }
}
