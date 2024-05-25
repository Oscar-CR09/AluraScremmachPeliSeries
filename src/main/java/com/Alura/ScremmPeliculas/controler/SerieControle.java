package com.Alura.ScremmPeliculas.controler;

import com.Alura.ScremmPeliculas.model.Serie;
import com.Alura.ScremmPeliculas.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieControle {

    @Autowired
    private SerieRepository repository;
    @GetMapping("/series")
    public List<Serie> obtenerTodasLasSeries(){
        return repository.findAll();
    }

}
