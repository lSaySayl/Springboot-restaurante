package com.example.restaurante.dto.error;

import com.example.restaurante.dto.general.MenuDTO;

public class MenuErrorDTO extends MenuDTO {

    private String message;

    //Getters y setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
