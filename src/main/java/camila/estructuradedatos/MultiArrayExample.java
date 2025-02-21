package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/17/2025
 */

//se crea la clase MultiArrayExample
public class MultiArrayExample {
    //declaracion e inicializacion de un arreglo 2x2
    public void printbidimensionalArray (){
        int[][] matrix = {
            {1,2}, //[0][0]=1, [0][1]=2
            {3,4}  //[1][0]=3, [0][1]=4
        };
        
        //recorrer e imprimir la matriz
        for (int i = 0; i < matrix.length; i++){
            System.out.println("Longitud de la fila" + matrix[i].length);
            for (int j=0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }       
}
