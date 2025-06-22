package com.example;

public class PaseoTuristico implements Reservable {
    private String nombre;
    private String estado; // disponible, agotado, cancelado
    private double precio;

    public PaseoTuristico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = "disponible";
    }

    public double calcularPrecio() {
        return precio;
    }

    public boolean verificarDisponibilidad() {
        return estado.equals("disponible");
    }
}
