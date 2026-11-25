package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnit {

    @Test
    public void testCaso1AgregarBrazos() {

        // CASO 1:
        // Agregar 4 brazos.
        // La operación debe ser exitosa.

        Alien alien = new Alien(15, "Verde");

        boolean resultado = alien.agregarBrazos(4);

        assertTrue(resultado);
        assertEquals(4, alien.getNumeroBrazos());

    }

    @Test
    public void testCaso2AgregarPiernas() {

        // CASO 2:
        // Agregar 3 piernas.
        // La operación debe ser exitosa.

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarPiernas(3);

        assertTrue(resultado);
        assertEquals(3, alien.getNumeroPies());

    }

    @Test
    public void testCaso3LimiteMaximoDeExtremidades() {

        // CASO 3:
        // Agregar exactamente 10 brazos.
        // Debe permitir la operación porque no supera el límite.

        Alien alien = new Alien(20, "Rojo");

        boolean resultado = alien.agregarBrazos(10);

        assertTrue(resultado);
        assertEquals(10, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso4SuperarLimiteDeExtremidades() {

        // CASO 4:
        // Intentar agregar 11 brazos.
        // Debe rechazar la operación y no agregar ninguno.

        Alien alien = new Alien(20, "Verde");

        boolean resultado = alien.agregarBrazos(11);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso5AgregarBrazosYPiernasCombinados() {

        // CASO 5:
        // Primero agregar 6 brazos.
        // Después agregar 4 piernas.
        // El total será exactamente 10 extremidades.

        Alien alien = new Alien(15, "Morado");

        boolean resultadoBrazos = alien.agregarBrazos(6);
        boolean resultadoPiernas = alien.agregarPiernas(4);

        assertTrue(resultadoBrazos);
        assertTrue(resultadoPiernas);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(4, alien.getNumeroPies());

    }

    @Test
    public void testCaso6SuperarLimiteCombinado() {

        // CASO 6:
        // Primero agregar 6 brazos.
        // Después intentar agregar 5 piernas.
        // El total sería 11, por lo tanto debe rechazarlo.
        // Los 6 brazos deben mantenerse y las piernas en 0.

        Alien alien = new Alien(15, "Amarillo");

        alien.agregarBrazos(6);

        boolean resultado = alien.agregarPiernas(5);

        assertFalse(resultado);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

    }

    @Test
    public void testCaso7CantidadInvalida() {

        // CASO 7:
        // Intentar agregar una cantidad negativa.
        // No debe permitir la operación ni modificar el Alien.

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarBrazos(-2);

        assertFalse(resultado);
        assertEquals(0, alien.getNumeroBrazos());

    }

}
