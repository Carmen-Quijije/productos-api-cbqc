package com.istlc.backend.productos_api_cbqc.producto.controller;

import com.istlc.backend.productos_api_cbqc.producto.dto.ProductoCreateDto;
import com.istlc.backend.productos_api_cbqc.producto.dto.ProductoDto;
import com.istlc.backend.productos_api_cbqc.producto.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProductoDto> crear(@Valid @RequestBody ProductoCreateDto dto) {
        return new ResponseEntity<>(service.crear(dto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductoDto>> list() {
        return ResponseEntity.ok(service.listarTodo());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDto> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

}
