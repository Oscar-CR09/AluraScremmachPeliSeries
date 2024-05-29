package com.Alura.ScremmPeliculas.controler;

import com.Alura.ScremmPeliculas.dto.SerieDTO;
import com.Alura.ScremmPeliculas.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieControle {

    @Autowired
    private SerieRepository repository;
    @GetMapping("/series")
    public List<SerieDTO> obtenerTodasLasSeries(){
        return repository.findAll().stream()
                .map(s -> new SerieDTO(s.getTitulo(), s.getTotalTemporadas(),
                        s.getEvaluacion(), s.getPoster(), s.getGenero(),
                        s.getActores(),s.getSinopsis()))
                .collect(Collectors.toList());
    }

}
