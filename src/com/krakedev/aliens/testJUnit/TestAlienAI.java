package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienAI {

    @Test
    public void testCaso1AlienConDatosValidos() {

        // CASO 1:
        // Crear un alien con tamaño y color válidos.
        // Comprobar sus atributos y valores iniciales.

        Alien alien = new Alien(20, "Morado");

        assertEquals(20, alien.getTamanio());
        assertEquals("Morado", alien.getColor());

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso2TamanioInferiorAlLimite() {

        // CASO 2:
        // Ingresar un tamaño de 1 cm.
        // El tamaño final debe ser 5 cm.

        Alien alien = new Alien(1, "Azul");

        assertEquals(5, alien.getTamanio());

        assertEquals(1.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(0.50, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.25, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso3TamanioSuperiorAlLimite() {

        // CASO 3:
        // Ingresar un tamaño de 50 cm.
        // El tamaño final debe ser 30 cm.

        Alien alien = new Alien(50, "Rojo");

        assertEquals(30, alien.getTamanio());

        assertEquals(6.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(3.00, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(1.50, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso4CalculoDePreciosTamanioIntermedio() {

        // CASO 4:
        // Crear un alien de 10 cm.
        // Verificar los tres precios calculados.

        Alien alien = new Alien(10, "Verde");

        assertEquals(2.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(1.00, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.50, alien.getPrecioOjo(), 0.0001);

    }

    @Test
    public void testCaso5LimitesExactos() {

        // CASO 5:
        // Verificar los tamaños exactos de 5 y 30 cm.
        // Ambos deben mantenerse sin modificaciones.

        Alien alienMinimo = new Alien(5, "Amarillo");
        Alien alienMaximo = new Alien(30, "Negro");

        assertEquals(5, alienMinimo.getTamanio());
        assertEquals(30, alienMaximo.getTamanio());

    }

}
