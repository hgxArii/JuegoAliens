package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestPrecioTotalJUnit {

    @Test
    public void testCaso1PrecioInicial() {

        // CASO 1: El precio inicial debe ser cero.

        Alien alien = new Alien(15, "Verde");

        assertEquals(0, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso2PrecioConBrazos() {

        // CASO 2: Cuerpo 3 + dos brazos 3 = 6.

        Alien alien = new Alien(15, "Azul");

        boolean resultado = alien.agregarBrazos(2);

        assertTrue(resultado);
        assertEquals(6.00, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso3PrecioConPiernas() {

        // CASO 3: Cuerpo 3 + dos piernas 3 = 6.

        Alien alien = new Alien(15, "Rojo");

        boolean resultado = alien.agregarPiernas(2);

        assertTrue(resultado);
        assertEquals(6.00, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso4PrecioConOjos() {

        // CASO 4: Cuerpo 3 + dos ojos 1.50 = 4.50.

        Alien alien = new Alien(15, "Morado");

        boolean resultado = alien.agregarOjos(2);

        assertTrue(resultado);
        assertEquals(4.50, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso5PrecioTotalCompleto() {

        // CASO 5:
        // Cuerpo = 3
        // Dos brazos = 3
        // Una pierna = 1.50
        // Dos ojos = 1.50
        // Total = 9.

        Alien alien = new Alien(15, "Verde");

        alien.agregarBrazos(2);
        alien.agregarPiernas(1);
        alien.agregarOjos(2);

        assertEquals(9.00, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso6ActualizacionAutomatica() {

        // CASO 6: Comprobar que el precio se actualiza.

        Alien alien = new Alien(15, "Azul");

        alien.agregarBrazos(2);

        assertEquals(6.00, alien.getPrecioTotal(), 0.0001);

        alien.agregarOjos(2);

        assertEquals(7.50, alien.getPrecioTotal(), 0.0001);

    }

    @Test
    public void testCaso7OperacionFallida() {

        // CASO 7: Una operación fallida no modifica el precio.

        Alien alien = new Alien(15, "Amarillo");

        alien.agregarBrazos(6);

        double precioAnterior = alien.getPrecioTotal();

        boolean resultado = alien.agregarPiernas(5);

        assertFalse(resultado);

        assertEquals(6, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());

        assertEquals(precioAnterior,
                alien.getPrecioTotal(), 0.0001);

    }

}