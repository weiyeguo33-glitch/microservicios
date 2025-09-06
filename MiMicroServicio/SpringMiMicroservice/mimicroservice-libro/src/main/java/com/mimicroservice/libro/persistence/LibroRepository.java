package com.mimicroservice.libro.persistence;

import com.mimicroservice.libro.entities.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends CrudRepository<Libro,Long> {

    List<Libro> findAllByGenero(String genero);      // filtra por género
    List<Libro> findAllByAutorId(long autorId);


}
