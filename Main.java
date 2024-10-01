import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        LinkedList<Vehiculo> lista = new LinkedList<>();
        lista = m.LLenarLista();
        m.MostrarLista(lista);
    }
}