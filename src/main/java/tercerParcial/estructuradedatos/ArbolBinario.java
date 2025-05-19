package tercerParcial.estructuradedatos;

/**
 *
 * @author milae
 */

class NodoArbol {
    int dato;
    NodoArbol izquierda, derecha;

    public NodoArbol(int dato) {
        this.dato = dato;
        izquierda = derecha = null;
    }
}
public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar nodo en el árbol
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, int dato) {
        if (actual == null) {
            return new NodoArbol(dato);
        }

        if (dato < actual.dato) {
            actual.izquierda = insertarRecursivo(actual.izquierda, dato);
        } else if (dato > actual.dato) {
            actual.derecha = insertarRecursivo(actual.derecha, dato);
        }

        return actual;
    }

    // Recorrido in-order (izquierda, raíz, derecha)
    public void inOrden() {
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            inOrdenRecursivo(nodo.derecha);
        }
    }

    // Buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.dato) {
            return true;
        }
        return valor < actual.dato
                ? buscarRecursivo(actual.izquierda, valor)
                : buscarRecursivo(actual.derecha, valor);
    }
}
