package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienAI {

    @Test
    public void testCaso1AlienValido() {

        // CASO 1: Crear un Alien con datos válidos.

        Alien alien = new Alien(20, "Morado");

        assertEquals(20, alien.getTamanio());
        assertEquals("Morado", alien.getColor());

    }

    @Test
    public void testCaso2TamanioMinimo() {

        // CASO 2: Ajustar tamaño a 5.

        Alien alien = new Alien(1, "Azul");

        assertEquals(5, alien.getTamanio());

        assertEquals(1.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(0.50, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.25, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso3TamanioMaximo() {

        // CASO 3: Ajustar tamaño a 30.

        Alien alien = new Alien(50, "Rojo");

        assertEquals(30, alien.getTamanio());

        assertEquals(6.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(3.00, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(1.50, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso4PreciosTamanioIntermedio() {

        // CASO 4: Comprobar precios para tamaño 10.

        Alien alien = new Alien(10, "Verde");

        assertEquals(2.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(1.00, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.50, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso5Limites() {

        // CASO 5: Comprobar límites exactos.

        Alien minimo = new Alien(5, "Amarillo");
        Alien maximo = new Alien(30, "Negro");

        assertEquals(5, minimo.getTamanio());
        assertEquals(30, maximo.getTamanio());

    }

}