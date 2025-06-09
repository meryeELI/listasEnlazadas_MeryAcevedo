public class Nodo {
    private int dato;
    private Nodo siguiente;

    /**
     *
     * Inicializacion nodos
     */

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public int getDatodato() {
        return dato;
    }

    public Nodo setDato(int dato) {
        this.dato = dato;
        return this;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
        return this;
    }


}
