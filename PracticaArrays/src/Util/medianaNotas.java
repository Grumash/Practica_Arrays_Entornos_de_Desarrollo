package Util;

import java.util.Arrays;

public class medianaNotas {

	public class MediaNotas {

		/**
		 * 
		 * 
		 * @param notas es el array que crearemos en el main,media nos dara la media
		 *              segun las notas
		 * 
		 * @return Nos devuelve una cosa u otrarsegun si es par o no
		 */
		public static float medianaNota(int[] notas) {

			if (notas.length == 0) {
				throw new IllegalArgumentException("El array de notas no puede estar vacío");
			}

			for (int nota : notas) {
				if (nota < 0 || nota > 10) {
					throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
				}
			}

			Arrays.sort(notas);

			int Mediana = notas.length / 2;

			if (notas.length % 2 == 0) {
				return (notas[Mediana - 1] + notas[Mediana]) / 2;
			}

			else {
				return notas[Mediana];
			}

		}
	}
}
