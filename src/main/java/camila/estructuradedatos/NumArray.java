package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/18/2025
 */
public class NumArray {

    public int countNumbers() {

        int[] numbers = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26,
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56,
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86,
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15,
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        int even = 0;
        int odd  = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) { 
            
            if (numbers[i] % 2 == 0) { 
                even++; 
            } 
            else if (numbers[i] == 0) {
                zero++;  
            }
            else {
                odd++; 
            }
        }

       
        System.out.println("Total de números pares: " + even);
        System.out.println("Total de números nones: " + odd);
        System.out.println("Total de ceros: " + zero);
        
        return 0; 
    }
}
