
package Control;

import Modelo.Hospital1;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_Hospital1 {
    private Hospital1[][] arreglo = new Hospital1[15][5];
    //private String [][] arregla;
    /*public Arreglo_Hospital1() {
        arregla = new String[15][5];
    }*/
    
    private int i=0;
    
    public  void Listar(JTable control){
        String[] cabezera = {"Paciente", "Doctor", "Especialidad", "Día", "Hora"};
        DefaultTableModel modTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(modTabla);

        for (int j = 0; j < i; j++) {
            if (arreglo[j][0] != null) {
                Object[] fila = arreglo[j][0].registro(); 
                modTabla.addRow(fila); 
            }
        }
    }
    
    /*public void Agregar(String Paciente,String Doctor,String Especialidad,String Dias,String Horas){
        if(i<arregla.length){
        arregla[i][0]=Paciente;
        arregla[i][1]=Doctor; 
        arregla[i][2]=Especialidad; 
        arregla[i][3]=Dias; 
        arregla[i][4]=Horas; 
        i++;
    }else{
        JOptionPane.showMessageDialog(null, "Lista Lena");
      } 
    }*/
    /*public void Listar(JTable control) {
        String[] cabezera = {"Paciente", "Doctor", "Especialidad", "Día", "Hora"};
        DefaultTableModel modTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(modTabla);

        for (int j = 0; j < i; j++) {
            Object[] fila = new Object[5];
            fila[0] = arreglo[j][0].getPacienteArreglo(); 
            fila[1] = arreglo[j][1].getDoctorArreglo(); 
            fila[2] = arreglo[j][2];
            fila[3] = arreglo[j][3]; 
            fila[4] = arreglo[j][4];

            modTabla.addRow(fila); 
        }
    }*/

    
    public void Registrar(Hospital1 dato) {
        if (Buscar_Paciente(dato.getPacienteArreglo()) == -1) {
        arreglo[i][0] = dato; 
        i++;
        }
        }
    public int Buscar_Paciente(String paciente) {
    for (int j = 0; j < i; j++) {
            if (arreglo[j][0].getPacienteArreglo().equals(paciente)) {
            return j; 
            }
        }
        return -1; 
    }
    
   
    /*public void Registrar(Hospital1 dato){
        if(Buscar_Paciente(dato.getPacienteArreglo()).equals(-1)){
            arreglo[i].equals(dato);
            i++;
        }
        
    }*/
    /* public String Buscar_Paciente(String Paciente){
        for (int j = 0; j < i; j++) {
            if(arreglo[j][0].getPacienteArreglo().equals(Paciente)){
            return j;
            } 
        }
        return -1;
    }*/
    /*public void Editar(String Paciente, String Doctor,String Especialidad,String Dias, String Horas, int pos){
     arreglo[pos][0]= Paciente;
     arreglo[pos][1]= Doctor;
     arreglo[pos][2]= Especialidad;
     arreglo[pos][3]= Dias;
     arreglo[pos][4]= Horas;
    }*/
    public void Editar(String paciente, String doctor, String especialidad, String dias, String horas, int pos) {
    Hospital1 nuevoRegistro = new Hospital1(paciente, doctor, especialidad, dias, horas);
    arreglo[pos][0] = nuevoRegistro;
    }
    public void Eliminar(int eliminar){
        for (int pos =eliminar; pos < arreglo.length-1; pos++) {
           arreglo[pos] = arreglo[pos+1]; 
        }
        i--;
    }
    public void Eliminar_Todo(){
        i=0;
    }

}

    
 

    
    

