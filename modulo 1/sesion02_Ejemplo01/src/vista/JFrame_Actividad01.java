
package vista;

import javax.swing.JOptionPane;


public class JFrame_Actividad01 extends javax.swing.JFrame {

    
    public JFrame_Actividad01() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        lbl_valor1 = new javax.swing.JLabel();
        lbl_valor2 = new javax.swing.JLabel();
        lbl_valor3 = new javax.swing.JLabel();
        lbl_resultado = new javax.swing.JLabel();
        txt_valor1 = new javax.swing.JTextField();
        txt_valor2 = new javax.swing.JTextField();
        txt_valor3 = new javax.swing.JTextField();
        txt_resultad = new javax.swing.JTextField();
        btn_procesar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_valor1.setText("valor1:");

        lbl_valor2.setText("valor2:");

        lbl_valor3.setText("valor3:");

        lbl_resultado.setText("resultado:");

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

        txt_valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor2ActionPerformed(evt);
            }
        });
        txt_valor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valor2KeyTyped(evt);
            }
        });

        txt_valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valor3ActionPerformed(evt);
            }
        });
        txt_valor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valor3KeyTyped(evt);
            }
        });

        txt_resultad.setEditable(false);
        txt_resultad.setBackground(new java.awt.Color(204, 204, 204));
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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resultado))
                .addGap(44, 44, 44)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_procesar))
                    .addComponent(txt_valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_resultad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_valor1)
                            .addComponent(txt_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_procesar)))
                .addGap(12, 12, 12)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor2)
                    .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor3)
                    .addComponent(txt_valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_resultado)
                    .addComponent(txt_resultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor1ActionPerformed

    private void txt_resultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultadActionPerformed

    private void txt_valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor2ActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        /*
        1.determine si una persona es mayor de edad
        */
        /*
        int edad =Integer.parseInt(txt_valor1.getText());
        if (edad>=18) {
            txt_resultad.setText("Mayor de edad");  
        }else { txt_resultad.setText("menor de edad");
            
        }*/
      /* 2.determinar el mayor numero de entre 3 valores
      
        */
      if(txt_valor1.getText().isEmpty()||txt_valor2.getText().isEmpty() || txt_valor3.getText().isEmpty() ) {
          JOptionPane.showMessageDialog(this, 
                                     "escribe no seas vago");
          
      }else{ int n1 = Integer.parseInt(txt_valor1.getText());
                int n2 = Integer.parseInt(txt_valor2.getText());
                int n3 = Integer.parseInt(txt_valor3.getText());
                if (n1>n2 && n1>n3){
                    txt_resultad.setText(n1+"");
             } else if(n2>n1 && n2>n3) {
                            txt_resultad.setText(n2+"");
             }        else {
                 txt_resultad.setText(n3 +"");
             } 
      }
     
    
                
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void txt_valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valor3ActionPerformed

    
    private void Restringir_solo_numeros(java.awt.event.KeyEvent evt) {
        if(!Character.isAlphabetic(evt.getKeyChar())){
           evt.consume();
    }
    }
    private void txt_valor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valor1KeyTyped
        Restringir_solo_numeros(evt);
    }//GEN-LAST:event_txt_valor1KeyTyped

    private void txt_valor3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valor3KeyTyped
         Restringir_solo_numeros(evt);
    }//GEN-LAST:event_txt_valor3KeyTyped

    private void txt_valor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valor2KeyTyped
         Restringir_solo_numeros(evt);
    }//GEN-LAST:event_txt_valor2KeyTyped

   
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
            java.util.logging.Logger.getLogger(JFrame_Actividad01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Actividad01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Actividad01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_valor1;
    private javax.swing.JLabel lbl_valor2;
    private javax.swing.JLabel lbl_valor3;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txt_resultad;
    private javax.swing.JTextField txt_valor1;
    private javax.swing.JTextField txt_valor2;
    private javax.swing.JTextField txt_valor3;
    // End of variables declaration//GEN-END:variables
}
