package Control;

import Modelo.Tienda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Tienda {
    private Tienda[] arreglo = new Tienda[15];
    private int i = 0;
    
    public void Agregar(Tienda dato){
        if(Buscar_Codigo(dato.getCodigoProducto()) == -1){
            arreglo[i] = dato;
            i++;
        }
    }
    
    public int Buscar_Codigo(int codigo){
        for(int j = 0; j < i; j++){
            if(arreglo[j].getCodigoProducto()== codigo){
                return j;
            }
        }
        return -1;
    }
    
    public void Listar(JTable datos){
        String[] cabecera = {"Codigo", "Precio"};
        DefaultTableModel tableModel = new DefaultTableModel(cabecera, 0);
        datos.setModel(tableModel);
        
        for(int pos = 0; pos < i; pos++){
            tableModel.addRow(arreglo[pos].registro());
        }
    }
    
    public int MayorPrecio(){
        int mayorPrecio = 0;
        for(int pos = 0; pos <i; pos++){
            if(arreglo[pos].getPrecioProducto() > mayorPrecio){
                mayorPrecio = arreglo[pos].getPrecioProducto();
            }
        }
        return mayorPrecio;
    }
    
    public int MenorPrecio(){
        int menorPrecio = Integer.MAX_VALUE;
        for(int pos = 0; pos < i; pos++){
            if(arreglo[pos].getPrecioProducto() < menorPrecio){
                menorPrecio = arreglo[pos].getPrecioProducto();
            }
        }
        return menorPrecio;
    }
    
    public int Buscar(int precio){
        for(int pos  = 0; pos < i; pos++){
            if(arreglo[pos].getPrecioProducto() == precio){
                return arreglo[pos].getCodigoProducto();
            }
        }
        return -1;
    }
    
    public void GuardarArchivo(String guardar){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(guardar))){
            for (int j = 0; j < i; j++) {
                Tienda tienda = arreglo[j];
                String dato = tienda.getCodigoProducto()+ "," + tienda.getPrecioProducto();
                bw.write(dato);
                bw.newLine();
            }
        } catch (IOException e) {
        }
    }
    
    public void CargarArchivo(String cargar){
        try(BufferedReader br = new BufferedReader(new FileReader(cargar))) {
            String linea;
            while((linea = br.readLine()) != null){
                String[] dato = linea.split(",");
                Tienda tienda = new Tienda(Integer.parseInt(dato[0]), Integer.parseInt(dato[1]));
                Agregar(tienda);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar");
        }
    }
}
