package segundoParcial.estructuradedatos;
//import static segundoParcial.estructuradedatos.BinarySearch.search;





public class SecondPartialMain {

    public static void main(String[] args) {
        /*
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
              
        */
        //SecuencialAlgoritm 
        
        int[] datos = {10, 20, 30, 40, 50};
        int resultado = SecuencialAlgorithm.searchNum(datos, 30);
        System.out.println("El numero 30 esta en la posicion: " + resultado);
        
        /*
        //BinarySearch
        
        int[] array = {10, 20, 30, 40, 50};
         
        int result = BinarySearch.search(array, 30);
        System.out.println("BinarySearch");
        System.out.println("El numero 30 esta en la posicion: " + result);
        
        
        //HashMap
        
        ExampleHashMap hashMap = new ExampleHashMap();
        hashMap.runHashMap(); 
        
        
        //IndexedSearch

        int[] array = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};
        int[] index = {0, 4, 8, 12}; 
        int target = 45;
        System.out.println("Indexed Search");
        System.out.println("Elemento a buscar:" + target);
        IndexedSearch.searchTarget(array, index, target);
        
        
        //LinearSearch

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;
        int index = LinearSearch.findValue(array, target);
        System.out.println("Linear Search");
        System.out.println("Elemnto a buscar:" + target);
        if (index != -1) {
            System.out.println("Elemento encontrado en la posicion: " + index);
        } else {
            System.out.println("Elemento no encontrado.");
        }
        
        
        //MergeSort

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        
        MergeSortExample objMerge = new MergeSortExample();
        objMerge.mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        
        
        //QuickSort
        
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        
        QuickSortExample objQuick = new QuickSortExample();
        objQuick.quickSort(array, 0, array.length - 1);
        

        
        for(int i : array){
            System.out.print(i + " ");
        }
        */
    }  

    private static int search(int[] array, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
           
}

        
    

