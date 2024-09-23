package com.aluracursos.desafio.principal;

import com.aluracursos.desafio.model.Datos;
import com.aluracursos.desafio.model.DatosLibros;
import com.aluracursos.desafio.service.ConsumoApi;
import com.aluracursos.desafio.service.ConvierteDatos;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private static final String URL_BASE= "https://gutendex.com/books/";

    private ConsumoApi consumoApi = new ConsumoApi();

    private ConvierteDatos conversor = new ConvierteDatos();

    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu(){

        var json = consumoApi.obtenerDatos(URL_BASE);

       // System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);
        //System.out.println(datos);

        //top 10 de libros con mayor numero de descargas
        System.out.println("Top 10 Libros mas descargados");

        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDeDescargas).reversed())
                .map(l -> l.titulo().toUpperCase())
                .limit(10)
                .forEach(System.out::println);

        //Busqueda de libro por nomre

        System.out.println("escribe el nombre del libro a buscar: ");
        var tituloLibro = teclado.nextLine();

        json = consumoApi.obtenerDatos(URL_BASE + "?Search="+ tituloLibro.replace(" ", "+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        //uso del optional
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();
        if (libroBuscado.isPresent()){
            System.out.println("Libro encontrado");
            System.out.println(libroBuscado.get());
        }else {
            System.out.println("Libro no encontrado");
        }

        //trabajndo cn estadistics

        DoubleSummaryStatistics est = datosBusqueda.resultados().stream()
                .filter(n -> n.numeroDeDescargas() > 0)
                .collect(Collectors.summarizingDouble(DatosLibros::numeroDeDescargas));
        System.out.println("Cantidad Media de Descargas: "+ est.getAverage());
        System.out.println("Cantidad Maxima de Descargas: "+ est.getMax());
    }
}

