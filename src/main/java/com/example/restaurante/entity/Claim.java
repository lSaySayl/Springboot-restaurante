package com.example.restaurante.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "claim" )
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_order",nullable = false)
    private Long idOrder;

    @Column(name="site",nullable = false)
    private String  site;

    @Column(name="status",nullable = false)
    private String  status;

    @Column(name="reason",nullable = false)
    private String reason;

    //Constructor vacío

    public Claim() {
    }


    //Constructor con parámetros

    public Claim(Long id, Long idOrder, String site, String status, String reason) {
        this.id = id;
        this.idOrder = idOrder;
        this.site = site;
        this.status = status;
        this.reason = reason;
    }


    //Getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
