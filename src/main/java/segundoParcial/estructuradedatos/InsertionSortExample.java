package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/04/2025
 */

//se crea la clase InsertionSortExample
public class InsertionSortExample {

//se crea el metodo statico insertionSort que recibe un array de tipo int
public static int insertionSort(int arr[]) {
    
    //se crea una variable de tipo int que representa el tamano del array 
    int n = arr.length;
    //se inicaliza un contador operaciones en cero
    int operaciones = 0;

    //se inicia un ciclo for donde lee la segunda posicion de una lista hasta el final
    for (int i = 1; i < n; i++) {
        //se crea una variable key que guarda el valor actual del array 
        int key = arr[i];
        //se crea una variable j que representa la posicion anterior del array
        int j = i - 1;
        
        //se crea un ciclo while con la condicion de que mientras la variable j sea mayor o igual a 0  y el valor en arr[j] se mayor que key:
        while (j >= 0 && arr[j] > key) {
            //se desplaza arr[j] una posicion a la derecha
            arr[j + 1] = arr[j];
            //regresa una posicion en el array para seguir comparando los valores  
            j = j - 1;
            //se incrementa el contador de operaciones
            operaciones++; 
        }
        //fuera del ciclo while se inserta key en la posicion correcta
        arr[j + 1] = key; 
        
    }
    //se regresa el contador con cuantas operaciones se realizan
    return operaciones;
}

}
 
