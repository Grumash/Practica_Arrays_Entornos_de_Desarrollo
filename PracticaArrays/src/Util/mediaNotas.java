package Util;

public class mediaNotas {

	/**
	 * Nos devulve la media de las notas o una exepcion si no se cumplelas normas de
	 * las notas
	 * 
	 * @param notas es el array que crearemos en el main,media nos dara la media
	 *              segun las notas
	 * 
	 * @return Nos dvuelve la media de las notas dadas por el array dividido su
	 *         longitud
	 */
	public static float notaMedia(int[] notas) {

		float media = 0;

		for (int nota : notas) {

			if (nota < 0 || nota > 10) {

				throw new IllegalArgumentException("Las notas no pueden ser superiores a 10 o inferiores 0");

			}

			media = nota;
		}
		return media / notas.length;
	}

}
