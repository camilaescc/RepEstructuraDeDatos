package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/12/2025
 */

//se crea la clase CircleArea
public class CircleArea {

    //se crea el metodo calculateArea en double donde recibe un parametro radius
    public double calculateArea(double radius) {
        //regresa en double la operacion que daria como resultado el area de un circulo
        //se usa el de la libreria de java Math para realizar las operaciones correctamente
        return (Math.PI) * Math.pow(radius, 2);
    }

}
