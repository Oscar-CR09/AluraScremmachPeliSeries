package com.Alura.ScremmPeliculas;

import com.Alura.ScremmPeliculas.model.DatoSeries;
import com.Alura.ScremmPeliculas.model.DatosEpisodio;
import com.Alura.ScremmPeliculas.model.DatosTemporada;
import com.Alura.ScremmPeliculas.principal.EjemploStreams;
import com.Alura.ScremmPeliculas.principal.Principal;
import com.Alura.ScremmPeliculas.service.ConsumoAPI;
import com.Alura.ScremmPeliculas.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScremmPeliculasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScremmPeliculasApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
//		Principal principal = new Principal();
//		principal.muestraElMenu();
//<
		EjemploStreams ejemploStreams = new EjemploStreams();
		ejemploStreams.muestraEjemplo();
	}
}
