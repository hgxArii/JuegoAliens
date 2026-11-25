package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

    public static void main(String[] args) {

        // CASO 1:
        // Crear un alien con tamaño válido de 15 cm.

        Alien alien1 = new Alien(15, "Verde");

        System.out.println("----- ALIEN 1 -----");
        alien1.imprimir();

        // CASO 2:
        // Crear un alien con tamaño menor al mínimo.
        // El tamaño debe ajustarse automáticamente a 5 cm.

        Alien alien2 = new Alien(3, "Azul");

        System.out.println("----- ALIEN 2 -----");
        alien2.imprimir();

        // CASO 3:
        // Crear un alien con tamaño mayor al máximo.
        // El tamaño debe ajustarse automáticamente a 30 cm.

        Alien alien3 = new Alien(35, "Rojo");

        System.out.println("----- ALIEN 3 -----");
        alien3.imprimir();

    }

}