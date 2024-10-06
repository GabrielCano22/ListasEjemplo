package Carros;
public class Vehiculo {
    String Marca;
    String Color;
    int Modelo;
    Double Precio;
    int Peso;
    public Vehiculo(String marca, String color, int modelo, Double precio, int peso) {
        Marca = marca;
        Color = color;
        Modelo = modelo;
        Precio = precio;
        Peso = peso;
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
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int modelo) {
        this.Modelo = modelo;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        this.Precio = precio;
    }
    public int getPeso() {
        return Peso;
    }
    public void setPeso(int peso) {
        this.Peso = peso;
    }

}
