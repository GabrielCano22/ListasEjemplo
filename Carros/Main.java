package Carros;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        LinkedList<Vehiculo> lista = new LinkedList<>();
        lista = m.LLenarLista();
        m.MostrarLista(lista);
        String nombre = "";
        Double precio = 0.0;
        System.out.println("Ingrese el nombre a buscar: ");
        nombre = sc.next();
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        lista = m.BuscarVehiculo(lista, nombre, precio);
        System.out.println();
        m.MostrarLista(lista);
        
    }
}