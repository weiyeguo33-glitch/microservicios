package com.mimicroservice.autor.controller;

import com.mimicroservice.autor.entities.Autor;
import com.mimicroservice.autor.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autor")
public class AutorController {

    @Autowired
    private IAutorService autorService;

    // Obtener todos los autores
    @GetMapping
    public ResponseEntity<List<Autor>> getAllAutores() {
        return ResponseEntity.ok(autorService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutorById(@PathVariable long id) {
        Autor autor = autorService.findById(id);
        if (autor != null) {
            return ResponseEntity.ok(autor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<Autor> saveAutor(@RequestBody Autor autor) {
        autorService.save(autor);
        return ResponseEntity.ok(autor);
    }


    @GetMapping("/search/nacionalidad/{nacionalidad}")
    public ResponseEntity<List<Autor>> getAutoresByNacionalidad(@PathVariable String nacionalidad) {
        return ResponseEntity.ok(autorService.findByNacionalidad(nacionalidad));
    }

    @GetMapping("/search-libros/{idautor}")
    public ResponseEntity<?> findLibrosByIdAutor(@PathVariable long idautor){
        return ResponseEntity.ok(autorService.findLibrosByIdAutor(idautor));
    }
}
