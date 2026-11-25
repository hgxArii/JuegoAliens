package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestOjosJUnit {

    @Test
    public void testCaso1AgregarOjosAlienPequeno() {

        // CASO 1:
        // Alien de 8 cm.
        // Puede tener máximo 3 ojos.

        Alien alien = new Alien(8, "Verde");

        boolean resultado = alien.agregarOjos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroOjos());

    }

    @Test
    public void testCaso2SuperarLimiteAlienPequeno() {

        // CASO 2:
        // Alien de 8 cm.
        // Intentar agregar 4 ojos.
        // Debe rechazar la operación.

        Alien alien = new Alien(8, "Azul");

        boolean resultado = alien.agregarOjos(4);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso3AgregarOjosAlienMediano() {

        // CASO 3:
        // Alien de 15 cm.
        // Puede tener máximo 5 ojos.

        Alien alien = new Alien(15, "Rojo");

        boolean resultado = alien.agregarOjos(5);

        assertTrue(resultado);
        assertEquals(5, alien.getNumeroOjos());

    }

    @Test
    public void testCaso4SuperarLimiteAlienMediano() {

        // CASO 4:
        // Alien de 15 cm.
        // Intentar agregar 6 ojos.
        // Debe rechazar la operación.

        Alien alien = new Alien(15, "Morado");

        boolean resultado = alien.agregarOjos(6);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso5AgregarOjosAlienGrande() {

        // CASO 5:
        // Alien de 25 cm.
        // Puede tener máximo 7 ojos.

        Alien alien = new Alien(25, "Amarillo");

        boolean resultado = alien.agregarOjos(7);

        assertTrue(resultado);
        assertEquals(7, alien.getNumeroOjos());

    }

    @Test
    public void testCaso6SuperarLimiteAlienGrande() {

        // CASO 6:
        // Alien de 25 cm.
        // Intentar agregar 8 ojos.
        // Debe rechazar la operación.

        Alien alien = new Alien(25, "Negro");

        boolean resultado = alien.agregarOjos(8);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso7AgregarOjosPorPartes() {

        // CASO 7:
        // Alien de 15 cm.
        // Primero agregar 2 ojos.
        // Después agregar otros 3.
        // El total será exactamente 5 ojos.

        Alien alien = new Alien(15, "Verde");

        boolean resultado1 = alien.agregarOjos(2);
        boolean resultado2 = alien.agregarOjos(3);

        assertTrue(resultado1);
        assertTrue(resultado2);

        assertEquals(5, alien.getNumeroOjos());

    }

    @Test
    public void testCaso8SuperarLimitePorPartes() {

        // CASO 8:
        // Alien de 15 cm.
        // Primero agregar 3 ojos.
        // Después intentar agregar otros 3.
        // El total sería 6 y el máximo permitido es 5.
        // Debe conservar los 3 ojos anteriores.

        Alien alien = new Alien(15, "Azul");

        alien.agregarOjos(3);

        boolean resultado = alien.agregarOjos(3);

        assertFalse(resultado);
        assertEquals(3, alien.getNumeroOjos());

    }

}
