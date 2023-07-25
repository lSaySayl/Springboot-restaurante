package com.example.restaurante.entity;

import jakarta.persistence.*;

@Entity
//Anotaciones
@Table(name = "menu")
public class Menu {

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rol" , nullable = false)
    private char rol;

    @Column(name = "name" , nullable = false)
    private Integer name;

    @Column(name = "price" , nullable = false)
    private String price;

    @Column(name = "description" , nullable = false)
    private String description;

    @Column(name = "url" , nullable = false)
    private String url;

    @Column(name = "category" , nullable = false)
    private String category;

    private boolean status;

    private String site;

    private double preparationTime;

    @Transient //No se va a guardar en la base de datos
    private String message;

    //Constructor vacío

    public Menu() {
    }

    //Constructor con parámetros


    public Menu(Long id, char rol, Integer name, String price, String description, String url, String category, boolean status, String site, double preparationTime, String message) {
        this.id = id;
        this.rol = rol;
        this.name = name;
        this.price = price;
        this.description = description;
        this.url = url;
        this.category = category;
        this.status = status;
        this.site = site;
        this.preparationTime = preparationTime;
        this.message = message;
    }

    //Getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
