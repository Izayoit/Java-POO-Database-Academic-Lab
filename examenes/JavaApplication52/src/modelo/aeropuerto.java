
package modelo;


public class aeropuerto implements Pago{
    private String placa;
    private int vuelosAdultos;
    private int vuelosNiños;
    private String destino;
    private String origen;
    private String nombre;
    public aeropuerto(String placa, int vuelosAdultos, int vuelosNiños, String destino, String origen, String nombre) {
        this.placa = placa;
        this.vuelosAdultos = vuelosAdultos;
        this.vuelosNiños = vuelosNiños;
        this.destino = destino;
        this.origen = origen;
        this.nombre = nombre;
    }
    public int getVuelosAdultos() {
        return vuelosAdultos;
    }
    public void setVuelosAdultos(int vuelosAdultos) {
        this.vuelosAdultos = vuelosAdultos;
    }
    public int getVuelosNiños() {
        return vuelosNiños;
    }
    public void setVuelosNiños(int vuelosNiños) {
        this.vuelosNiños = vuelosNiños;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    public double adultos(){
    return vuelosAdultos*pasajeAdultos;
    
    }
    public double niños(){
    return vuelosNiños*pasajeNiño;
    }
    
    public double total(){
     return adultos()+niños();
    }
    public String informacion(){
    return 
            "Nombre del vuelo: " + nombre +"\n"
            +"destino: "+destino +"\n"
            + "origen: " + origen+"\n"
            + "placa: " + placa +"\n"        
            + "vuelo adultos: " + vuelosAdultos+ "\n"
            + "vuelo niños: " + vuelosNiños+ "\n";
    
    }
    
}
