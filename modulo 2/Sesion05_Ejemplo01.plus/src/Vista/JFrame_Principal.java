package Vista;

import Modelo.Motor;
import Modelo.Rueda;
import Modelo.Vehiculo;

public class JFrame_Principal extends javax.swing.JFrame {

    Vehiculo objvehiculo;
    Rueda objRueda=null; 
    public JFrame_Principal() {
        initComponents();
        objvehiculo = new Vehiculo()
                ;
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbo_Marca_Motor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spn_Potencia_Motor = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txt_Consumo_Motor = new javax.swing.JTextField();
        btn_Actualizar_Motor = new javax.swing.JButton();
        btn_Limpiar_Motor = new javax.swing.JButton();
        btn_Cargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbo_Rueda = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Peso_Rueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbo_Color_Rueda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_Marca_Rueda = new javax.swing.JComboBox<>();
        btn_Actualizar_Rueda = new javax.swing.JButton();
        btn_Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("propietario del vehiculo:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Motor"));

        jLabel6.setText("Marca:");

        cbo_Marca_Motor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ferrary", "Toyota", "Lexus", "Ford", "Honda", "" }));

        jLabel7.setText("Potencia:");

        jLabel8.setText("Consumo:");

        btn_Actualizar_Motor.setText("Actualizar");
        btn_Actualizar_Motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_MotorActionPerformed(evt);
            }
        });

        btn_Limpiar_Motor.setText("Limpiar");
        btn_Limpiar_Motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Limpiar_MotorActionPerformed(evt);
            }
        });

        btn_Cargar.setText("Cargar");
        btn_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Consumo_Motor)
                            .addComponent(spn_Potencia_Motor)
                            .addComponent(cbo_Marca_Motor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Limpiar_Motor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar_Motor)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_Marca_Motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spn_Potencia_Motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Consumo_Motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Actualizar_Motor)
                    .addComponent(btn_Limpiar_Motor)
                    .addComponent(btn_Cargar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Rueda:");

        cbo_Rueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rueda01", "Rueda02", "Rueda03", "Rueda04" }));
        cbo_Rueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_RuedaMouseClicked(evt);
            }
        });
        cbo_Rueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_RuedaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de las Ruedas"));

        jLabel2.setText("Peso:");

        txt_Peso_Rueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Peso_RuedaActionPerformed(evt);
            }
        });

        jLabel3.setText("Color:");

        cbo_Color_Rueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Rojo", "Azul" }));

        jLabel4.setText("Marca:");

        cbo_Marca_Rueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Michelin", "GodYeard", "Continental" }));

        btn_Actualizar_Rueda.setText("Actualizar");
        btn_Actualizar_Rueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar_RuedaActionPerformed(evt);
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Peso_Rueda)
                            .addComponent(cbo_Color_Rueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbo_Marca_Rueda, 0, 217, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar_Rueda)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Peso_Rueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_Color_Rueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_Marca_Rueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Actualizar_Rueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Nombre))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_Rueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbo_Rueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Crear.setText("Crear");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Crear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_RuedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_RuedaActionPerformed
        int pos = cbo_Rueda.getSelectedIndex();
        
        
        /*switch (pos) {
            case 0: objRueda = objvehiculo.getObjRueda01();
                
                break;
             case 1:objRueda = objvehiculo.getObjRueda02();
                
                break;
             case 2:objRueda = objvehiculo.getObjRueda03();
                
                break;
             case 3:objRueda = objvehiculo.getObjRueda04();
                
                break; 
             
            
        }*/
        objRueda=objvehiculo.getRueda(pos);
        txt_Peso_Rueda.setText(objRueda.getPeso()+"");
        cbo_Color_Rueda.setSelectedItem(objRueda.getColor());
        cbo_Marca_Rueda.setSelectedItem(objRueda.getMarca());
    }//GEN-LAST:event_cbo_RuedaActionPerformed

    private void btn_Actualizar_MotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_MotorActionPerformed
          Motor objMotor= objvehiculo.getObjMotor();
          objMotor.setMarca(cbo_Marca_Motor.getSelectedItem().toString());
          objMotor.setPotencia(Integer.parseInt(spn_Potencia_Motor.getValue().toString()));
          objMotor.setConsumo(Double.parseDouble(txt_Consumo_Motor.getText()));
    }//GEN-LAST:event_btn_Actualizar_MotorActionPerformed

    private void btn_Limpiar_MotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpiar_MotorActionPerformed
         cbo_Marca_Motor.setSelectedItem("");
         spn_Potencia_Motor.setValue(0);
         txt_Consumo_Motor.setText("");
    }//GEN-LAST:event_btn_Limpiar_MotorActionPerformed

    private void btn_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarActionPerformed
          Motor objMotor= objvehiculo.getObjMotor();
        cbo_Marca_Motor.setSelectedItem(objMotor.getMarca());
        txt_Consumo_Motor.setText(objMotor.getConsumo()+"");
        spn_Potencia_Motor.setValue(objMotor.getPotencia());
    }//GEN-LAST:event_btn_CargarActionPerformed

    private void btn_Actualizar_RuedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar_RuedaActionPerformed
         
        objRueda.setPeso(Double.parseDouble(txt_Peso_Rueda.getText()));
        objRueda.setColor(cbo_Color_Rueda.getSelectedItem().toString());
        objRueda.setMarca(cbo_Marca_Rueda.getSelectedItem().toString());
    }//GEN-LAST:event_btn_Actualizar_RuedaActionPerformed

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        Motor objMotor = new  Motor("Lexus", 100, 251.54);
        Rueda objRueda01 = new Rueda(4.5, "Blanco", "Michelin");
        Rueda objRueda02 = new Rueda(5.5, "Negro", "Continental");
        Rueda objRueda03 = new Rueda(3.5, "Blanco", "Michelin");
        Rueda objRueda04 = new Rueda(6.5, "Azul", "GodYeard");
        objvehiculo.setObjMotor(objMotor);
        objvehiculo.setRueda(objRueda01, 0);
        objvehiculo.setRueda(objRueda02, 1);
        objvehiculo.setRueda(objRueda03, 2);
        objvehiculo.setRueda(objRueda04, 3);
        cbo_Rueda.setSelectedIndex(0);
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void txt_Peso_RuedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Peso_RuedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Peso_RuedaActionPerformed

    private void cbo_RuedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_RuedaMouseClicked
       
    }//GEN-LAST:event_cbo_RuedaMouseClicked

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
    private javax.swing.JButton btn_Actualizar_Motor;
    private javax.swing.JButton btn_Actualizar_Rueda;
    private javax.swing.JButton btn_Cargar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Limpiar_Motor;
    private javax.swing.JComboBox<String> cbo_Color_Rueda;
    private javax.swing.JComboBox<String> cbo_Marca_Motor;
    private javax.swing.JComboBox<String> cbo_Marca_Rueda;
    private javax.swing.JComboBox<String> cbo_Rueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner spn_Potencia_Motor;
    private javax.swing.JTextField txt_Consumo_Motor;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Peso_Rueda;
    // End of variables declaration//GEN-END:variables
}
