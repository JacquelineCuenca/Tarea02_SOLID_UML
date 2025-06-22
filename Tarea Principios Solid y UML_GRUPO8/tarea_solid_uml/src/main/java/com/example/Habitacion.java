package com.example;

public class Habitacion {
    private String tipo;
    private String estado; // disponible, reservada, ocupada, mantenimiento

    public Habitacion(String tipo) {
        this.tipo = tipo;
        this.estado = "disponible";
    }

    public boolean estaDisponible() {
        return estado.equals("disponible");
    }

    public void reservar() {
        this.estado = "reservada";
    }
}
