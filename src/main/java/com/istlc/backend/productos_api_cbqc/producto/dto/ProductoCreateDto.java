package com.istlc.backend.productos_api_cbqc.producto.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Set;

public class ProductoCreateDto {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    private String descripcion;

    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser mayor a 0")
    private BigDecimal precio;

    @NotNull(message = "El estado activo es obligatorio")
    private Boolean activo;

    private Set<String> categorias;

    public ProductoCreateDto() {
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
