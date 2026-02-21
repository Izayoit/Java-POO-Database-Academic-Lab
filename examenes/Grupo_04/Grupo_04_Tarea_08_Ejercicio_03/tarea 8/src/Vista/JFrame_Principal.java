
package Vista;

import Control.Arreglo_Dias;
import Control.Arreglo_Doctor;
import Control.Arreglo_Especialidad;
import Control.Arreglo_Horas;
import Control.Arreglo_Hospital1;
import Control.Arreglo_Paciente;
import Modelo.Dias;
import Modelo.Doctor;
import Modelo.Especialidad;
import Modelo.Horas;
import Modelo.Hospital1;
import Modelo.Paciente;
import javax.swing.JOptionPane;


public class JFrame_Principal extends javax.swing.JFrame {

    private Arreglo_Paciente objArreglo_Paciente= new Arreglo_Paciente();
    private Arreglo_Doctor objArreglo_Doctor = new Arreglo_Doctor();
    private Arreglo_Especialidad objArreglo_Especialidad = new Arreglo_Especialidad();
    private Arreglo_Dias objArreglo_Dias = new Arreglo_Dias();
    private Arreglo_Horas objArreglo_Horas = new Arreglo_Horas();
    private Arreglo_Hospital1 objArreglo_Hospital1= new Arreglo_Hospital1();
    private int p =0;
    public JFrame_Principal() {
        initComponents();
        objArreglo_Hospital1.Listar(tbl_Datos);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Datos = new javax.swing.JTable();
        btn_Registrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Especialidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_doctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_paciente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_dia = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_eliminarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Datos);

        btn_Registrar.setText("Registrar Cita");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel3.setText("Especialidad:");

        jLabel2.setText("Doctor:");

        jLabel1.setText("Paciente:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("programación semanal de turnos de los Doctores"));

        jLabel4.setText("Días de Trabajo:");

        jLabel5.setText("Horario ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_dia, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txt_hora))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btn_eliminar.setText("Eliminar Cita");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_eliminarTodo.setText("Eliminar Toda la Cita");
        btn_eliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Especialidad)
                            .addComponent(txt_paciente)
                            .addComponent(txt_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminarTodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_eliminar)
                        .addComponent(btn_Registrar)
                        .addComponent(btn_eliminarTodo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
       
        
                
        String Paciente =txt_paciente.getText();
        String Doctor = txt_doctor.getText();
        String Especialidad = txt_Especialidad.getText();
        String Dias= txt_dia.getText();
        String Horas = txt_hora.getText();
        Hospital1 objHospital1 = new Hospital1(Paciente, Doctor, Especialidad, Dias, Horas);
        Paciente objPaciente = new Paciente(Paciente);
        Doctor objDoctor = new Doctor(Doctor);
        Especialidad objEspecialidad = new Especialidad(Especialidad);
        Dias objDias = new Dias(Dias);
        Horas objHoras= new Horas(Horas);
        objArreglo_Paciente.Registrar(objPaciente);
        objArreglo_Doctor.Registrar(objDoctor);
        objArreglo_Especialidad.Registrar(objEspecialidad);
        objArreglo_Dias.Registrar(objDias);
        objArreglo_Horas.Registrar(objHoras);
        //objArreglo_Hospital1.Agregar(Paciente, Doctor, Especialidad, Dias, Horas);
        objArreglo_Hospital1.Registrar(objHospital1);
        objArreglo_Hospital1.Listar(tbl_Datos);
        for (int i = 1; i < 10; i++) {
            JOptionPane.showMessageDialog(this, "el codigo es:"+i);
            return ;
        }
        
        
            
            
         
        
        
        
        
        
        

    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int pos = tbl_Datos.getSelectedRow();
        String Paciente = txt_paciente.getText().trim();
        String Doctor = txt_doctor.getText().trim();
        String Especialidad = txt_Especialidad.getText().trim();
        String Dias = txt_dia.getText().trim();
        String Horas = txt_hora.getText().trim();
        if(pos !=-1){
            if(!Paciente.isEmpty() && !Doctor.isEmpty() && !Especialidad.isEmpty() && 
                    !Dias.isEmpty() && !Horas.isEmpty()){
           objArreglo_Hospital1.Editar(Paciente,Doctor,Especialidad,Dias,Horas, pos);
           objArreglo_Hospital1.Listar(tbl_Datos);
            }else{
              JOptionPane.showMessageDialog(this, "Ingrese un texto");
            }
         }else{
            JOptionPane.showMessageDialog(
                    this,"Selecione un cliente");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int pos_eliminar = tbl_Datos.getSelectedRow();
        if(pos_eliminar !=-1){
            int rpta = JOptionPane.showConfirmDialog(this,
                    "Desea eliminar?",
                    "Eliminación" , JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION){
            objArreglo_Hospital1.Eliminar(pos_eliminar);
            objArreglo_Hospital1.Listar(tbl_Datos);
            }
        }else{
            JOptionPane.showMessageDialog(this, "no se puede eliminar");
        
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarTodoActionPerformed
        objArreglo_Hospital1.Eliminar_Todo();
        objArreglo_Hospital1.Listar(tbl_Datos);
    }//GEN-LAST:event_btn_eliminarTodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Datos;
    private javax.swing.JTextField txt_Especialidad;
    private javax.swing.JTextField txt_dia;
    private javax.swing.JTextField txt_doctor;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_paciente;
    // End of variables declaration//GEN-END:variables
}
