package camila.estructuradedatos;
import java.util.ArrayList;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/12/2025
 */

//se crea la clase ArrayListExample
public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<>();
    
    //se crea el metodo addCars
    public void addCars (String car){
        cars.add(car);
        System.out.println(cars.size());
    }
    
    //se crea el metodo returnSize    
    public int returnSize(){
        return cars.size();
    }
    
    //se crea el metodo removeCar
    public void removeCar(int carIndex){
        cars.remove(carIndex);
    
    }
    
    
    
    
    
    
}
