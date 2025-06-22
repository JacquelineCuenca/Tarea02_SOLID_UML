package com.example;


public class AgenteDeSoporte {

    private int id;
    private String nombre;

    public AgenteDeSoporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void gestionarIncidente(Incidente incidente, GestorDeAccion gestorDeAccion) {
        System.out.println("Gestionando incidente de: " + incidente.getDescripcion());

        incidente.setEstado(EstadoIncidente.EN_PROCESO);
        System.out.println("Incidente en proceso");

         String accion = gestorDeAccion.obtenerAccion(incidente);

        switch (accion) {
            case "resolver":
                incidente.resolverIncidente();
                break;
            case "escalar":
                incidente.escalar();
                break;
            default:
                System.out.println("Acción no válida.");
        }
    }
}
