import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    LinkedList<Vehiculo> Lista = new LinkedList<>();
    public LinkedList<Vehiculo> LLenarLista(){
        boolean continuar = true;
        String Marca;
        String Color;
        int modelo;
        Double precio;
        int peso;
        int opt =0;
        while (continuar) {
            System.out.println("Ingrese la marca: ");
            Marca = sc.next();
            System.out.println("Ingrese el color del vehiculo: ");
            Color = sc.next();
            System.out.println("Ingrese el modelo del vehiculo: ");
            modelo = sc.nextInt();
            System.out.println("Ingrese el precio del vehiculo: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese el peso del vehiculo: ");
            peso = sc.nextInt();

            Vehiculo v = new Vehiculo(Marca, Color, modelo, precio, peso);
            Lista.add(v);
            System.out.println("Desea agregar mas registros? 1=SI, 2=NO");
            opt = sc.nextInt();
            if (opt ==2) {
                continuar = false;
            }
        }

        return Lista;
    }
    public void MostrarLista(LinkedList<Vehiculo> lista){
        for (Vehiculo item : lista) {
            System.out.println( "Marca "+ item.getMarca());
            System.out.println( "Color "+ item.getColor());
            System.out.println( "Modelo "+ item.getModelo());
            System.out.println( "Precio "+ item.getPrecio());
            System.out.println( "Peso "+ item.getPeso());
        }
    }
    public LinkedList<Vehiculo> BuscarVehiculo(LinkedList<Vehiculo> lista, String nombre, Double precio){
        for (Vehiculo i : lista) {
            if (i.getMarca().equalsIgnoreCase(nombre)) {
                i.setMarca(i.getMarca());
                i.setColor(i.getColor());
                i.setModelo(i.getModelo());
                i.setPrecio(precio);
                i.setPeso(i.getPeso());
            }
        }
        return lista;
    }
}
