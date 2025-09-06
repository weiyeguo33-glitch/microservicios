package com.mimicroservice.autor.persistence;

import com.mimicroservice.autor.entities.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends CrudRepository<Autor,Long>  {

    List<Autor> findByNacionalidad(String nacionalidad);
}
