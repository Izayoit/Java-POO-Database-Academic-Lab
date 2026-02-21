
package Vista_mantenimiento;

import vista_operaciones.JDialog_compras_opera;
import vista_operaciones.JDialog_ventas_opera;
import vista_reportes.JDialog_ConCompras_Reportes;
import vista_reportes.JDialog_ConVentas_Reportes;


public class JFrame_menu extends javax.swing.JFrame {

   
    public JFrame_menu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnu_item_usuario = new javax.swing.JMenuItem();
        mnu_item_categoria = new javax.swing.JMenuItem();
        mnu_item_articulo = new javax.swing.JMenuItem();
        mnu_proveedores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnu_item_compras = new javax.swing.JMenuItem();
        mnu_item_ventas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnu_item_ConsultaCompras = new javax.swing.JMenuItem();
        mnu_item_ConsultaVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/televisor.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 255));

        jMenu2.setBackground(new java.awt.Color(0, 204, 204));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Mantenimiento");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnu_item_usuario.setBackground(new java.awt.Color(153, 0, 0));
        mnu_item_usuario.setForeground(new java.awt.Color(0, 0, 102));
        mnu_item_usuario.setText("usuario");
        mnu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_usuarioActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_usuario);

        mnu_item_categoria.setForeground(new java.awt.Color(0, 0, 102));
        mnu_item_categoria.setText("categoria");
        mnu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_categoriaActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_categoria);

        mnu_item_articulo.setForeground(new java.awt.Color(0, 0, 102));
        mnu_item_articulo.setText("articulo");
        mnu_item_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_articuloActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_item_articulo);

        mnu_proveedores.setForeground(new java.awt.Color(0, 0, 102));
        mnu_proveedores.setText("personas");
        mnu_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_proveedoresActionPerformed(evt);
            }
        });
        jMenu2.add(mnu_proveedores);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Operaciones");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnu_item_compras.setForeground(new java.awt.Color(102, 0, 0));
        mnu_item_compras.setText("compras");
        mnu_item_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_comprasActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_item_compras);

        mnu_item_ventas.setForeground(new java.awt.Color(102, 0, 0));
        mnu_item_ventas.setText("ventas");
        mnu_item_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_ventasActionPerformed(evt);
            }
        });
        jMenu3.add(mnu_item_ventas);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("reportes");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnu_item_ConsultaCompras.setForeground(new java.awt.Color(0, 102, 0));
        mnu_item_ConsultaCompras.setText("consulta de compras");
        mnu_item_ConsultaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_ConsultaComprasActionPerformed(evt);
            }
        });
        jMenu4.add(mnu_item_ConsultaCompras);

        mnu_item_ConsultaVentas.setForeground(new java.awt.Color(0, 102, 0));
        mnu_item_ConsultaVentas.setText("consulta de ventas");
        mnu_item_ConsultaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_ConsultaVentasActionPerformed(evt);
            }
        });
        jMenu4.add(mnu_item_ConsultaVentas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_usuarioActionPerformed
        //new JDialog_Curso(this, true).setVisible(true);
        JDialog_usuario objVentana = new JDialog_usuario(this, true);
        objVentana.setVisible(true);
    }//GEN-LAST:event_mnu_item_usuarioActionPerformed

    private void mnu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_categoriaActionPerformed
        JDialog_categoria objcategoria = new JDialog_categoria(this,true);
        objcategoria.setVisible(true);

    }//GEN-LAST:event_mnu_item_categoriaActionPerformed

    private void mnu_item_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_articuloActionPerformed
        JDialog_articulo objarticulo = new JDialog_articulo(this, true);
        objarticulo.setVisible(true);
    }//GEN-LAST:event_mnu_item_articuloActionPerformed

    private void mnu_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_proveedoresActionPerformed
  JDialog_Persona objarticulo = new JDialog_Persona(this, true);
        objarticulo.setVisible(true);
    }//GEN-LAST:event_mnu_proveedoresActionPerformed

    private void mnu_item_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_comprasActionPerformed
        JDialog_compras_opera objcompras = new JDialog_compras_opera(this, true);
          objcompras.setVisible(true);
    }//GEN-LAST:event_mnu_item_comprasActionPerformed

    private void mnu_item_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_ventasActionPerformed
       JDialog_ventas_opera objventas = new JDialog_ventas_opera(this, true);
       objventas.setVisible(true);
    }//GEN-LAST:event_mnu_item_ventasActionPerformed

    private void mnu_item_ConsultaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_ConsultaComprasActionPerformed
      JDialog_ConCompras_Reportes objConCompras = new JDialog_ConCompras_Reportes(this, true);
      objConCompras.setVisible(true);
    }//GEN-LAST:event_mnu_item_ConsultaComprasActionPerformed

    private void mnu_item_ConsultaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_ConsultaVentasActionPerformed
      JDialog_ConVentas_Reportes objConVentas = new JDialog_ConVentas_Reportes(this, true);
      objConVentas.setVisible(true);
    }//GEN-LAST:event_mnu_item_ConsultaVentasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnu_item_ConsultaCompras;
    private javax.swing.JMenuItem mnu_item_ConsultaVentas;
    private javax.swing.JMenuItem mnu_item_articulo;
    private javax.swing.JMenuItem mnu_item_categoria;
    private javax.swing.JMenuItem mnu_item_compras;
    private javax.swing.JMenuItem mnu_item_usuario;
    private javax.swing.JMenuItem mnu_item_ventas;
    private javax.swing.JMenuItem mnu_proveedores;
    // End of variables declaration//GEN-END:variables
}
