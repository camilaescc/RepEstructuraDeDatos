package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/4/2025
 */

//se crea la clase Promedio
public class Promedio {
    
    //se crea el metodo vacio calcularPromedio
    public  void calcularPromedio() {
        
        //se crea el array de tipo entero con las calificaciones 
        int[] calificaciones = 
        {100, 86, 94};

        //se crea la variable suma y se inicaliza en cero
        int suma = 0; 

        //se crea un ciclo for para recorrer las calificaciones
        for (int i = 0; i < calificaciones.length; i++){
            
            //se imprimen las calificaciones
            System.out.println("Las calificaciones son: " +calificaciones[i]);
            
            //se suman todas las opciones que hay de calificaciones
            suma += calificaciones[i]; 
        }
        
        //se calcula el promedio diviendo la suma de las calificaciones entre el largo del array 
        int promedio = suma/calificaciones.length;

        //se imprime la suma total de las calificaciones 
        System.out.println("La suma de las calificaciones es: " + suma);
        
        //se imprime el promedio de las califificaciones
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
    
}
