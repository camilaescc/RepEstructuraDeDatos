package tercerParcial.estructuradedatos;

public class tercerParcialMain {
    public static void main(String[] args) {
        
        //SinglyLinkedList
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        // Mostrar la lista actual
        System.out.println("Lista original:");
        list.display();
        // Agregar un nuevo valor
        list.insert(40);
        // Mostrar la lista después de insertar
        System.out.println("Despues de insertar 40:");
        list.display();
        
        
        //PilaExample
        PilaExample pila = new PilaExample();
        // PUSH: Agregando elementos
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");
        // PEEK: Consultando el elemento en la cima
        System.out.println("Elemento en la cima: " + pila.peek());
        // POP: Eliminando elementos de la pila
        System.out.println("Elemento removido: " + pila.pop());
        System.out.println("Elemento removido: " + pila.pop());
        // PEEK: Estado final de la pila
        System.out.println("Elemento en la cima ahora: " + pila.peek());
        
        
        //ColaExample
        ColaExample cola = new ColaExample();
        // ENQUEUE: Agregando elementos a la cola
        cola.agregarCliente("Cami");
        cola.agregarCliente("Rodri");
        cola.agregarCliente("Pau");
        // PEEK: Consultando quién está al frente
        System.out.println("Cliente al frente: " + cola.verClienteAlFrente());
        // DEQUEUE: Atendiendo clientes
        System.out.println("Atendiendo a: " + cola.atenderCliente());
        System.out.println("Atendiendo a: " + cola.atenderCliente());
        // PEEK: Quién está ahora al frente
        System.out.println("Cliente al frente ahora: " + cola.verClienteAlFrente());
    }
}

