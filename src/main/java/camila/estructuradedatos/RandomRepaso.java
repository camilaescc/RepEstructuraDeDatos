package camila.estructuradedatos;
import java.util.Random;

//se crea la clase RandomRepaso
public class RandomRepaso {
        //se crea el metodo randomGrades
        public void randomGrades() {
        //se crea un array con el tamano del numero de estudiantes
        int students = 15;

        //se crea un array donde se guardan las calificaciones de los estudiantes
        int[] grades = new int[students];

        //se usa random para generar calificaciones aleatorias y almacenarlas en el arreglo students
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            grades[i] = random.nextInt(101); //se generan calificaciones random entre 0 y 100
        }
        //se establecen dos contadores para los aprobados y los reprobados
        int approved = 0;
        int notApproved = 0;

        //se establece la calificacion aprobatoria minima
        int minGrade = 70;
        //se usa un for para contar a los alumnos aprobados y los reprobados y los anade al contador correspondiente
        for (int calificacion : grades) {
            if (calificacion >= minGrade) {
                approved++;
            } else {
                notApproved++;
            }
        }
        //se imprimen los alumnos aprobados y reprobados
        System.out.println("Numero de alumnos aprobados: " + approved);
        System.out.println("Numero de alumnos reprobados: " + notApproved);    
    }
}
