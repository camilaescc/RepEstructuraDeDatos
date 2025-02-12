package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/11/2025
 */

//se crea la clase StudentGrades
public class StudentGrades {

    //se crea el metodo calculateFirstPartialGrade donde se espera recibir dos parametros
    public int calculateFirstPartialGrade(int examScore, int homeworkScore) {
        //se calcula la primer calificacion parcial en double para redondear
        double firstPartialGrade = (examScore * 0.7 + homeworkScore * 0.3);
        //se convierte de double a int para devolver un numero entero
        return (int) (firstPartialGrade);
    }

    //se crea el metodo calculateFinalGrade donde se espera recibir cuatro parametros
    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        //se calcula el promedio de los tres parciales en double para redondear
        double promPartial = ((double) firstPartial + secondPartial + thirdPartial) / 3;
        //se calcula el porcentaje del examen final y el de los parciales y se suman en double para redondear
        double totalFinal = (finalExam * 0.5 + promPartial * 0.5);
        //se convierte de double a int para devolver un numero entero
        return (int) (totalFinal);
    }

    //se crea el metodo checkFailureByAbsences donde se espera recibir dos parametros
    public String checkFailureByAbsences(int totalHours, int absences) {
        //se calcula el porcentaje de faltas en double para redondear
        double attendanceStatus = ((double) absences / totalHours) * 100;
        //se usa if and else para determinar si el alumno esta reprobrado o aprobado
        if (attendanceStatus > 10.0) {
            return "Alumno reprobado por faltas";
        } else {
            return "Alumno cumple con el minimo de faltas";
        }   
    }

}
