package com.Alura.ScremmPeliculas.repository;

import com.Alura.ScremmPeliculas.model.Categoria;
import com.Alura.ScremmPeliculas.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie,Long> {
    List<Serie> findTop5ByOrderByEvaluacionDesc();

    List<Serie> findByGenero(Categoria categoria);


}
