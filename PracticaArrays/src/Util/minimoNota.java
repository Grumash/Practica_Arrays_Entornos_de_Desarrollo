package Util;

public class minimoNota {
	
	
	/**
     * El el nuemro mas grande que hay en el array
     *
     * @param notas es el array de donde sacaresmmo los numeros
     * @return no sdevuelve le nuemro mas grande que tiene el array
     *
     */
    public static int notaMinima(int[] notas) {

        int menor = notas[0];

        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas no pueden ser superiores a 10 o inferiores 0");
            }

            if (nota < menor) {
                menor = menor;
            }
        }

        return menor;
    }
}
