package tercerParcial.estructuradedatos;
import java.util.Stack;

/**
 * @author:CamilaEscobedo
 * @matricula:14523
 * @fecha:4/28/2025
 */

public class PilaExample {
    public Stack<String> pila;

    public PilaExample() {
        pila = new Stack<>();
    }

    public void push(String item) {
        pila.push(item);
    }

    public String peek() {
        return pila.peek();
    }

    public String pop() {
        return pila.pop();
    }
}
