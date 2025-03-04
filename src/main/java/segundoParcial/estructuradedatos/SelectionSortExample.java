package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/04/2025
 */

public class SelectionSortExample {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Cuenta solo comparaciones
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
            // Imprimir el estado del arreglo en cada iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return comparisons;
    }   
}
