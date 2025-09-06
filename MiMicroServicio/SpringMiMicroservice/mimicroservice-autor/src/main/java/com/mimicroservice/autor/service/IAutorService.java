package com.mimicroservice.autor.service;

import com.mimicroservice.autor.entities.Autor;
import com.mimicroservice.autor.http.response.LibrosByAutorResponse;

import java.util.List;

public interface IAutorService {

    List<Autor> findAll();

    Autor findById(long id);

    void save(Autor autor);

    List<Autor> findByNacionalidad(String nacionalidad);

    LibrosByAutorResponse findLibrosByIdAutor(long idAutor);
}
