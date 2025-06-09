public class ListaEnlazadaSimple {
    private Nodo cabeza;

    /**
     * Inicializacion nodo
     */

    public ListaEnlazadaSimple() {
        this.cabeza = cabeza;
    }
public boolean vacio(){
        if (cabeza == null){
            return true;
        }
        return false;
}

    /**
     *
     * inserta nodo al final
     */

    public void insertarInicio(int dato){
        Nodo nuevoNodo =new Nodo(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }

    /**
     *
     * eliminado principio lista returna true si es eliminado
     */
    public boolean eliminarInicio(){
        if(cabeza ==null){
            return false;
        }
        cabeza =cabeza.getSiguiente();
        return true;
    }

    /**
     *
     * metodo insertar al lfinal
     */
    public  void insertarFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);


        if(cabeza== null){//lista inicializada?
            cabeza=nuevoNodo;
            return;
        }

        Nodo actual =cabeza;
        while (actual.getSiguiente()!=null){//corre lista hasta llegar al final null
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevoNodo);
    }

    public boolean eliminar(int dato){
        if (cabeza == null){
            return false;
        }
        if (cabeza.getDatodato() == dato){
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Nodo actual = cabeza;
         while (actual.getSiguiente() != null){
             if (actual.getSiguiente().getDatodato() == dato){
                 actual.setSiguiente(actual.getSiguiente().getSiguiente());
                 return true;
             }
             actual = actual.getSiguiente();
         }
         return false;
    }

    public int tam(){//numero de nodos
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null){
            contador++;
            actual =actual.getSiguiente();
        }
        return  contador;
    }

    public  void imprimir(){
        if (cabeza==null){
            System.out.println("lista vacia");
            return;
        }
        System.out.println("Lista");
        Nodo actual =cabeza;
        while (actual != null){
            System.out.println("actual" + actual.getDatodato());
            if (actual.getSiguiente() != null){
                System.out.println("-");
                System.out.println("|");
            }

            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    /**
     *
     * obtiene info de memoria y tiempo del programa en tiempo de ejecucion.
     */
    public String infoMemoria(){
        Runtime runtime = Runtime.getRuntime();
        long memoriaUtilizada = runtime.totalMemory();
        return String.format("Tamaño total "+ memoriaUtilizada + "tiempo ejecucion:" + runtime.freeMemory());
    }



    public  boolean buscar(int obj){
        Nodo actual = cabeza;
        while (actual != null){
            if(actual.getDatodato() == obj){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

}
