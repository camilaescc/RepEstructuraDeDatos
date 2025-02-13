package camila.estructuradedatos;
//import java.util.Scanner;

/**
 *
 * @author milae
 */

public class EstructuraDeDatos {

    public static void main(String[] args) {
        
  
                
        //Promedio
        //Promedio objPromedio= new Promedio();
        //objPromedio.calcularPromedio();
        
        //Names
        //Names objNames = new Names();
        //objNames.showNames();
        
        //Juego
        //Juego objJuego = new Juego();
        //objJuego.lanzarJuego();
        
        //UserData
        //UserData objUserData = new UserData();
        //String fullName = objUserData.fullName("Camila", "Escobedo");
        //System.out.println(fullName);        
        
        //StudentGrades
        //StudentGrades objStudentGrades = new StudentGrades();
        //int firstPartialGrade = objStudentGrades.calculateFirstPartialGrade(85, 90);
        //System.out.println("Calificacion del parcial: " + firstPartialGrade);
        //int totalFinal = objStudentGrades.calculateFinalGrade(80, 75, 90, 85);
        //System.out.println("Calificacion final del semestre: " + totalFinal);
        //String attendanceStatus = objStudentGrades.checkFailureByAbsences(64, 7);
        //System.out.println(attendanceStatus);
        
        //TriangleArea
        //Scanner objScanner = new Scanner (System.in);
        //System.out.print("Ingresa la base del triangulo:");
        //double base = objScanner.nextDouble();
        //System.out.print("Ingresa la altura del triangulo:");
        //double height = objScanner.nextDouble();  
        //TriangleArea objTriangle = new TriangleArea();
        //double area = objTriangle.calculateArea(base, height);
        //System.out.println(String.format("El area del triangulo con base %.2f y altura %.2f es de: %.4f", base, height, area));
        //objScanner.close();
        
        //CircleArea
        //Scanner objScanner = new Scanner (System.in);
        
        //System.out.print("Ingresa el radio de un circulo:");
        //double radius = objScanner.nextDouble(); 
        
        //CircleArea objCircle = new CircleArea();
        //double area = objCircle.calculateArea(radius);
        
        //System.out.println(String.format("El area de un circulo con un radio de %.2f es de: %.4f", radius, area));
        
        //objScanner.close();
    
                
        ArrayListExample objArrayList = new ArrayListExample();
        objArrayList.addCars("Mazda");
        objArrayList.addCars("Chevrolet");
        objArrayList.removeCar(0);
        //objArrayList.removeAll();
        
        System.out.println( objArrayList.returnSize());

}