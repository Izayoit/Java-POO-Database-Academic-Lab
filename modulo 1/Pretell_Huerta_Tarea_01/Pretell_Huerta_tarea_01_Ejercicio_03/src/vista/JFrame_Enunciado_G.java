
package vista;




public class JFrame_Enunciado_G extends javax.swing.JFrame {

    public void restringir (java.awt.event.KeyEvent evt) {
    if(Character.isDigit(evt.getKeyChar())){
      evt.consume(); 
    }
    }
    public JFrame_Enunciado_G() {
        initComponents();
    }

    
    public int contador (){
    String caracteres = txt_caracteres.getText();
    int num= caracteres.length();
    return num;
    }
    public int contador1 (){
    String caracteres1 = txt_caracteres1.getText();
    int num1= caracteres1.length();
    return num1;
    }
    public int contador2 (){
    String caracteres2 = txt_caracteres2.getText();
    int num2= caracteres2.length();
    return num2;
    }
    public int contador3 (){
    String caracteres3 = txt_caracteres3.getText();
    int num3= caracteres3.length();
    return num3;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_caracteres = new javax.swing.JTextField();
        lbl_contador = new javax.swing.JLabel();
        txt_caracteres1 = new javax.swing.JTextField();
        lbl_contador1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_resultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_caracteres2 = new javax.swing.JTextField();
        txt_caracteres3 = new javax.swing.JTextField();
        lbl_contador2 = new javax.swing.JLabel();
        lbl_contador3 = new javax.swing.JLabel();
        txt_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_caracteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_caracteresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caracteresKeyTyped(evt);
            }
        });

        lbl_contador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_contador.setForeground(new java.awt.Color(255, 0, 0));
        lbl_contador.setText("0");
        lbl_contador.setToolTipText("");

        txt_caracteres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caracteres1ActionPerformed(evt);
            }
        });
        txt_caracteres1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_caracteres1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caracteres1KeyTyped(evt);
            }
        });

        lbl_contador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_contador1.setForeground(new java.awt.Color(255, 0, 51));
        lbl_contador1.setText("0");
        lbl_contador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_contador1KeyReleased(evt);
            }
        });

        jButton1.setText("aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_resultado.setEditable(false);

        jLabel1.setText("texto 1:");

        jLabel2.setText("texto 2:");

        jLabel3.setText("texto 3:");

        jLabel4.setText("texto 4:");

        txt_caracteres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caracteres2ActionPerformed(evt);
            }
        });
        txt_caracteres2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_caracteres2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caracteres2KeyTyped(evt);
            }
        });

        txt_caracteres3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caracteres3ActionPerformed(evt);
            }
        });
        txt_caracteres3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_caracteres3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_caracteres3KeyTyped(evt);
            }
        });

        lbl_contador2.setBackground(new java.awt.Color(153, 153, 153));
        lbl_contador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_contador2.setForeground(new java.awt.Color(255, 0, 51));
        lbl_contador2.setText("0");

        lbl_contador3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_contador3.setForeground(new java.awt.Color(255, 51, 51));
        lbl_contador3.setText("0");

        txt_limpiar.setText("limpiar");
        txt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(txt_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_caracteres1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_caracteres2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_caracteres3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_contador3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contador1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contador2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contador)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_caracteres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contador1)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_caracteres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contador2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_caracteres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_contador3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txt_limpiar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_caracteresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteresKeyReleased
        lbl_contador.setText(contador()+"");
    
    }//GEN-LAST:event_txt_caracteresKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(contador()<contador1() && contador()<contador2()&& contador()<contador3()  ){
           txt_resultado.setText("texo 1 es menor");
          
       }else if( contador1()<contador2()&&contador1()<contador3()&&contador1()<contador() ){
           
           txt_resultado.setText("texo 2 es menor");
       } else if(contador2()<contador1()&&contador2()<contador3()&&contador2()<contador()){
       txt_resultado.setText("el texto 3 es menor");
       } else if( contador3()<contador()&&contador3()<contador2()&&contador3()<contador1()) {
           txt_resultado.setText("el texto 4 es menor");
           
       } 
       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_caracteres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caracteres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caracteres1ActionPerformed

    private void lbl_contador1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_contador1KeyReleased
       
    }//GEN-LAST:event_lbl_contador1KeyReleased

    private void txt_caracteres1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres1KeyReleased
       lbl_contador1.setText(contador1()+"");
    }//GEN-LAST:event_txt_caracteres1KeyReleased

    private void txt_caracteres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caracteres2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caracteres2ActionPerformed

    private void txt_caracteres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caracteres3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caracteres3ActionPerformed

    private void txt_caracteres2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres2KeyReleased
        lbl_contador2.setText(contador2()+"");
    }//GEN-LAST:event_txt_caracteres2KeyReleased

    private void txt_caracteres3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres3KeyReleased
        lbl_contador3.setText(contador3()+"");
    }//GEN-LAST:event_txt_caracteres3KeyReleased

    private void txt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_limpiarActionPerformed
        txt_caracteres.setText("");
        txt_caracteres1.setText("");
        txt_caracteres2.setText("");
        txt_caracteres3.setText("");
        txt_resultado.setText("");
        lbl_contador.setText("");
        lbl_contador1.setText("");
        lbl_contador2.setText("");
        lbl_contador3.setText("");
    }//GEN-LAST:event_txt_limpiarActionPerformed

    private void txt_caracteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteresKeyTyped
        restringir (evt);
    }//GEN-LAST:event_txt_caracteresKeyTyped

    private void txt_caracteres1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres1KeyTyped
        restringir (evt);
    }//GEN-LAST:event_txt_caracteres1KeyTyped

    private void txt_caracteres2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres2KeyTyped
       restringir (evt);
    }//GEN-LAST:event_txt_caracteres2KeyTyped

    private void txt_caracteres3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_caracteres3KeyTyped
        restringir (evt);
    }//GEN-LAST:event_txt_caracteres3KeyTyped

   
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
            java.util.logging.Logger.getLogger(JFrame_Enunciado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Enunciado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Enunciado_G().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_contador;
    private javax.swing.JLabel lbl_contador1;
    private javax.swing.JLabel lbl_contador2;
    private javax.swing.JLabel lbl_contador3;
    private javax.swing.JTextField txt_caracteres;
    private javax.swing.JTextField txt_caracteres1;
    private javax.swing.JTextField txt_caracteres2;
    private javax.swing.JTextField txt_caracteres3;
    private javax.swing.JButton txt_limpiar;
    private javax.swing.JTextField txt_resultado;
    // End of variables declaration//GEN-END:variables
}
