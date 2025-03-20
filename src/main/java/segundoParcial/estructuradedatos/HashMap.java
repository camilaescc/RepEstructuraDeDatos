package segundoParcial.estructuradedatos;
import java.util.HashMap;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:3/19/2025
 */

public class HashMap {

    private HashMap<String, Integer> studentGrades;

    public HashMap() {
        studentGrades = new HashMap<>();
    }

    // Agregar una calificación
    public void addGrade(String student, int grade) {
        studentGrades.put(student, grade);
    }

    // Obtener la calificación de un estudiante
    public Integer getGrade(String student) {
        return studentGrades.getOrDefault(student, null);
    }

    // Mostrar todas las calificaciones
    public void displayGrades() {
        for (String student : studentGrades.keySet()) {
            System.out.println(student + ": " + studentGrades.get(student));
        }
    }

    // Eliminar un estudiante
    public void removeStudent(String student) {
        studentGrades.remove(student);
    }
}
