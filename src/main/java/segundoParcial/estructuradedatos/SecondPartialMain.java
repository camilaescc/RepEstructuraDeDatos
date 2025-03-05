package segundoParcial.estructuradedatos;



public class SecondPartialMain {

    public static void main(String[] args) {
        
        //InsertionSort
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
        
        
        
    }
}

        
    

