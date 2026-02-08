package com.istlc.backend.productos_api_cbqc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        // Con esta clase puedo consumir otros microservicios http desde cualquier
        // parte del proyecto
        return new RestTemplate();
    }
}