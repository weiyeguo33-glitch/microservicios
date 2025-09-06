package com.mimicroservice.autor.client;


import com.mimicroservice.autor.dto.LibroDTO;
import com.mimicroservice.autor.service.AutorServiceImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Llamamos al otro microservicio
@FeignClient(name = "mimicroservice-libro",url = "localhost:8085/api/libro")
public interface Client {

    @GetMapping("/search-by-autor/{idAutor}")
    List<LibroDTO> findAllLibroByAutor(@PathVariable long idAutor);
}
