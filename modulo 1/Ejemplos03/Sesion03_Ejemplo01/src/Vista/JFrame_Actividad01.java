package Vista;

import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.JOptionPane;

public class JFrame_Actividad01 extends javax.swing.JFrame {

    public JFrame_Actividad01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Valor1 = new javax.swing.JLabel();
        txt_Valor1 = new javax.swing.JTextField();
        lbl_Valor2 = new javax.swing.JLabel();
        txt_Valor2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Datos = new javax.swing.JList<>();
        lbl_Valor3 = new javax.swing.JLabel();
        txt_Valor3 = new javax.swing.JTextField();
        btn_Procesar1 = new javax.swing.JButton();
        btn_procesar2 = new javax.swing.JButton();
        btn_procesar3 = new javax.swing.JButton();
        btn_procesar4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        lbl_Valor1.setText("Valor1:");

        lbl_Valor2.setText("Valor2:");

        txt_Valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Valor2ActionPerformed(evt);
            }
        });

        lst_Datos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_Datos);

        lbl_Valor3.setText("Valor3:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Valor2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Valor1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Valor3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Valor1)
                    .addComponent(txt_Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Valor2)
                    .addComponent(txt_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Valor3)
                    .addComponent(txt_Valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_Procesar1.setText("Procesar 01");
        btn_Procesar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Procesar1ActionPerformed(evt);
            }
        });

        btn_procesar2.setText("Procesar 02");
        btn_procesar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesar2ActionPerformed(evt);
            }
        });

        btn_procesar3.setText("Procesar 03");
        btn_procesar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesar3ActionPerformed(evt);
            }
        });

        btn_procesar4.setText("Procesar 04");
        btn_procesar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesar4ActionPerformed(evt);
            }
        });

        jButton1.setText("Procesar 05");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_procesar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Procesar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_procesar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_procesar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Procesar1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_procesar2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_procesar3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_procesar4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Valor2ActionPerformed

    private void btn_Procesar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Procesar1ActionPerformed
        DefaultListModel modLista = new DefaultListModel();
        lst_Datos.setModel(modLista);
        int valor1 = Integer.parseInt(txt_Valor1.getText());
        int valor2 = Integer.parseInt(txt_Valor2.getText());
        int valor3 = Integer.parseInt(txt_Valor3.getText());
        for (int n = valor1 ; n >= valor2; n= n - valor3   ){
            modLista.addElement(n);
            
        }
        
    }//GEN-LAST:event_btn_Procesar1ActionPerformed

    private void btn_procesar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesar2ActionPerformed
        DefaultListModel modLista = new DefaultListModel();
        lst_Datos.setModel(modLista);
        int dato = Integer.parseInt( JOptionPane.showInputDialog("ingrese numero"));
        for(int n=1; n<35 ;n=n+2){
            int resultado = dato*n;
        modLista.addElement(dato +"x"+ n +"=" +resultado );
        
        }
    }//GEN-LAST:event_btn_procesar2ActionPerformed

    
    private void btn_procesar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesar3ActionPerformed
        DefaultListModel modLista = new DefaultListModel();
        lst_Datos.setModel(modLista);
        int suma =0 ;
        do {  
        int valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
        
        if(valor ==0) {
        break;
        }
        else if((suma+valor)<=100){
        suma +=  valor ;
        
        modLista.addElement(suma);
        }else{
            JOptionPane.showMessageDialog(this, "error");
            
        
        }
        
        }while (suma<100);
        
        

        
        
    }//GEN-LAST:event_btn_procesar3ActionPerformed

    private void btn_procesar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesar4ActionPerformed
      DefaultListModel modLista = new DefaultListModel();
        lst_Datos.setModel(modLista);
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
        while(n<20){
        n++;
        modLista.addElement(n);
        } 
    }//GEN-LAST:event_btn_procesar4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultListModel modLista = new DefaultListModel();
        lst_Datos.setModel(modLista);
        
        int rpta= JOptionPane.YES_OPTION;
       do{
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor"));
        modLista.addElement(n);
        rpta = JOptionPane.showConfirmDialog(this, "desae continuar?");
       }while(rpta !=JOptionPane.YES_OPTION);
    }//GEN-LAST:event_jButton1ActionPerformed

  
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
    private javax.swing.JButton btn_Procesar1;
    private javax.swing.JButton btn_procesar2;
    private javax.swing.JButton btn_procesar3;
    private javax.swing.JButton btn_procesar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Valor1;
    private javax.swing.JLabel lbl_Valor2;
    private javax.swing.JLabel lbl_Valor3;
    private javax.swing.JList<String> lst_Datos;
    private javax.swing.JTextField txt_Valor1;
    private javax.swing.JTextField txt_Valor2;
    private javax.swing.JTextField txt_Valor3;
    // End of variables declaration//GEN-END:variables
}
