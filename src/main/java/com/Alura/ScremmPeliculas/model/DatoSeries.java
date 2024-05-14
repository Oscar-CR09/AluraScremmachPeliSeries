package com.Alura.ScremmPeliculas.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatoSeries(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeason") Integer totalTemporada,
        @JsonAlias("imdbRating") String evaluacion ){
}
