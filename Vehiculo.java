public class Vehiculo {
    String Marca;
    String Color;
    int modelo;
    Double precio;
    int peso;
    public Vehiculo(String marca, String color, int modelo, Double precio, int peso) {
        Marca = marca;
        Color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.peso = peso;
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
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

}
