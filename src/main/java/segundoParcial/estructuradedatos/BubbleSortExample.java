package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/05/2025
 */

//se crea la clase BubbleSortExample
public class BubbleSortExample {
    //se crea el metodo bubbleSort que recibe un array de tipo int
     public static int bubbleSort(int[] arr) {
        //se crea la variable n donde se recorre el tamano del array 
        int n = arr.length;
        //se inicializa un contador comparisons en cero
        int comparisons = 0; 
        //se declara una variable boolean para verificar si hubo intercambios en una iteracion 
        boolean swapped;

        //se recorre el array desde su primera posicion hasta la penultima 
        for (int i = 0; i < n - 1; i++) {
            
            //se incializa una variable swapped como falsa antes de cada iteracion
            swapped = false;
            //se recorre el array no ordenado desde su primera posicion hasta la penultima
            for (int j = 0; j < n - 1 - i; j++) {
                //se incrementa el contador de comparaciones
                comparisons++;
                //si el elemento actual es mayor al siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    //intercambio de valores para ordenar 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //se declara que hubo un intercambio 
                    swapped = true;
                }
            }
            //si no hay intercambios, el array esta ordenado
            if (!swapped) break; 
        }
        //se imprime el total de las operaciones realizadas
        System.out.println("Operaciones realizadas: " + comparisons);
        //se regresa el valor total del contador 
        return comparisons;
        
     
    }
}
