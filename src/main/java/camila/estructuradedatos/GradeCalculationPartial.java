package camila.estructuradedatos;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:2/24/2025
 */

//se crea la clase GradeCalculationPartial
public class GradeCalculationPartial {
    //se crea el metodo calculatePartialGrade donde se espera recibir dos parametros
    public double calculatePartialGrade(double examScore, double homeworkScore) {
        //se calcula la calificacion parcial 
        double firstPartialGrade = (examScore * 0.7 + homeworkScore * 0.3);
        //se devuelve el valor de la calificacion parcial
        return firstPartialGrade;
    }
}


