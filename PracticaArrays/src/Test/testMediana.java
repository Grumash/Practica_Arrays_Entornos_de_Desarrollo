package Test;

import Util.medianaNotas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMediana {

	@Test
	public void testPar() {
		int[] notas = { 5, 6, 7, 8 };

		float medianaEsperada = (float) (6 + 7) / 2;
		float medianaCalculada = medianaNotas.notaMediana(notas);

		assertEquals(medianaEsperada, medianaCalculada, 0.001);
	}

	@Test
	public void testImpar() {
		int[] notas = { 1, 2, 3, 4, 5 };

		float medianaEsperada = 3;
		float medianaCalculada = medianaNotas.notaMediana(notas);

		assertEquals(medianaEsperada, medianaCalculada, 0.001);
	}

	@Test
	public void testVacio() {
		int[] notas = {};

		try {
			medianaNotas.notaMediana(notas);
			fail("Se esperaba una excepción IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("El array de notas no puede estar vacío", e.getMessage());
		}
	}

}
