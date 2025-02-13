package camila.estructuradedatos;
import java.util.ArrayList;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/12/2025
 */

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<>();
    
    public void addCars (String car){
        cars.add(car);
        System.out.println(cars.size());
    }
        
    public int returnSize(){
        return cars.size();
    }
    
    public void removeCar(int carIndex){
        cars.remove(carIndex);
    
    }



    
}
