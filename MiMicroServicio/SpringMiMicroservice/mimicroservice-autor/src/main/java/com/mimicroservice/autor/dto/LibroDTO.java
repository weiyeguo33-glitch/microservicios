package com.mimicroservice.autor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//Contenedor donde se guarda lo que devuelve el microservicio de libros
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

    private String titulo;

    private String genero;

    private LocalDate fechaPublicacion;

    private int paginas;

    private String editorial;

    private long autorid;
}
