package camila.estructuradedatos;

//se crea la clase IVARepaso
public class IVARepaso {
    //se crea el metodo calculateSales
    public void calculateSales() {

        //se crea un array numbers donde se guardaran las variables de tipo int 
        int[] storage = {
            290, 320, 350, 380, 410, 440, 475, 506, 523, 569,   
        };
        
        //se inicaliza un contador para sumar cada elemento de la lista
        double totalSales = 0;
    
        //se crea un for para recorrer el tamano del arreglo 
        for (int i = 0; i < storage.length; i++) {            
        
        
        //se le anade el IVA a cada valor
        double addIVA = (storage[i] * 1.16);
        
        //Se muestra el resultado de la venta con el iva y se redonda 2 decimales 
        System.out.printf("Venta con IVA: %.2f%n", addIVA);
        
        
        //se suman todas las ventas y se imprime el resultado
        totalSales += addIVA;
       }       
        //se imprime el resultado total de las ventas con IVA
        System.out.printf("Total de ventas con IVA: %.2f%n", totalSales);
    }
   }
   
