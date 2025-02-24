package camila.estructuradedatos;

//se crea la clase BidimensionalArrayRepaso
public class BidimensionalArrayRepaso {
    //se crea el método printbidimensionalArray
    public void printbidimensionalArray() {
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6},
            {7, 8, 9}          
        };
        
        //se inicializa un contador sumMatrix
        int sumMatrix = 0;
        
        //se usa un for para recorrer el tamaño del arreglo
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //se suman los valores de la matrix en el contador sumMatrix
                sumMatrix += matrix[i][j];
            }
        }
        
        //se imprime el resultado total de la suma de los valores de la matriz
        System.out.println("Suma de todos los valores: " + sumMatrix);
    }
 }
   