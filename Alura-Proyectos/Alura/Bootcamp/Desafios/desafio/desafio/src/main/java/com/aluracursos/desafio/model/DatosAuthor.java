package com.aluracursos.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAuthor(
        @JsonAlias("name")String nombre,
        @JsonAlias("bird_year")String fechaNacimiento
) {
}
