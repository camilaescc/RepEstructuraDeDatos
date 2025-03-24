package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/05/2025
 */

public class LinearSearch {
    public int find(int number){
    int[] numbers = {10,9,8,7,6,5,4,3,2,1};
    for (int i=0; i<numbers.length; i++) {
        if (numbers[i]==number) {
            return i; 
        }
        
    }
    
    return 0;
    }
    
}
