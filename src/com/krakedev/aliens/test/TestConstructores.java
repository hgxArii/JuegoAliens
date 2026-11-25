package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

    public static void main(String[] args) {

        // CASO 1: Alien con tamaño válido

        Alien alien1 = new Alien(15, "Verde");

        System.out.println("----- CASO 1 -----");
        alien1.imprimir();

        // CASO 2: Tamaño menor al mínimo

        Alien alien2 = new Alien(3, "Azul");

        System.out.println("----- CASO 2 -----");
        alien2.imprimir();

        // CASO 3: Tamaño mayor al máximo

        Alien alien3 = new Alien(35, "Rojo");

        System.out.println("----- CASO 3 -----");
        alien3.imprimir();

    }

}