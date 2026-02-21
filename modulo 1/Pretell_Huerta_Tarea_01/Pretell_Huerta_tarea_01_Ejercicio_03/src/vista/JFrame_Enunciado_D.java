
package vista;


public class JFrame_Enunciado_D extends javax.swing.JFrame {

   
    public JFrame_Enunciado_D() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_numero1 = new javax.swing.JTextField();
        txt_numero2 = new javax.swing.JTextField();
        txt_numero3 = new javax.swing.JTextField();
        txt_solicitar = new javax.swing.JButton();
        txt_limpiar = new javax.swing.JButton();
        txt_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("numero1:");

        jLabel2.setText("numero2:");

        jLabel3.setText("numero3:");

        txt_numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero1ActionPerformed(evt);
            }
        });
        txt_numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numero1KeyTyped(evt);
            }
        });

        txt_numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numero2KeyTyped(evt);
            }
        });

        txt_numero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numero3KeyTyped(evt);
            }
        });

        txt_solicitar.setText("solicitar");
        txt_solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_solicitarActionPerformed(evt);
            }
        });

        txt_limpiar.setText("limpiar");
        txt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_limpiarActionPerformed(evt);
            }
        });

        txt_cerrar.setText("cerrar");
        txt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_solicitar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_numero1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txt_numero2)
                            .addComponent(txt_numero3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txt_limpiar)))
                .addGap(18, 18, 18)
                .addComponent(txt_cerrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_solicitar)
                    .addComponent(txt_limpiar)
                    .addComponent(txt_cerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void restringir (java.awt.event.KeyEvent evt) {
    if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
        }
 
 }
    private void txt_numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero1ActionPerformed

    private void txt_solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_solicitarActionPerformed
        double dato1= Double.parseDouble(txt_numero1.getText());
        double date1= (dato1/180)*3.14 ;
        txt_numero1.setText(date1+"rads"); 
        double dato2= Double.parseDouble(txt_numero2.getText());
        double date2= (dato2/180)*3.14 ;
        txt_numero2.setText(date2+"rads"); 
        double dato3= Double.parseDouble(txt_numero3.getText());
        double date3= (dato3/180)*3.14;
        txt_numero3.setText(date3+"rads"); 
        
        
    }//GEN-LAST:event_txt_solicitarActionPerformed
   
    private void txt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_limpiarActionPerformed
        txt_numero1.setText("");
        txt_numero2.setText("");
        txt_numero3.setText("");
        
    }//GEN-LAST:event_txt_limpiarActionPerformed

    private void txt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_txt_cerrarActionPerformed

    private void txt_numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero1KeyTyped
        restringir (evt);
    }//GEN-LAST:event_txt_numero1KeyTyped

    private void txt_numero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero2KeyTyped
       restringir (evt);
    }//GEN-LAST:event_txt_numero2KeyTyped

    private void txt_numero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero3KeyTyped
        restringir (evt);
    }//GEN-LAST:event_txt_numero3KeyTyped

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
            java.util.logging.Logger.getLogger(JFrame_Enunciado_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Enunciado_D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txt_cerrar;
    private javax.swing.JButton txt_limpiar;
    private javax.swing.JTextField txt_numero1;
    private javax.swing.JTextField txt_numero2;
    private javax.swing.JTextField txt_numero3;
    private javax.swing.JButton txt_solicitar;
    // End of variables declaration//GEN-END:variables
}
