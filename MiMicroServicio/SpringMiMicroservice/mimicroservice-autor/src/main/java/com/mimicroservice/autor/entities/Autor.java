package com.mimicroservice.autor.entities;

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
@Table(name = "autor")

//constructores
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long autor_id;
    private String nombre;


    private String nacionalidad;

    private LocalDate fecha_Nacimiento;

    private String genero_Literario;

}
