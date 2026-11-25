package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnit {

    @Test
    public void testCaso1AgregarBrazos() {

        // CASO 1: Agregar 4 brazos.

        Alien alien = new Alien(15, "Verde");

        boolean resultado = alien.agregarBrazos(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroBrazos());

    }

    @Test
    public void testCaso2AgregarPiernas() {

        // CASO 2: Agregar 3 piernas.

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarPiernas(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroPies());

    }

    @Test
    public void testCaso3LimiteMaximo() {

        // CASO 3: Agregar exactamente 10 extremidades.

        Alien alien = new Alien(20, "Rojo");

        boolean resultado = alien.agregarBrazos(10);

        assertTrue(resultado);
        assertEquals(10, alien.getNumeroBrazos());

    }

    @Test
    public void testCaso4SuperarLimite() {

        // CASO 4: Intentar agregar 11 brazos.

        Alien alien = new Alien(20, "Verde");

        boolean resultado = alien.agregarBrazos(11);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroBrazos());

    }

    @Test
    public void testCaso5AgregarBrazosYPiernas() {

        // CASO 5: Agregar 6 brazos y 4 piernas.

        Alien alien = new Alien(15, "Morado");

        boolean brazos = alien.agregarBrazos(6);
        boolean piernas = alien.agregarPiernas(4);

        assertTrue(brazos);
        assertTrue(piernas);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(4, alien.getNumeroPies());

    }

    @Test
    public void testCaso6SuperarLimiteCombinado() {

        // CASO 6: Agregar 6 brazos e intentar agregar 5 piernas.

        Alien alien = new Alien(15, "Amarillo");

        alien.agregarBrazos(6);

        boolean resultado = alien.agregarPiernas(5);

        assertFalse(resultado);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso7CantidadNegativa() {

        // CASO 7: No permitir cantidades negativas.

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarBrazos(-2);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroBrazos());

    }

}