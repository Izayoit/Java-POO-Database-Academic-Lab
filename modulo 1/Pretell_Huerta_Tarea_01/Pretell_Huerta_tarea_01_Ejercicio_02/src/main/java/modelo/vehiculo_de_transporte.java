
package modelo;

public class vehiculo_de_transporte {

    String tipos;
    String color;
    int precio;
    String marca;
    String estado;
    String N_placa;

    public vehiculo_de_transporte(String tipos, String color, int precio, String marca, String estado, String N_placa) {
        this.tipos = tipos;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        this.estado = estado;
        this.N_placa = N_placa;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getN_placa() {
        return N_placa;
    }

    public void setN_placa(String N_placa) {
        this.N_placa = N_placa;
    }
    
    
}
