package tercerParcial.estructuradedatos;

public class tercerParcialMain {
    public static void main(String[] args) {
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
    }
}

