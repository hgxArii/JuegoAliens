package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnit {

    @Test
    public void testCaso1AsignacionAtributos() {

        // CASO 1:
        // Validar que el constructor asigne correctamente
        // el tamaño, color y los valores iniciales.

        Alien alien = new Alien(15, "Verde");

        assertEquals(15, alien.getTamanio());
        assertEquals("Verde", alien.getColor());

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso2TamanioMenorAlMinimo() {

        // CASO 2:
        // Si el tamaño es menor a 5 cm,
        // debe ajustarse automáticamente a 5 cm.

        Alien alien = new Alien(3, "Azul");

        assertEquals(5, alien.getTamanio());

    }

    @Test
    public void testCaso3TamanioMayorAlMaximo() {

        // CASO 3:
        // Si el tamaño supera los 30 cm,
        // debe ajustarse automáticamente a 30 cm.

        Alien alien = new Alien(35, "Rojo");

        assertEquals(30, alien.getTamanio());

    }

    @Test
    public void testCaso4TamanioMinimoYMaximo() {

        // CASO 4:
        // Validar que se acepten correctamente
        // los límites exactos de 5 y 30 cm.

        Alien alienMinimo = new Alien(5, "Verde");
        Alien alienMaximo = new Alien(30, "Azul");

        assertEquals(5, alienMinimo.getTamanio());
        assertEquals(30, alienMaximo.getTamanio());

    }

    @Test
    public void testCaso5CalculoDePrecios() {

        // CASO 5:
        // Para un alien de 15 cm:
        // Cuerpo = 3.00
        // Extremidad = 1.50
        // Ojo = 0.75

        Alien alien = new Alien(15, "Verde");

        assertEquals(3.00, alien.getPrecioCuerpo(), 0.0001);
        assertEquals(1.50, alien.getPrecioExtremidad(), 0.0001);
        assertEquals(0.75, alien.getPrecioOjo(), 0.0001);

    }

}
