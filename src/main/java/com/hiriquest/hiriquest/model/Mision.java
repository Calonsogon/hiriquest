package com.hiriquest.hiriquest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "misiones")
public class Mision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    
    private String nombre;
    private String descripcion;
    private int distancia;
    private int numeroLocalizaciones;
    private int tiempoEstimado;
    private String fotoMapa;
    private int recompensa;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getNumeroLocalizaciones() {
        return numeroLocalizaciones;
    }

    public void setNumeroLocalizaciones(int numeroLocalizaciones) {
        this.numeroLocalizaciones = numeroLocalizaciones;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getFotoMapa() {
        return fotoMapa;
    }

    public void setFotoMapa(String fotoMapa) {
        this.fotoMapa = fotoMapa;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
}
