package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/24/2025
 */

//se crea la clase IndexedSearch
public class IndexedSearch {

    //se crea el metodo searchTarget
    public static void searchTarget(int[] array, int[] index, int target) {
        //se inicializa un contador de comparaciones en 0
        int comparaciones = 0;
        int bloque = -1;

        //se crea un ciclo for para buscar buscar el index
        for (int i = 0; i < index.length - 1; i++) {
            comparaciones++;
            if (array[index[i]] <= target && array[index[i + 1]] >= target) {
                bloque = i;
                break;
            }
        }

        //se verifica si el elemento podria estar en el ultimo bloque
        if (bloque == -1 && array[index[index.length - 1]] <= target) {
            bloque = index.length - 1;
        }

        //se crea un if por si no se encuentra un elemento valido
        if (bloque == -1) {
            System.out.println("Elemento no encontrado.");
            System.out.println("Comparaciones realizadas: " + comparaciones);
            return;
        }

        //se definen los limites del bloque
        int inicio = index[bloque];
        int fin = (bloque == index.length - 1) ? array.length - 1 : index[bloque + 1];

        //se crea un ciclo for para inciar una busqyeda secuencial dentro del bloque identificado
        for (int i = inicio; i <= fin; i++) {
            comparaciones++;
            if (array[i] == target) {
                System.out.println("Elemento encontrado en la posicion: " + i);
                System.out.println("Comparaciones realizadas: " + comparaciones);
                return;
            }
        }
        System.out.println("Elemento no encontrado.");
        System.out.println("Comparaciones realizadas: " + comparaciones);
    }
}
