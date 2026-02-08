package com.istlc.backend.productos_api_cbqc.producto.repository;

import com.istlc.backend.productos_api_cbqc.producto.entity.producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<producto, Long>{
}
