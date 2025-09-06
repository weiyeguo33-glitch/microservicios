package com.mimicroservice.libro.controller;

import com.mimicroservice.autor.service.IAutorService;
import com.mimicroservice.libro.entities.Libro;
import com.mimicroservice.libro.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private ILibroService libroService;

    // Obtener todos los libros
    @GetMapping
    public ResponseEntity<List<Libro>> findAll() {
        return ResponseEntity.ok(libroService.findAll());
    }

    // Buscar libro por id
    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable long id) {
        Libro libro = libroService.findById(id);
        if (libro != null) {
            return ResponseEntity.ok(libro);
        }
        return ResponseEntity.notFound().build();
    }

    // Crear un nuevo libro
    @PostMapping
    public ResponseEntity<Libro> saveLibro(@RequestBody Libro libro) {
        libroService.saveLibro(libro);
        return ResponseEntity.ok(libro);
    }

    // Eliminar libro por id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        libroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar libros por género
    @GetMapping("/genero/{genero}")
    public ResponseEntity<List<Libro>> findByGenero(@PathVariable String genero) {
        return ResponseEntity.ok(libroService.findByGenero(genero));
    }



    @GetMapping("/search-by-autor/{id_Autor}")
    public ResponseEntity<?> findByIdAutor(@PathVariable Long id_Autor){
        return ResponseEntity.ok(libroService.findAllByAutorId(id_Autor));
    }


}
