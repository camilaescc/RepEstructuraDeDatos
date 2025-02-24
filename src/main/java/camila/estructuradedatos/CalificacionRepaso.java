package camila.estructuradedatos;

//se crea la clase CalificacionRepaso
public class CalificacionRepaso {
    //se crea el metodo calculateFirstPartialGrade 
    public int calculatePartialGrade(double examScore, double homeworkScore) {
        //se calcula la primer calificacion parcial en double para redondear
        double firstPartialGrade = (examScore * 0.7 + homeworkScore * 0.3);
        //se convierte de double a int para devolver un numero entero
        return (int) (firstPartialGrade);
    }
    
}
