package com.Alura.ScremmPeliculas.controler;

import com.Alura.ScremmPeliculas.dto.SerieDTO;
import com.Alura.ScremmPeliculas.repository.SerieRepository;
import com.Alura.ScremmPeliculas.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieControle {

    @Autowired
    private SerieService servicio;

    @GetMapping("/series")
    public List<SerieDTO> obtenerTodasLasSeries(){
        return servicio.obtenerTodasLasSeries();

    }
    @GetMapping("/series/top5")
    public List<SerieDTO> obtenerTop5(){
        return servicio.obtenerTop5();

    }

}
