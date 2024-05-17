package com.Alura.ScremmPeliculas.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres  = Arrays.asList("Brenda","Luis","Mariafernanda", "Genesys");
        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n -> n.startsWith("G"))
                .map(n ->n.toUpperCase())
                .forEach(System.out::println);
    }
}
