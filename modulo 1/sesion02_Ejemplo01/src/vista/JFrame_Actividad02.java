
package vista;

import javax.swing.JOptionPane;
public class JFrame_Actividad02 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Actividad02
     */
    public JFrame_Actividad02() {
        initComponents();
    }
private void Restringir_solo_numeros(java.awt.event.KeyEvent evt) {
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbl_valor1 = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        txt_valor1 = new javax.swing.JTextField();
        txt_resultad = new javax.swing.JTextField();
        btn_procesar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_valor1.setText("valor1:");

        lbl_resultado.setText("resultado:");

        txt_valor1.setBackground(new java.awt.Color(204, 255, 255));
        txt_valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor1ActionPerformed(evt);
            }
        });
        txt_valor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valor1KeyTyped(evt);
            }
        });

        txt_resultad.setEditable(false);
        txt_resultad.setBackground(new java.awt.Color(204, 255, 255));
        txt_resultad.setEnabled(false);
        txt_resultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultadActionPerformed(evt);
            }
        });

        btn_procesar.setText("procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });
        btn_procesar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_procesarKeyTyped(evt);
            }
        });

        btn_cerrar.setText("cerrar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resultado))
                .addGap(44, 44, 44)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_procesar))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txt_resultad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cerrar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor1)
                    .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_procesar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado)
                    .addComponent(btn_cerrar)
                    .addComponent(txt_resultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor1ActionPerformed

    private void txt_valor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valor1KeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
    }
    }//GEN-LAST:event_txt_valor1KeyTyped

    private void txt_resultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultadActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        
    /*if(txt_valor1.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, 
                                     "inserte el codigo");
          
       

    }  else {
        int dato= Integer.parseInt(txt_valor1.getText());
        txt_resultad.setText(dato+"");
    }*/
    
        if(!txt_valor1.getText().isEmpty()) {
            int dato =Integer.parseInt(txt_valor1.getText());
            txt_resultad.setText(null);
            switch (dato) {
                case 1: txt_resultad.setText(txt_resultad.getText()+"3%");
                    
                case 2: txt_resultad.setText(txt_resultad.getText()+"6%");
                case 3: txt_resultad.setText(txt_resultad.getText()+"9%");
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        

    }//GEN-LAST:event_btn_procesarActionPerformed

    private void btn_procesarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_procesarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_procesarKeyTyped

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
            java.util.logging.Logger.getLogger(JFrame_Actividad02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Actividad02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_valor1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_resultad;
    private javax.swing.JTextField txt_valor1;
    // End of variables declaration//GEN-END:variables
}
