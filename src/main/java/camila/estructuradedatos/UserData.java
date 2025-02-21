package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/06/2025
 */

//se crea una clase UserData
public class UserData {
    //se crea el metodo FullName que recibe dos parametros de tipo String
    public  String fullName(String firstName, String lastName) {
        //se regresa el formato completo de como se imprimira el nombre completo
        return String.format("El nombre completo del usario es: %s %s", firstName, lastName);
    }
}
