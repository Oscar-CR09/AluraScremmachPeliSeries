package com.Alura.ScremmPeliculas.dto;

import com.Alura.ScremmPeliculas.model.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.jetbrains.annotations.Contract;

public record SerieDTO( Integer totalTemporadas;
         Double evaluacion,

         String poster,

         Categoria genero,

         String actores,

         String sinopsis){




}
