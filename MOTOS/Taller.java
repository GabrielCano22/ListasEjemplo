package MOTOS;
import java.util.LinkedList;
import java.util.Scanner;

public class Taller {

    Scanner sc = new Scanner(System.in);

    public LinkedList<ObjMotos> ColocarLlanta(){
        LinkedList<ObjMotos> lista = new LinkedList<>();
        Taller t = new Taller();
        // LinkedList<ObjListasLlanta> listaLlantas = new LinkedList<>();
        boolean continuar = true;
        while (continuar) {
            if (lista.size()==0) {
                System.out.println(" Antes de continuar debe agregar la lista de llantas");
                t.ListaLlantas();
            }
            // ObjMotos o = new ObjMotos();
            // System.out.println("Ingrese el tipo de llanta");
        }
        return lista;
    }
    public LinkedList<ObjListasLlanta> ListaLlantas(){
        LinkedList<ObjListasLlanta> lista = new LinkedList<>();
        boolean continuar = true;
        while (continuar) {
            ObjListasLlanta obj = new ObjListasLlanta();
            System.out.println("Ingrese la referencia");
            obj.setReferencia(sc.next());
            System.out.println("Ingrese el tipo de llanta");
            obj.setTipoLlanta(sc.next());
            lista.add(obj);
            System.out.println("Desea ingresar mas datos? 1=si; 2=no");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un valor válido");
                sc.next();
            }
            int opt = sc.nextInt();
            while (opt <=0 || opt >2) {
                System.out.println("Esta opcion no es válida");
                sc.next();
                
            }
            if (opt ==2) {
                continuar = false;
            }
        }
        return lista;
    }
}
