/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoParcial.estructuradedatos;

/**
 *
 * @author milae
 */
// HashMapExample.java
import java.util.HashMap;

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
