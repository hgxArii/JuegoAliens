package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestOjosJUnit {

    @Test
    public void testCaso1AlienPequeno() {

        // CASO 1: Alien de 8 cm, máximo 3 ojos.

        Alien alien = new Alien(8, "Verde");

        boolean resultado = alien.agregarOjos(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroOjos());

    }

    @Test
    public void testCaso2SuperarLimitePequeno() {

        // CASO 2: Intentar agregar 4 ojos.

        Alien alien = new Alien(8, "Azul");

        boolean resultado = alien.agregarOjos(4);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso3AlienMediano() {

        // CASO 3: Alien de 15 cm, máximo 5 ojos.

        Alien alien = new Alien(15, "Rojo");

        boolean resultado = alien.agregarOjos(5);

        assertTrue(resultado);
        assertEquals(5, alien.getNumeroOjos());

    }

    @Test
    public void testCaso4SuperarLimiteMediano() {

        // CASO 4: Intentar agregar 6 ojos.

        Alien alien = new Alien(15, "Morado");

        boolean resultado = alien.agregarOjos(6);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso5AlienGrande() {

        // CASO 5: Alien de 25 cm, máximo 7 ojos.

        Alien alien = new Alien(25, "Amarillo");

        boolean resultado = alien.agregarOjos(7);

        assertTrue(resultado);
        assertEquals(7, alien.getNumeroOjos());

    }

    @Test
    public void testCaso6SuperarLimiteGrande() {

        // CASO 6: Intentar agregar 8 ojos.

        Alien alien = new Alien(25, "Negro");

        boolean resultado = alien.agregarOjos(8);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroOjos());

    }

    @Test
    public void testCaso7AgregarOjosPorPartes() {

        // CASO 7: Agregar 2 ojos y después otros 3.

        Alien alien = new Alien(15, "Verde");

        boolean resultado1 = alien.agregarOjos(2);
        boolean resultado2 = alien.agregarOjos(3);

        assertTrue(resultado1);
        assertTrue(resultado2);

        assertEquals(5, alien.getNumeroOjos());

    }

    @Test
    public void testCaso8SuperarLimitePorPartes() {

        // CASO 8: Agregar 3 ojos e intentar agregar otros 3.

        Alien alien = new Alien(15, "Azul");

        alien.agregarOjos(3);

        boolean resultado = alien.agregarOjos(3);

        assertFalse(resultado);
        assertEquals(3, alien.getNumeroOjos());

    }

}