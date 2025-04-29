package tercerParcial.estructuradedatos;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:4/29/2025
 */

public class ColaExample {
    public Queue<String> cola;

    public ColaExample() {
        cola = new LinkedList<>();
    }

    public void agregarCliente(String cliente) {
        cola.add(cliente);
    }

    public String verClienteAlFrente() {
        return cola.peek();
    }

    public String atenderCliente() {
        return cola.poll();
    }
}

