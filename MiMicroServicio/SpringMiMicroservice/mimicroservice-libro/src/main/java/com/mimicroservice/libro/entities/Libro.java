package com.mimicroservice.libro.entities;

import com.mimicroservice.autor.entities.Autor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//Getters y Setters
@Data

//Le explica a hibernate que este model es algo de la base de datos para poder hacer cruds sin paranoias
@Entity
@Builder

//referencia a la tabla de la base de datos
@Table(name = "libro")

//constructores
@AllArgsConstructor
@NoArgsConstructor

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String genero;

    private LocalDate fechaPublicacion;

    private int paginas;

    private String editorial;

    private long autorId;
}
