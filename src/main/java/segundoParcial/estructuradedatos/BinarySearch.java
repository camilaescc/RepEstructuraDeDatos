package segundoParcial.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/14/2025
 */

public class BinarySearch {
    private int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15}; // Arreglo ordenado

    public int binarySearch(int number) {
        int left = 0, right = sortedArray.length - 1;
        int comparisonCount = 0; // Contador de comparaciones

        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisonCount++; // Se realiza una comparación

            // Verificar si number está en la posición mid
            if (sortedArray[mid] == number) {
                System.out.println("Número encontrado en la posición: " + mid);
                System.out.println("Comparaciones realizadas: " + comparisonCount);
                return mid;
            }

            // Si number es mayor, ignorar la mitad izquierda
            if (sortedArray[mid] < number) {
                left = mid + 1;
            }
            // Si number es menor, ignorar la mitad derecha
            else {
                right = mid - 1;
            }
        }

        // Si no se encuentra el número
        System.out.println("Número no encontrado en el array.");
        System.out.println("Comparaciones realizadas: " + comparisonCount);
        return -1;
    }