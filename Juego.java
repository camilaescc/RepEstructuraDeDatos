package camila.estructuradedatos;
import java.util.Random;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/4/2025
 */

//se crea la clase Juego modificacion
public class Juego {
    
    //se crea un metodo vacio lanzarJuego
    public void lanzarJuego () {
        
        //se crea un array de cadena con las opciones disponibles 
        String[] mano = 
        {"piedra", "papel", "tijera"};
        
        //se crea un objeto llamado random de la clase Random
        Random random = new Random();

        //se genera un numero aleatorio entre el 0 y el tamano del array. Seran los indices del array 
        int randomIndex = random.nextInt(mano.length);

        //se le asigna un numero aleatorio a una de las opciones disponibles del array
        String randomMano = mano[randomIndex];

        //imprime el resultado
        System.out.println("Piedra, papel o tijera: " +randomMano );
    }
}
