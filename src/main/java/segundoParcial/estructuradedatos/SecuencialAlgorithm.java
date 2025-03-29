package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/08/2025
 */

//se  crea la clase secuencial algorithm
public class SecuencialAlgorithm {
    //se crea el metodo searchNum para buscar el valor mas pequeno del array
    public static int searchNum(int[] arr) {
        //inicializamos un contador minIndex en la posicion 0 como suponiendo que ahi se encuentra el valor menor  
        int minIndex = 0;

        //se usa un ciclo for para frecorrer el array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                //se actualiza el contador minIndex si es que se encontro un valor menor en un indice diferente a 0
                minIndex = i;
            }
        }
        
        System.out.println("Secuencial Algorithm");
        //se imprime el valor minimo que se encontro
        System.out.println("Valor minimo encontrado: " + arr[minIndex]);
        //se imprime la posicion en la que se encontro el valor 
        System.out.println("Posicion en la que se encontro: " + minIndex);
       
        return minIndex;
    }
}


