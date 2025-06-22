package com.example;

public class EmailNotificador implements Notificador {
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Email enviado a " + usuario.getCorreo() + ": " + mensaje);
    }
}
