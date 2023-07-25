package com.example.restaurante.dto.response;

import java.util.List;

public class OrderResponseDTO {

    private List<MenuResponseDTO> menus;

    private String status;


    //Getters y setters

    public List<MenuResponseDTO> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuResponseDTO> menus) {
        this.menus = menus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
