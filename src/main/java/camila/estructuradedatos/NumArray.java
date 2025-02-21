package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/18/2025
 */

//se crea la clase NumArray
public class NumArray {

    //se crea el metodo countNumbers 
    public void countNumbers() {

        //se crea un array numbers donde se guardaran las variables
        int[] numbers = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26,
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56,
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86,
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15,
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        //se inicializa en cero un contador para los numeros pares
        int even = 0;
        //se inicializa en cero un contador para los numeros nones
        int odd  = 0;
        //se inicializa en cero un contador para los ceros
        int zero = 0;

        //se crea un for para recorrer el tamano del array
        for (int i = 0; i < numbers.length; i++) { 
            
            //se establece un if y se verifica si las variables del array son un numero par y las va sumando al contador even
            if (numbers[i] == 0) { 
                zero++; 
            } 
            //se usa else if para verificar las variables del array que sean igual a cero y las va sumando al contador zero
            else if (numbers[i] % 2 == 0) {
                even++;  
            }
            //se usa un else para las variables del array que sobran y las va sumando al contador odd 
            else {
                odd++; 
            }
        }

        //se imprimen los valores 
        System.out.println("Total de numeros pares: " + even);
        System.out.println("Total de numeros nones: " + odd);
        System.out.println("Total de ceros: " + zero);
  
        
    }
}

