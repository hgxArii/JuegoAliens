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
    private double precioTotal;

    // CONSTRUCTOR
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

        this.precioTotal = 0;

    }

    // GETTERS

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

    public double getPrecioTotal() {
        return precioTotal;
    }

    // AGREGAR BRAZOS

    public boolean agregarBrazos(int cantidad) {

        if (cantidad <= 0 ||
            numeroBrazos + numeroPies + cantidad > 10) {

            return false;

        } else {

            numeroBrazos = numeroBrazos + cantidad;

            calcularPrecioTotal();

            return true;

        }

    }

    // AGREGAR PIERNAS

    public boolean agregarPiernas(int cantidad) {

        if (cantidad <= 0 ||
            numeroBrazos + numeroPies + cantidad > 10) {

            return false;

        } else {

            numeroPies = numeroPies + cantidad;

            calcularPrecioTotal();

            return true;

        }

    }

    // AGREGAR OJOS

    public boolean agregarOjos(int cantidad) {

        int maximoOjos;

        if (tamanio >= 5 && tamanio <= 10) {

            maximoOjos = 3;

        } else if (tamanio > 10 && tamanio <= 20) {

            maximoOjos = 5;

        } else {

            maximoOjos = 7;

        }

        if (cantidad <= 0 ||
            numeroOjos + cantidad > maximoOjos) {

            return false;

        } else {

            numeroOjos = numeroOjos + cantidad;

            calcularPrecioTotal();

            return true;

        }

    }

    // CALCULAR PRECIO TOTAL

    public void calcularPrecioTotal() {

        precioTotal = precioCuerpo
                + ((numeroBrazos + numeroPies) * precioExtremidad)
                + (numeroOjos * precioOjo);

    }

    // IMPRIMIR DATOS

    public void imprimir() {

        String mensaje;

        mensaje = "Tamaño: " + tamanio
                + " cm, Color: " + color
                + ", Número de ojos: " + numeroOjos
                + ", Número de brazos: " + numeroBrazos
                + ", Número de pies: " + numeroPies
                + ", Precio de extremidad: " + precioExtremidad
                + ", Precio de ojo: " + precioOjo
                + ", Precio del cuerpo: " + precioCuerpo
                + ", Precio total: " + precioTotal;

        System.out.println(mensaje);

    }

}
