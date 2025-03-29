package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/18/2025
 */

//se crea la clase BinarySearch
public class BinarySearch {
    //se crea el metodo search donde se buscara el numero seleccionado
    public static int search (int[] array, int  target) {
        //se inicializan las variables para definir los límites de la búsqueda, left indice 0 y right indice final del array
        int left = 0, right = array.length - 1;
        //se crea un ciclo while para continuar la busqueda siempre que left sea menor que right
        while (left <= right) {
            //se calcula el indice en medio para dividir el array a la mitad            
            int middle = left + (right - left) / 2;
            if (array[middle] == target) {
                return middle; // Elemento encontrado
            }
            //si el valor middle es menor que el objetivo, se busca en la mitad right
            if (array[middle] < target) {
                left = middle + 1;
            //si el valor middle es mayor que el objetivo, se busca en la mitad left    
            } else {
                right = middle - 1;
            }
        }
        return -1; //si no se encuentra el valor, se regresa -1
    }
   
}