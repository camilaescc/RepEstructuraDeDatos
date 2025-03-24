package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/08/2025
 */

public class SecuencialAlgoritm {
    //se crea el metodo selectionSort que recibe un array de tipo int
    public static int seatchNum(int[] arr) {
        //se crea la variable n donde se cuenta el tamano del array
        int n = arr.length;
        //se inicializa un contador comparisons en cero
        int place = 0;

        //se crea un ciclo for donde se busca el valor menor en el array recorriendo el array hasta la ultima posicion  
        for (int i = 0; i < n - 1; i++) {
            //se crea la variable minIndex donde se asume el menor elemento en la posicion i 
            int minIndex = i;
            //se crea un ciclo for dentro del ciclo for donde se recorre la parte no ordenada buscando el valor menor 
            for (int j = i + 1; j < n; j++) {
                //se incrementa el contador de comparisons
                place++;
                //si el valor arr[j] es menor al valor arr[minIndex]:
                if (arr[j] < arr[minIndex]) {
                    //se actualiza minIndex
                    minIndex = j;
                }
            }
            //Si se encunetra un nuevo minimo se intercambia 
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
             
            }
        }
        //se imprimen las operaciones totales realizadas
        System.out.println("Posicion en la que se encontro: " + place);
       
        //se regresa el contador con el valor de operaciones realizadas
        return place;
    }
}

