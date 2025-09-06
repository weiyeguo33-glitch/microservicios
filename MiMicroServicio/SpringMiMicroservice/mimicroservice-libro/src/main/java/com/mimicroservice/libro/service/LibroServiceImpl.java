package com.mimicroservice.libro.service;

import com.mimicroservice.libro.entities.Libro;
import com.mimicroservice.libro.persistence.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements ILibroService{

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return (List<Libro>) libroRepository.findAll();
    }

    @Override
    public Libro findById(long id) {
        return libroRepository.findById(id).orElseThrow();
    }

    @Override
    public void saveLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public void deleteById(long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public List<Libro> findByGenero(String genero) {
        return libroRepository.findAllByGenero(genero);
    }

    @Override
    public List<Libro> findAllByAutorId(long autorId) {
        return libroRepository.findAllByAutorId(autorId);
    }
}
