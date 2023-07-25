package com.example.restaurante.maps;

import com.example.restaurante.dto.response.OrderResponseDTO;
import com.example.restaurante.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMaps {
    @Mappings( {
            @Mapping(source="menus",target = "menus"),
            @Mapping(source="status",target = "status")
    })

    public OrderResponseDTO toOrderResponseDTO(Order order);

    public List<OrderResponseDTO> toOrderResponseDTOS(List<Order> orders);
}
