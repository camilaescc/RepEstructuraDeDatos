package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/27/2025
 */

//se crea la clase MergeSortExample
public class MergeSortExample {

    //se crea el metodo mergeSort que realiza el algortmo y cuenta las comparaciones
    public static int mergeSort(int[] array) {
        int[] tempArr = new int[array.length];  
        //se crea un array temporal para la mezcla
        return mergeSortHelper(array, tempArr, 0, array.length - 1);
    }

    //se crea el metodo mergeSortHelper que ordena y cuenta las compraciones
    private static int mergeSortHelper(int[] arr, int[] tempArr, int left, int right) {
        //se inicializa un contador de comparaciones en cero
        int comparisons = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            //se divide el array en dos mitades
            comparisons += mergeSortHelper(arr, tempArr, left, mid);
            comparisons += mergeSortHelper(arr, tempArr, mid + 1, right);

            //se mezclan las dos mitades 
            comparisons += merge(arr, tempArr, left, mid, right);
        }
        return comparisons;
    }

    //se crea un metodo para mezclar las mitades
    private static int merge(int[] arr, int[] tempArr, int left, int mid, int right) {
        int comparisons = 0;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //se copian los datos de los array temporales
        System.arraycopy(arr, left, tempArr, left, n1);
        System.arraycopy(arr, mid + 1, tempArr, mid + 1, n2);

        //se mexclan los arrays temporales
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            //se ceuntan las comparaciones
            comparisons++;  
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        //si hay elementos restantes en la izquierda, se cuentan
        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }

        //si hay elementos restantes en la derecha, se cuentan
        while (j <= right) {
            arr[k] = tempArr[j];
            j++;
            k++;
        }

        return comparisons;
    }
}
