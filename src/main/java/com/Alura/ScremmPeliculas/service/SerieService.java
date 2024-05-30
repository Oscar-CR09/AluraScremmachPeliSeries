package com.Alura.ScremmPeliculas.service;

import com.Alura.ScremmPeliculas.dto.SerieDTO;
import com.Alura.ScremmPeliculas.model.Serie;
import com.Alura.ScremmPeliculas.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public List<SerieDTO> obtenerTodasLasSeries(){
        return convierteDatos(repository.findAll());
    }

    public List<SerieDTO> obtenerTop5() {
        return convierteDatos(repository.findTop5ByOrderByEvaluacionDesc());
    }

    public List<SerieDTO> convierteDatos(List<Serie> series){
        return series.stream()
                .map(s -> new SerieDTO(s.getTitulo(), s.getTotalTemporadas(),
                        s.getEvaluacion(), s.getPoster(), s.getGenero(),
                        s.getActores(),s.getSinopsis()))
                .collect(Collectors.toList());
    }

}

