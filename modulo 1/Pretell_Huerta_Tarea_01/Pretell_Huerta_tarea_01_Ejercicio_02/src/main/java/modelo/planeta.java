
package modelo;


public class planeta {
    String color;
    double densidad;
    double tamaño;
    int temperatura;
    String planeta;

    public planeta(String color, double densidad, double tamaño, int temperatura, String planeta) {
        this.color = color;
        this.densidad = densidad;
        this.tamaño = tamaño;
        this.temperatura = temperatura;
        this.planeta = planeta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    
    
}
