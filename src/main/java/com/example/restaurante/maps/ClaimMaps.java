package com.example.restaurante.maps;

import com.example.restaurante.dto.response.ClaimResponseDTO;
import com.example.restaurante.entity.Claim;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClaimMaps {

    @Mappings({
            @Mapping(source="idOrder",target = "idOrder"),
            @Mapping(source="status",target = "status"),
            @Mapping(source="reason",target = "reason")

    })

    public ClaimResponseDTO toClaimResponseDTO(Claim claim);

    public List <ClaimResponseDTO> toClaimResponseDTO(List<Claim> claim);


}
