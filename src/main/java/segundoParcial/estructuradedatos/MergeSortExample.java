package segundoParcial.estructuradedatos;

/**
 * @author: Camila Escobedo
 * @matricula: 14523
 * @fecha: 3/27/2025
 */

// Se crea la clase MergeSortExample
public class MergeSortExample {

    // Se crea el método mergeSort que realiza el algoritmo y cuenta las comparaciones
    public  void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // Caso base

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // Left array
        int j = 0; // Right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // Índices

        // Check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

  
}
