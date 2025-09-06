package com.mimicroservice.autor.service;

import com.mimicroservice.autor.client.Client;
import com.mimicroservice.autor.dto.LibroDTO;
import com.mimicroservice.autor.entities.Autor;
import com.mimicroservice.autor.http.response.LibrosByAutorResponse;
import com.mimicroservice.autor.persistence.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImp implements IAutorService{

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private Client client;


    @Override
    public List<Autor> findAll() {
        return (List<Autor>) autorRepository.findAll();
    }

    @Override
    public Autor findById(long id) {
        return autorRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Autor autor) {
        autorRepository.save(autor);
    }

    @Override
    public List<Autor> findByNacionalidad(String n) {
        return autorRepository.findByNacionalidad(n);
    }

    //funcion para comunicar entre los microservicios
    @Override
    public LibrosByAutorResponse findLibrosByIdAutor(long idAutor) {


        Autor autor = autorRepository.findById(idAutor).orElse(new Autor());

        List<LibroDTO> LibroDTOList = client.findAllLibroByAutor(idAutor);

        return LibrosByAutorResponse.builder()
                .nombreAutor(autor.getNombre())
                .libroDTOList(LibroDTOList)
                .build();
    }
}
