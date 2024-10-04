package MOTOS;
public class ObjMotos {

    String Llantas ="";
    String Marca ="";
    String Color="";
    Double precio = 0.0;
    int Cilindraje = 0;
    
    public String getLlantas() {
        return Llantas;
    }

    public void setLlantas(String llantas) {
        Llantas = llantas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public ObjMotos(){
        
    }
}
