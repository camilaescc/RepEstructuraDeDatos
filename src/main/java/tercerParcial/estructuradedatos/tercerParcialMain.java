package tercerParcial.estructuradedatos;

public class tercerParcialMain {
    public static void main(String[] args) {
        
        /*
        //SinglyLinkedList
        System.out.println("SinglyLinkedList Example");
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
        
        
        //DobleLinkedList
        System.out.println("DobleLinkedList Example");
        DoubleLinkedList lista = new DoubleLinkedList();
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlInicio(5);

        lista.mostrarAdelante();   // Salida: 5 10 20 30
        lista.mostrarAtras();      // Salida: 30 20 10 5

        lista.eliminar(20);        // Elimina el nodo con valor 20
        lista.mostrarAdelante();   // Salida: 5 10 30
        
       
        //CircularList
        CircularLinkedList lista = new CircularLinkedList();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);

        lista.mostrar();
        

        //PilaExample
        System.out.println("Pila Example");
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
        System.out.println("Cola Example");
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
        */
        
        
        //ArbolExample
        System.out.println("Arbol Example");
        ArbolBinario arbol = new ArbolBinario();

        // Insertar elementos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido in-order del arbol:");
        arbol.inOrden();  // Debería mostrar: 20 30 40 50 60 70 80

        // Buscar valores
        int buscarValor = 40;
        if (arbol.buscar(buscarValor)) {
            System.out.println("El valor " + buscarValor + " SI se encuentra en el arbol.");
        } else {
            System.out.println("El valor " + buscarValor + " NO se encuentra en el arbol.");            
    }
        
        //GrafoExample
        System.out.println("Grafo Example");
        Grafo grafo = new Grafo();

        // Agregar vértices
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");

        // Agregar aristas
        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");
        grafo.agregarArista("C", "E");

        // Mostrar grafo
        grafo.mostrarGrafo();

        // Recorrido BFS desde el vértice A
        grafo.bfs("A");
}
}

