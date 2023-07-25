package com.example.restaurante.dto;

public class MenuErrorDTO extends MenuDTO{

    private String message;

    //Getters y setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
