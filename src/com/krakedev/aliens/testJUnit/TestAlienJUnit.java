package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnit {

    @Test
    public void testCaso1AsignacionAtributos() {

        // CASO 1: Validar los atributos iniciales.

        Alien alien = new Alien(15, "Verde");

        assertEquals(15, alien.getTamanio());
        assertEquals("Verde", alien.getColor());

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso2TamanioMenorAlMinimo() {

        // CASO 2: El tamaño debe ajustarse a 5.

        Alien alien = new Alien(3, "Azul");

        assertEquals(5, alien.getTamanio());

    }

    @Test
    public void testCaso3TamanioMayorAlMaximo() {

        // CASO 3: El tamaño debe ajustarse a 30.

        Alien alien = new Alien(35, "Rojo");

        assertEquals(30, alien.getTamanio());

    }

    @Test
    public void testCaso4LimitesExactos() {

        // CASO 4: Validar los límites de 5 y 30.

        Alien alienMinimo = new Alien(5, "Verde");
        Alien alienMaximo = new Alien(30, "Azul");

        assertEquals(5, alienMinimo.getTamanio());
        assertEquals(30, alienMaximo.getTamanio());

    }

    @Test
    public void testCaso5CalculoPrecios() {

        // CASO 5: Comprobar los precios para tamaño 15.

        Alien alien = new Alien(15, "Verde");

        assertEquals(3.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(1.50, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.75, alien.getPrecioOjo(), 0.0001);

    }

}