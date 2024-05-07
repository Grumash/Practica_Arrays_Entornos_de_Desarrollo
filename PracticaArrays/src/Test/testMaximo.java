package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.maximaNota;

class testMaximo {

	@Test
	public void testMax1() {
		int[] notas = { 5, 8, 10, 2, 7 };

		int maximoEsperado = 10;
		int maximoCalculado = maximaNota.notaMaxima(notas);

		assertEquals(maximoEsperado, maximoCalculado);
	}

	@Test
	public void testMax2() {
		int[] notas = { 5, 2, 0, 7, 1 };

		int maximoEsperado = 7;
		int maximoCalculado = maximaNota.notaMaxima(notas);

		assertEquals(maximoEsperado, maximoCalculado);
	}

	public void testexcepcion() {
		int[] notas = { 11, 5, 8 };

		try {
			maximaNota.notaMaxima(notas);
			fail("Se esperaba una excepción IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Las notas no pueden ser superiores a 10 o inferiores 0", e.getMessage());
		}

	}
}
