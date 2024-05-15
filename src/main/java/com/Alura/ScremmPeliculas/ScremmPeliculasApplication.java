package com.Alura.ScremmPeliculas;

import com.Alura.ScremmPeliculas.model.DatoSeries;
import com.Alura.ScremmPeliculas.model.DatosEpisodio;
import com.Alura.ScremmPeliculas.service.ConsumoAPI;
import com.Alura.ScremmPeliculas.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScremmPeliculasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScremmPeliculasApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primer proyecto Spring sin Web");
		var consumoApi = new ConsumoAPI();
		//var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&apikey=4fc7c187");
		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&&apikey=4fc7c187");


		System.out.println(json);
//		json = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);
		ConvierteDatos conversor = new ConvierteDatos();
		DatoSeries datos = conversor.obtenerDatos(json, DatoSeries.class);
		System.out.println(datos);
		json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=4fc7c187");
		DatosEpisodio episodios =conversor.obtenerDatos(json, DatosEpisodio.class);
		System.out.println(episodios);

	}
}
