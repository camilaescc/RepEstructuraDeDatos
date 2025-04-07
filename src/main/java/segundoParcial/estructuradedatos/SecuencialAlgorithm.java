package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/08/2025
 */

//se  crea la clase secuencial algorithm
public class SecuencialAlgorithm {
    public static int searchNum(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i; // Retorna la posición del elemento encontrado
            }
        }
        return -1; // Retorna -1 si el elemento no está en el arreglo
    }
    
    }



