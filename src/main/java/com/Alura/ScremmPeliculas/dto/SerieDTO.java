package com.Alura.ScremmPeliculas.dto;

import com.Alura.ScremmPeliculas.model.Categoria;


public record SerieDTO(String titulo, Integer totalTemporadas,

                       Double evaluacion,

                       String poster,

                       Categoria genero,

                       String actores,

                       String sinopsis){

}
