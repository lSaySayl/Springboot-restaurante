package com.example.restaurante.maps;

import com.example.restaurante.dto.error.MenuErrorDTO;
import com.example.restaurante.dto.response.MenuResponseDTO;
import com.example.restaurante.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMaps {

    //Recibimos entidad y convertimos en DTO.

    //SOURCE: Entidad, como se llama - Target: CONVIERTE (Estos son los nombres que están en mi responeDTO)
    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "url", target = "url"),
            @Mapping(source = "description",target = "description"),
            @Mapping(source = "category",target="category")

    })



    public MenuResponseDTO toMenuResponseDTO(Menu menu);

    //Recibimos nuestra lista de menu y la convertimos en DTOS.
    public List<MenuResponseDTO> toMenuResponseDTO(List<Menu> menu);



  /*  @Mappings({
            @Mapping(source="message", target = "message")
    })

    public MenuErrorDTO toMenuErrorDTO(Menu menu);

    */
}
