
package vista;

import modelo.encuesta;

public class JFrame_principal03 extends javax.swing.JFrame {
String NombreArchivo ="Encuesta";
   encuesta objencuesta;
    public JFrame_principal03() {
        
        initComponents();
        objencuesta = new encuesta();
       objencuesta.listar(tbl_datos);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        tbl_table = new javax.swing.JPanel();
        btn_procesar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbt_1V = new javax.swing.JRadioButton();
        rbt_1F = new javax.swing.JRadioButton();
        rbt_2V = new javax.swing.JRadioButton();
        rbt_2F = new javax.swing.JRadioButton();
        rbt_3V = new javax.swing.JRadioButton();
        rbt_3F = new javax.swing.JRadioButton();
        rbt_4V = new javax.swing.JRadioButton();
        rbt_4F = new javax.swing.JRadioButton();
        rbt_5V = new javax.swing.JRadioButton();
        rbt_5F = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_abrir = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_procesar.setText("procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        jLabel1.setText("1.-¿Las laptops en su mayoria se puede agregar mas RAM?");

        jLabel3.setText("2.-¿Las pc pueden usar otras partes para mejorarlo?");

        jLabel4.setText("3.-¿la raiz cuadrada de 8 es 3?");

        jLabel5.setText("¿no game no life tendra segunda temporada? ");

        jLabel6.setText("4.-¿fujimori fue el mejor presidente del peru?");

        buttonGroup1.add(rbt_1V);
        rbt_1V.setText("verdad");
        rbt_1V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_1VActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_1F);
        rbt_1F.setText("falso");

        buttonGroup2.add(rbt_2V);
        rbt_2V.setText("verdad");

        buttonGroup2.add(rbt_2F);
        rbt_2F.setText("falso");

        buttonGroup3.add(rbt_3V);
        rbt_3V.setText("verdad");

        buttonGroup3.add(rbt_3F);
        rbt_3F.setText("falso");

        buttonGroup4.add(rbt_4V);
        rbt_4V.setText("verdad");

        buttonGroup4.add(rbt_4F);
        rbt_4F.setText("falso");

        buttonGroup5.add(rbt_5V);
        rbt_5V.setText("verdad");

        buttonGroup5.add(rbt_5F);
        rbt_5F.setText("falso");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("0");

        jLabel2.setText("Resultados:");

        btn_abrir.setText("guardar");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_cargar.setText("abrir");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbl_tableLayout = new javax.swing.GroupLayout(tbl_table);
        tbl_table.setLayout(tbl_tableLayout);
        tbl_tableLayout.setHorizontalGroup(
            tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbl_tableLayout.createSequentialGroup()
                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbl_tableLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbt_1V, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(tbl_tableLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbt_2V, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tbl_tableLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                                .addComponent(rbt_5V, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(117, 117, 117)
                                                .addComponent(rbt_5F, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rbt_4V, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(rbt_3V, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(tbl_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tbl_tableLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tbl_tableLayout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rbt_1F, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbt_4F, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbt_3F, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rbt_2F, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(67, 67, 67)
                                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(btn_procesar)))))
                    .addGroup(tbl_tableLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btn_abrir)
                        .addGap(93, 93, 93)
                        .addComponent(btn_cargar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        tbl_tableLayout.setVerticalGroup(
            tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbl_tableLayout.createSequentialGroup()
                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbl_tableLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt_1V)
                            .addComponent(rbt_1F))
                        .addGap(32, 32, 32)
                        .addComponent(btn_procesar)
                        .addGap(59, 59, 59)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(rbt_3V)
                        .addGap(18, 18, 18)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(40, 40, 40)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt_4V)
                            .addComponent(rbt_4F))
                        .addGap(29, 29, 29)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt_5V)
                            .addComponent(rbt_5F)))
                    .addGroup(tbl_tableLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt_2V)
                            .addComponent(rbt_2F))
                        .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(rbt_3F))
                            .addGroup(tbl_tableLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(tbl_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrir)
                    .addComponent(btn_cargar))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tbl_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
  //!
  if(rbt_1V.isSelected()){
   String dato1 = " pregunta 1 = correcto" ;
 String dato1P = "20%";
   objencuesta.Agregar(dato1);
   objencuesta.listar(tbl_datos);
   jLabel7.setText(dato1P);
   
  }else if(rbt_1F.isSelected()){
  String dato2 = " pregunta 1 = incorrecto" ;
  String dato2P = "0";
  
   objencuesta.Agregar(dato2);
   objencuesta.listar(tbl_datos);
   jLabel7.setText(dato2P);
  }
  //2
   if(rbt_2V.isSelected()){
 String dato1A = " pregunta 2 = correcto" ;
 String dato2B = "20%";
   objencuesta.Agregar(dato1A);
   objencuesta.listar(tbl_datos);
   jLabel8.setText(dato2B);
   
  }else if(rbt_2F.isSelected()){
  String dato2 = "pregunta 2 = incorrecto" ;
  String dato2P="0";
   objencuesta.Agregar(dato2);
   objencuesta.listar(tbl_datos);
   jLabel8.setText(dato2P);
  }
   if(rbt_3V.isSelected()){
 String dato1 = "pregunta 3 =incorrecto" ;
 String dato1P = "0";
   objencuesta.Agregar(dato1);
   objencuesta.listar(tbl_datos);
   jLabel9.setText(dato1P);
   
  }else if(rbt_3F.isSelected()){
  String dato2 = "pregunta 3 = correcto" ;
  String dato2P = "20%";
   objencuesta.Agregar(dato2);
   objencuesta.listar(tbl_datos);
   jLabel9.setText(dato2P);
   
  }
   //4
   if(rbt_4V.isSelected()){
 String dato1 = " pregunta 4 =correcto" ;
 String dato1P = "20%";
   objencuesta.Agregar(dato1);
   objencuesta.listar(tbl_datos);
   jLabel10.setText(dato1P);
   
  }else if(rbt_4F.isSelected()){
  String dato2 = "pregunta 4 = incorrecto" ;
  String dato2P = "0";
   objencuesta.Agregar(dato2);
   objencuesta.listar(tbl_datos);
   jLabel10.setText(dato2P);
   
  }
  if(rbt_5V.isSelected()){
 String dato1 = " pregunta 5 = incorrecto" ;
 String dato1P = "0";
   objencuesta.Agregar(dato1);
   objencuesta.listar(tbl_datos);
   jLabel11.setText(dato1P);
   
  }else if(rbt_5F.isSelected()){
  String dato2 = " pregunta 5 = correcto" ;
  String dato2P ="20%";
   objencuesta.Agregar(dato2);
   objencuesta.listar(tbl_datos);
   jLabel11.setText(dato2P);
   
  }      
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void rbt_1VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_1VActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_1VActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
      objencuesta.guardar(NombreArchivo);
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        
        objencuesta.cargar(NombreArchivo);
        objencuesta.listar(tbl_datos);
        
    }//GEN-LAST:event_btn_cargarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbt_1F;
    private javax.swing.JRadioButton rbt_1V;
    private javax.swing.JRadioButton rbt_2F;
    private javax.swing.JRadioButton rbt_2V;
    private javax.swing.JRadioButton rbt_3F;
    private javax.swing.JRadioButton rbt_3V;
    private javax.swing.JRadioButton rbt_4F;
    private javax.swing.JRadioButton rbt_4V;
    private javax.swing.JRadioButton rbt_5F;
    private javax.swing.JRadioButton rbt_5V;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JPanel tbl_table;
    // End of variables declaration//GEN-END:variables
}
