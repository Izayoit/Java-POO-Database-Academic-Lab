
package vista;

import javax.swing.DefaultListModel;
import modelo.Empleado;
import modelo.almacen;
import modelo.empresa;

public class JFrame_principal02 extends javax.swing.JFrame {
 private Empleado objempleado;
 private almacen objalmacen;
 private empresa objempresa;
 private DefaultListModel ModLista;
 
 
 
    public JFrame_principal02() {
        initComponents();
        ModLista = new DefaultListModel();
        objempresa = new empresa();
        almacen objalmacen01 = new almacen(0, "");
almacen objalmacen02 = new almacen(0, "");
almacen objalmacen03 = new almacen(0, "");
Empleado objempleado01 = new Empleado(0, "", "");
Empleado objempleado02 = new Empleado(0, "", "");
Empleado objempleado03 = new Empleado(0, "", "");
Empleado objempleado04 = new Empleado(0, "", "");
objempresa = new empresa(objalmacen01, objalmacen02, objalmacen03);
objalmacen = new almacen(objempleado01, objempleado02, objempleado03, objempleado04);

cbn_Empleados.setSelectedIndex(0);
cbn_Almacenes.setSelectedIndex(0);
    
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_nombreEmpleado = new javax.swing.JTextField();
        txt_apellidoEmpleado = new javax.swing.JTextField();
        txt_codigoEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_RegistrarEmpleado = new javax.swing.JButton();
        cbn_Empleados = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txt_codigoAlmacen = new javax.swing.JTextField();
        txt_nombreAlmacen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_RegistrarAlmacen = new javax.swing.JButton();
        cbn_Almacenes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_datos = new javax.swing.JList<>();
        btn_consultar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_apellidoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setText("codigo:");

        jLabel2.setText("apellidos:");

        jLabel3.setText("nombres:");

        jLabel6.setText("\"EMPLEADO\"");

        btn_RegistrarEmpleado.setText("registrar");
        btn_RegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarEmpleadoActionPerformed(evt);
            }
        });

        cbn_Empleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado01", "Empleado02", "Empleado03", "Empleado04" }));
        cbn_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_EmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreEmpleado)
                            .addComponent(txt_codigoEmpleado)
                            .addComponent(txt_apellidoEmpleado)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_RegistrarEmpleado)
                    .addComponent(cbn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_RegistrarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("codigo:");

        jLabel5.setText("nombre:");

        jLabel7.setText("\"ALMACEN\"");

        btn_RegistrarAlmacen.setText("registrar");
        btn_RegistrarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarAlmacenActionPerformed(evt);
            }
        });

        cbn_Almacenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacen01", "Almacen02", "Almacen03" }));
        cbn_Almacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_AlmacenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(61, 61, 61))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreAlmacen)
                            .addComponent(txt_codigoAlmacen))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbn_Almacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_RegistrarAlmacen))
                        .addGap(53, 53, 53))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nombreAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbn_Almacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_RegistrarAlmacen)
                .addGap(8, 8, 8))
        );

        jScrollPane1.setViewportView(lst_datos);

        btn_consultar.setText("consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_crear.setText("crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_consultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void EscogerAlmacenes(){
  int pos = cbn_Almacenes.getSelectedIndex();
        switch (pos) {
            case 0: objalmacen = objempresa.getObjAlmacen01();
                break;
                case 1: objalmacen = objempresa.getObjAlmacen02();
                break;
                case 2: objalmacen = objempresa.getObjAlmacen03();
                break;
              
        }
 
 }
    public void EscogerEmpleados(){
    int pos = cbn_Empleados.getSelectedIndex();
         switch (pos) {
             case 0:  objempleado = objalmacen.getObjempleado01();
                break;
             case 1: objempleado = objalmacen.getObjempleado02();
                break;
             case 2: objempleado =objalmacen.getObjempleado03();
                break;
             case 3: objempleado = objalmacen.getObjempleado04();
                break;
            
   
   }
    
    }
    private void txt_apellidoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoEmpleadoActionPerformed
      
    }//GEN-LAST:event_txt_apellidoEmpleadoActionPerformed

    private void btn_RegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarEmpleadoActionPerformed
        objempleado.setCodigoEmpleado(Integer.parseInt(txt_codigoEmpleado.getText()));
        objempleado.setNombreEmpleado(txt_nombreEmpleado.getText());
        objempleado.setApellidoEmpleado(txt_apellidoEmpleado.getText());
       
        
    }//GEN-LAST:event_btn_RegistrarEmpleadoActionPerformed

    private void cbn_AlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_AlmacenesActionPerformed
      
        EscogerAlmacenes();
        txt_codigoAlmacen.setText(objalmacen.getCodigoAlmacen()+"");
        txt_nombreAlmacen.setText(objalmacen.getNombreAlmacen());
    }//GEN-LAST:event_cbn_AlmacenesActionPerformed

    private void cbn_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_EmpleadosActionPerformed
       
     
                int pos = cbn_Empleados.getSelectedIndex();
         switch (pos) {
             case 0:  objempleado = objalmacen.getObjempleado01();
                break;
             case 1: objempleado = objalmacen.getObjempleado02();
                break;
             case 2: objempleado =objalmacen.getObjempleado03();
                break;
             case 3: objempleado = objalmacen.getObjempleado04();
                break;}
       txt_nombreEmpleado.setText(objempleado.getNombreEmpleado());
        txt_apellidoEmpleado.setText(objempleado.getApellidoEmpleado());
        txt_codigoEmpleado.setText(objempleado.getCodigoEmpleado()+"");
        
        
        
    }//GEN-LAST:event_cbn_EmpleadosActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
          
          
            
        //almacen
        objalmacen.setCodigo(Integer.parseInt(txt_codigoAlmacen.getText()));
        int dato1 = objalmacen.getCodigoAlmacen();
        objalmacen.setNombreAlmacen(txt_nombreAlmacen.getText());
        String dato2 = objalmacen.getNombreAlmacen();
        //nombre
        objempleado.setNombreEmpleado(txt_nombreEmpleado.getText());
        String dato3 = objempleado.getNombreEmpleado();
        objempleado.setApellidoEmpleado(txt_apellidoEmpleado.getText());
        String dato4 = objempleado.getApellidoEmpleado();
        objempleado.setCodigoEmpleado(Integer.parseInt(txt_codigoEmpleado.getText()));
        int dato5 = objempleado.getCodigoEmpleado();
     
        String Asignar1= "empleado "+dato3+" "+dato4+" "+dato5+" (REGISTRADO A) "+ dato2 +" "+ dato1;
        
        int pos = cbn_Almacenes.getSelectedIndex();
        switch (pos) {
            case 0:  ModLista.addElement(Asignar1);
                break;
            case 1:  ModLista.addElement(Asignar1);
                break;
            case 2:  ModLista.addElement(Asignar1);
                break;    
            case 3:  ModLista.addElement(Asignar1);
                break;    
        }
        lst_datos.setModel(ModLista);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_RegistrarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarAlmacenActionPerformed
        objalmacen.setCodigo(Integer.parseInt(txt_codigoAlmacen.getText()+""));
      objalmacen.setNombreAlmacen(txt_nombreAlmacen.getText());
        
    }//GEN-LAST:event_btn_RegistrarAlmacenActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed


    }//GEN-LAST:event_btn_crearActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_principal02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegistrarAlmacen;
    private javax.swing.JButton btn_RegistrarEmpleado;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JComboBox<String> cbn_Almacenes;
    private javax.swing.JComboBox<String> cbn_Empleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_datos;
    private javax.swing.JTextField txt_apellidoEmpleado;
    private javax.swing.JTextField txt_codigoAlmacen;
    private javax.swing.JTextField txt_codigoEmpleado;
    private javax.swing.JTextField txt_nombreAlmacen;
    private javax.swing.JTextField txt_nombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
