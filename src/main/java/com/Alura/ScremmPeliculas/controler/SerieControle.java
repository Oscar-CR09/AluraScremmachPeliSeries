package com.Alura.ScremmPeliculas.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieControle {
    @GetMapping("/series")
    public String mostrarMensaje(){
        return "Este es mi primer mensaje en mi appWeb";
    }

}
