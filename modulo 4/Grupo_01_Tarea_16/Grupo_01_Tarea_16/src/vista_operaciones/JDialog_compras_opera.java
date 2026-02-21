
package vista_operaciones;

import Control.Arreglo_PersonaNA;
import Control.Arreglo_personaAR;
import Control.PersonaDAO;
import Modelo_mantenimiento.persona;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import modelo_operaciones.Arreglo_compraAR;
import modelo_operaciones.compras;
import modelo_operaciones.comprasDAO;


public class JDialog_compras_opera extends javax.swing.JDialog {
  private int Tipo_Ope = 0;
    private compras Elemento;
     
    private Arreglo_compraAR objArregloCompra;
    private Arreglo_PersonaNA objArreglo_personaNA;
    
   
    public JDialog_compras_opera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    cbn_tipo_comprobante.addItem("Boleta");
    cbn_tipo_comprobante.addItem("Factura");
    cbn_estado.addItem("Registrado");
    cbn_estado.addItem("Pagado");
    cbn_estado.addItem("Anulado");
    
    
               
      objArreglo_personaNA = new Arreglo_PersonaNA(PersonaDAO.ContarRegistros());
        PersonaDAO.ConsultarTodosCBN(cbn_tipoPersona, objArreglo_personaNA);
       
       
        
