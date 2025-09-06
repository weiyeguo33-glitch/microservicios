package com.mimicroservice.libro.service;

import com.mimicroservice.libro.entities.Libro;

import java.util.List;

public interface ILibroService {

    List<Libro> findAll();
    Libro findById(long id);
    void saveLibro(Libro libro);
    void deleteById(long id);
    List<Libro> findByGenero(String genero);
    List<Libro>findAllByAutorId(long autorId);

}
