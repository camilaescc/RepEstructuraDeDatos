package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/24/2025
 */

//se crea la clase SalesWithDiscount
public class SalesWithDiscount {
    //se crea el metodo calculateSales
    public void calculateSales() {

        //se crea un array sales donde se guardaran las variables de tipo double 
        double[] sales = {
            100.0, 200.0, 150.0,  
        };    
        
        //se inicia un contador totalSales en 0 
        double totalSales = 0;
        
        //se agrega un for para recorrer el tamano del arrat 
        for (int i = 0; i < sales.length; i++) {            
        
        //se le anade el descuento del 10% a cada elemento en el array
        double discount = (sales[i] * 0.9);
        
        //se suman todas las ventas 
        totalSales += discount;
        }
        
        //se imprime el resultado total de las ventas con descuento
        System.out.println("La sumatotal de ventas con el 10% de descuento es: " + totalSales);        
     }
    }
    