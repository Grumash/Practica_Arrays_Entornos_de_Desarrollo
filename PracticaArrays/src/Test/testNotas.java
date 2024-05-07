package Test;

import Util.mediaNotas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.mediaNotas;

class testNotas {

	@Test
	void testMediaPositiva() {
		int[] notas = { 5, 7, 2, 4, 9, 1, 3 };
		float mediaEsperada = 5.0f;

		float mediaCalculada = mediaNotas.notaMedia(notas);
		
		assertEquals(mediaEsperada, mediaCalculada, 5);
	}

	@Test
	void testMediaPositivaConDecimales() {
		int[] notas = { 5, 7, 2, 4, 9, 1, 3, 8 };
		float mediaEsperada = 4.0f;

		float mediaCalculada = mediaNotas.notaMedia(notas);
		assertEquals(mediaEsperada, mediaCalculada, 4);

	}
}
