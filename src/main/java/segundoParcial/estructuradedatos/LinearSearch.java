package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/25/2025
 */

//se crea la clase LinearSearch
public class LinearSearch {

    //se crea el metodo findValue
    public static int findValue(int[] array, int target) {
        //se crea un ciclo for para buscar el valor 
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                //devuelve el indice donde se encontro el valor
                return i;  
            }
        }
        //si no encuentra el valor regresa -1
        return -1;  
    }
}

