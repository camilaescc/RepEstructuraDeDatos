package segundoParcial.estructuradedatos;
import java.util.Scanner;


public class SecondPartialMain {

    public static void main(String[] args) {
        
        //InsertionSort
        /*
        System.out.println("InsertionSort:");
        int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        System.out.println("Peor Caso");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
        System.out.println("Operaciones realizadas: " + operacionesPeor);       
        
        
        //SelectionSort
        System.out.println("\nSelectionSort:");
        int worstCase[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 
      
        System.out.println("Peor Caso");
        SelectionSortExample.selectionSort(worstCase);
        

                
        //BubbleSort
        System.out.println("\nBubbleSort:");
        
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        System.out.println("Peor Caso ");
        int comparisons = BubbleSortExample.bubbleSort(arr);
        
        //SecuencialAlgoritm
        System.out.println("\Algoritmo Secuencial:");
        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 
      
        System.out.println("Posicion en la que se encontro");
        SecuencialAlgoritm.searchNum(array);
        */
        
        /*
        //BinarySearch
        BinarySearch objBinary = new BinarySearch();
        int number = 7; // Número a buscar

        objBinary.binarySearch(number); // Llamada al método
        
        HashMap example = new HashMap();

        // Agregar estudiantes y calificaciones
        example.addGrade("Juan", 85);
        example.addGrade("Maria", 90);
        example.addGrade("Pedro", 78);

        // Mostrar calificaciones
        System.out.println("Calificaciones:");
        example.displayGrades();

        // Obtener calificación de un estudiante
        System.out.println("\nCalificación de Maria: " + example.getGrade("Maria"));

        // Eliminar un estudiante
        example.removeStudent("Pedro");

        // Mostrar calificaciones después de la eliminación
        System.out.println("\nCalificaciones después de eliminar a Pedro:");
        example.displayGrades();
        */
        
        //IndexedSearch
        IndexedSearch search = new IndexedSearch();
        IndexedSearch.main(args);
    }
}

        
    

