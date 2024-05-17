package com.Alura.ScremmPeliculas.principal;

import com.Alura.ScremmPeliculas.model.DatoSeries;
import com.Alura.ScremmPeliculas.model.DatosEpisodio;
import com.Alura.ScremmPeliculas.model.DatosTemporada;
import com.Alura.ScremmPeliculas.service.ConsumoAPI;
import com.Alura.ScremmPeliculas.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=4fc7c187";
    private ConvierteDatos conversor =new ConvierteDatos();

    public void muestraElMenu(){
        System.out.println("Por favor escribe el nombre de la serie que desea buscar");
        //Busca los datos generales de las series

        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreSerie.replace(" " , "+")+API_KEY);
        var datos = conversor.obtenerDatos(json, DatoSeries.class);
        System.out.println(datos);

        // busca todos los datos de las temporadas

        List<DatosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <datos.totalTemporada() ; i++) {
            json = consumoApi.obtenerDatos(URL_BASE+nombreSerie.replace("","+")+"&Season="+i+API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json,DatosTemporada.class);
            temporadas.add(datosTemporadas);

        }
       // temporadas.forEach(System.out::println);

//        //mostrar solo el titulo de los  episodios de las temporadas
//        for (int i = 0; i < datos.totalTemporada(); i++) {
//            List<DatosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size(); j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//
//            }
//        }
        temporadas.forEach(t-> t.episodios().forEach(e -> System.out.println(e.titulo())));
    }
}
