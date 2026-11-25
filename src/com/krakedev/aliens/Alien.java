package com.krakedev.aliens;

public class Alien {

    private int tamanio;
    private String color;
    private int numeroOjos;
    private int numeroBrazos;
    private int numeroPies;
    private double precioExtremidad;
    private double precioOjo;
    private double precioCuerpo;

    public Alien(int tamanio, String color) {

        if (tamanio < 5) {
            this.tamanio = 5;
        } else if (tamanio > 30) {
            this.tamanio = 30;
        } else {
            this.tamanio = tamanio;
        }

        this.color = color;

        this.numeroOjos = 0;
        this.numeroBrazos = 0;
        this.numeroPies = 0;

        this.precioCuerpo = this.tamanio * 0.20;
        this.precioExtremidad = this.tamanio * 0.10;
        this.precioOjo = this.tamanio * 0.05;
    }

    public int getTamanio() {
        return tamanio;
    }
    public String getColor() {
        return color;
    }
    public int getNumeroOjos() {
        return numeroOjos;
    }
    public int getNumeroBrazos() {
        return numeroBrazos;
    }
    public int getNumeroPies() {
        return numeroPies;
    }
    public double getPrecioExtremidad() {
        return precioExtremidad;
    }
    public double getPrecioOjo() {
        return precioOjo;
    }
    public double getPrecioCuerpo() {
        return precioCuerpo;
    }
    public void imprimir() {

        String mensaje;

        mensaje = "Tamaño: " + tamanio
                + " cm, Color: " + color
                + ", Número de ojos: " + numeroOjos
                + ", Número de brazos: " + numeroBrazos
                + ", Número de pies: " + numeroPies
                + ", Precio de extremidad: " + precioExtremidad
                + ", Precio de ojo: " + precioOjo
                + ", Precio del cuerpo: " + precioCuerpo;

        System.out.println(mensaje);

    }

}
