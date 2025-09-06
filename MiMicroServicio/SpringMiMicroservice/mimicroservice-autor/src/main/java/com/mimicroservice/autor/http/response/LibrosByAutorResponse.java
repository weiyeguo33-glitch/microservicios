package com.mimicroservice.autor.http.response;

import com.mimicroservice.autor.dto.LibroDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//La  respuesta que se va a devolver de la respuesta de la interaccion entre microservicios
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LibrosByAutorResponse {

    private String nombreAutor;
    private List<LibroDTO> libroDTOList;

}
