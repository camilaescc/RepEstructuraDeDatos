/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package camila.estructuradedatos;

/**
 *
 * @author milae
 */
public class EstructuraDeDatos {

    public static void main(String[] args) {
        Promedio objPromedio= new Promedio();
        objPromedio.calcularPromedio();
        
        Names objNames = new Names();
        objNames.showNames();
        
        Juego objJuego = new Juego();
        objJuego.lanzarJuego();
                
        UserData objUserData = new UserData();
        String fullName = objUserData.fullName("Camila", "Escobedo");
        System.out.println(fullName);           
    }
}
