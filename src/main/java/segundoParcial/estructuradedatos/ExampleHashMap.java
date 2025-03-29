package segundoParcial.estructuradedatos;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: Camila Escobedo
 * @matricula: 14523
 * @fecha: 3/19/2025
 */

//se crea la clase ExampleHashMap
public class ExampleHashMap {

    //se crea el metodo runHashMap 
    public void runHashMap() {
        HashMap<String, Integer> edades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        //se agregan elementos al HashMap
        edades.put("Juan", 25);
        edades.put("Maria", 30);
        edades.put("Pedro", 22);
        edades.put("Ana", 28);

        //se muestra el contenido de HashMap
        System.out.println("HashMap content:");
        for (String clave : edades.keySet()) {
            System.out.println(clave + " - " + edades.get(clave) + " years old");
        }

        //se busca una edad 
        System.out.print("\nInsert the name to see their age: ");
        String nombre = scanner.nextLine();
        if (edades.containsKey(nombre)) {
            System.out.println(nombre + " has " + edades.get(nombre) + " years old.");
        } else {
            System.out.println("Could ot find " + nombre);
        }

        //se elimina un elemento
        System.out.print("\nInsert a name to remove from list: ");
        String eliminar = scanner.nextLine();
        if (edades.containsKey(eliminar)) {
            edades.remove(eliminar);
            System.out.println(eliminar + " has been removed");
        } else {
            System.out.println("Could not find " + eliminar);
        }

        //se muestra el contenido despues de la eliminacion 
        System.out.println("\nUpdated HashMap content:");
        for (String clave : edades.keySet()) {
            System.out.println(clave + " - " + edades.get(clave) + " years old");
        }

        scanner.close();
    }
}
