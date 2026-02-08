package com.istlc.backend.productos_api_cbqc.categoria.repository;

import com.istlc.backend.productos_api_cbqc.categoria.entity.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<categoria, Long> {
    Optional<categoria> findByNombre(String nombre);
}