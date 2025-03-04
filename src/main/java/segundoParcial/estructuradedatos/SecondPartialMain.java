package segundoParcial.estructuradedatos;


public class SecondPartialMain {

    public static void main(String[] args) {
        
        //InsertionSort
        System.out.println("InsertionSort:");
        int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int mejorCaso[] = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        
        System.out.println("Peor Caso:");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);
        
        System.out.println("\nMejor Caso:");
        int operacionesMejor = InsertionSortExample.insertionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        
        
        //SelectionSort
        System.out.println("\nSelectionSort:");
        int worstCase[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 
        int bestCase[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  

        System.out.println("Peor Caso:");
        SelectionSortExample.selectionSort(worstCase);

        System.out.println("\nMejor Caso:");
        SelectionSortExample.selectionSort(bestCase);
        
    }
}

        
    

