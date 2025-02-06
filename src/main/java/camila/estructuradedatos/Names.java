package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/4/2025
 */

//se crea la clase Names
public class Names {

    //se crea un método showNames donde indicamos la función que realizaremos
    public void showNames() {
        
        //creamos un array de tipo String donde guardaremos los nombres de los alumnos
        String[] namesArray = {
            "Camila", "Rodrigo", "Jorge", "Beca", "Argel", "Leslie", "Sebas", "Mario", 
            "Christian", "Sebastian", "Cesar", "Carlo", "Justin", "Oscar"};
        
        //usamos un ciclo for para recorrer el arreglo
        for (int i = 0; i < namesArray.length; i++) {
            
            //imprimimos cada nombre
            System.out.println(namesArray[i]); }
        
        //imprimimos la cantidad de nombres almacenados en el array
        System.out.println("Cantidad de nombres: " + namesArray.length);
    }

}
