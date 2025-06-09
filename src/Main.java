public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple l = new ListaEnlazadaSimple();

        System.out.println("esta vacio?"+ l.vacio());

        l.insertarInicio(10);
        l.insertarInicio(20);
        l.insertarInicio(2);
        l.imprimir();
        l.eliminarInicio();
        l.imprimir();
        l.insertarFinal(100);
        l.imprimir();
        l.eliminar(20);
        l.imprimir();
        System.out.println("elemeto encontrado: "+l.buscar(100));
        System.out.println("elemento encontrado: " + l.buscar(20));
        System.out.println(l.infoMemoria());
        System.out.println("elementos en la lista: "+l.tam());
    }
}
