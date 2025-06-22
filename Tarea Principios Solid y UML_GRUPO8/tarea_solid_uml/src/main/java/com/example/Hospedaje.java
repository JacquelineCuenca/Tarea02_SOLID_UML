package com.example;

public class Hospedaje implements Reservable {
    private Habitacion habitacion;
    private double precio;

    public Hospedaje(Habitacion habitacion, double precio) {
        this.habitacion = habitacion;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }

    public boolean verificarDisponibilidad() {
        return habitacion.estaDisponible();
    }

    public void bloquear() {
        habitacion.reservar();
    }
}
