package com.istlc.backend.productos_api_cbqc.producto.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