        objArregloCompra = new Arreglo_compraAR();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);
     
    }
    
    
    public void Actualizar_Tabla() {
      
        comprasDAO.ConsultarTodos(tbl_datos, objArregloCompra);
    }
    
  
    
  private void Estado_Controles(boolean estado) {
        cbn_tipo_comprobante.setEnabled(estado);
        txt_deto.setEnabled(estado);
        spn_num_com.setEnabled(estado);
        spn_serie_com.setEnabled(estado);
        txt_impuesto.setEnabled(estado);
        cbn_estado.setEnabled(estado);
        btn_nuevo.setEnabled(!estado);
        btn_editar.setEnabled(!estado);
        btn_guardar.setEnabled(estado);
        btn_cancelar.setEnabled(estado);
        btn_cerrar.setEnabled(!estado);
        tbl_datos.setEnabled(!estado);
    }
  
 
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbn_tipo_comprobante = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_impuesto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spn_serie_com = new javax.swing.JSpinner();
        spn_num_com = new javax.swing.JSpinner();
        cbn_estado = new javax.swing.JComboBox<>();
        txt_deto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbn_tipoPersona = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_editar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Comprobante:");

        cbn_tipo_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_tipo_comprobanteActionPerformed(evt);
            }
        });

        jLabel3.setText("Serie de comprobante:");

        jLabel4.setText("Número de comprobante:");

        jLabel5.setText("Fecha y hora:");

        jLabel6.setText("Impuesto:");

        txt_impuesto.setText("18%");

        jLabel7.setText("Estado:");

        txt_deto.setText("2024-12-14 12:00:00");

        jLabel8.setText("Tipo persona:");

        cbn_tipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_tipoPersonaActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_editar.setText("editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_cancelar.setText("cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_cerrar.setText("cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_guardar.setText("guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btn_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbn_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbn_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spn_serie_com, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbn_tipo_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spn_num_com, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbn_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbn_tipo_comprobante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(spn_serie_com, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spn_num_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_deto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbn_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbn_tipo_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_tipo_comprobanteActionPerformed
     
    }//GEN-LAST:event_cbn_tipo_comprobanteActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
     
    Estado_Controles(false);
    
    String tipoComprobante = cbn_tipo_comprobante.getSelectedItem().toString();
    
    String serie_com = spn_serie_com.getValue().toString();
    
    String num_com = spn_num_com.getValue().toString();
 
    String tipo_estado = cbn_estado.getSelectedItem().toString();
    
    String deto = txt_deto.getText();
    
    double impuesto = Double.parseDouble(txt_impuesto.getText());
    
  
    

    // Obtener el ID del proveedor
    persona idproveedorfake = objArreglo_personaNA.getDato(cbn_tipoPersona.getSelectedIndex());
    int idproveedorreal = idproveedorfake.getIdpersona();

    switch (Tipo_Ope) {
        case 1: // Inserción
            Elemento = new compras();
            Elemento.setTipoComprobante(tipoComprobante);
            Elemento.setSerieComprobante(serie_com);
            Elemento.setNumComprobante(num_com);
            Elemento.setEstado(tipo_estado);
            Elemento.setFechaHora(deto);
            Elemento.setImpuesto(impuesto);
            Elemento.setIdProveedor(idproveedorreal);
            
            comprasDAO.Insertar(Elemento);
            break;

        case 2: // Actualización
            Elemento.setTipoComprobante(tipoComprobante);
            Elemento.setSerieComprobante(serie_com);
            Elemento.setNumComprobante(num_com);
            Elemento.setEstado(tipo_estado);
            Elemento.setFechaHora(deto);
            Elemento.setImpuesto(impuesto);
            Elemento.setIdProveedor(idproveedorreal);
            
            comprasDAO.Actualizar(Elemento);
            break;
    }

    // Actualizar la tabla
    Actualizar_Tabla();

    // Limpiar los campos y restablecer
    cbn_tipoPersona.setSelectedIndex(-1);
    cbn_tipo_comprobante.setSelectedIndex(-1);
    spn_num_com.setValue(1);
    spn_serie_com.setValue(1);
    cbn_estado.setSelectedIndex(-1);
    Tipo_Ope = 0;
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
 Estado_Controles(true);
    int fila = tbl_datos.getSelectedRow();
    
    if (fila != -1) {
        // Obtener valores de la fila seleccionada
        int IdIngreso = Integer.parseInt(tbl_datos.getValueAt(fila, 0).toString());
        String comprobante = tbl_datos.getValueAt(fila, 1).toString();
        String serie_comprobante = tbl_datos.getValueAt(fila, 2).toString();
        String num_comprobante = tbl_datos.getValueAt(fila, 3).toString();
        String fecha_hora = tbl_datos.getValueAt(fila, 4).toString();
        double impuesto = Double.parseDouble(tbl_datos.getValueAt(fila, 5).toString());
        String estado = tbl_datos.getValueAt(fila, 6).toString();
        int idpersona = objArregloCompra.BuscarCodigo(IdIngreso).getIdProveedor();
        
        // Configurar el objeto `Elemento`
        Elemento = new compras();
        Elemento.setIdIngreso(IdIngreso);
        Elemento.setTipoComprobante(comprobante);
        Elemento.setSerieComprobante(serie_comprobante);
        Elemento.setNumComprobante(num_comprobante);
        Elemento.setFechaHora(fecha_hora);
        Elemento.setImpuesto(impuesto);
        Elemento.setEstado(estado);
        Elemento.setIdProveedor(idpersona);
        
        // Llenar los controles con los valores de la fila
        cbn_tipo_comprobante.setSelectedItem(comprobante);
        spn_serie_com.setValue(Integer.parseInt(serie_comprobante));
        spn_num_com.setValue(Integer.parseInt(num_comprobante));
        txt_deto.setText(fecha_hora);
        txt_impuesto.setText(String.valueOf(impuesto));
        cbn_estado.setSelectedItem(estado);
        cbn_tipoPersona.setSelectedItem(objArreglo_personaNA.BuscarCodigo(idpersona).getNombre());
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un registro para editar");
    }
    
    // Cambiar operación a edición
    Tipo_Ope = 2;
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
       Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
      Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cbn_tipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_tipoPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbn_tipoPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_compras_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_compras_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_compras_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_compras_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_compras_opera dialog = new JDialog_compras_opera(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cbn_estado;
    private javax.swing.JComboBox<String> cbn_tipoPersona;
    private javax.swing.JComboBox<String> cbn_tipo_comprobante;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_num_com;
    private javax.swing.JSpinner spn_serie_com;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_deto;
    private javax.swing.JTextField txt_impuesto;
    // End of variables declaration//GEN-END:variables
}
