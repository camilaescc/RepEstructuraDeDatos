package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/04/2025
 */

public class InsertionSortExample {

public static int insertionSort(int arr[]) {
    int n = arr.length;
    int operaciones = 0;

    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
            operaciones++; 
        }
        arr[j + 1] = key; 
        
    }

    return operaciones;
}

}
 
