package Modelo;

import javax.swing.table.DefaultTableModel;

public interface Control_Arreglos {
    
   void Registrar(Empleado elemento);
    
    void Listar(DefaultTableModel modControl);
    
    Empleado Buscar_Nombre(String nombre);
    
}
