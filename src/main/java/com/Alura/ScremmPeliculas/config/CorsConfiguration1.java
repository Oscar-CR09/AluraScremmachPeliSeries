package com.Alura.ScremmPeliculas.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public interface CorsConfiguration1 extends WebMvcConfigurer {
    void addCorsMapping(CorsRegistry registry);
}
