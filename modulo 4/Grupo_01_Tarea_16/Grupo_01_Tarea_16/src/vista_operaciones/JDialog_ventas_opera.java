
package vista_operaciones;

import Control.Arreglo_PersonaNA;
import Control.Arreglo_usuarioNA;
import Control.PersonaDAO;
import Control.UsuarioDAO;
import Modelo_mantenimiento.persona;
import Modelo_mantenimiento.usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo_operaciones.Arreglo_ventasAR;
import modelo_operaciones.ventas;
import modelo_operaciones.ventasDAO;
import modelo_reportes.consulta_ventasDAO;


public class JDialog_ventas_opera extends javax.swing.JDialog {
private int Tipo_Ope = 0;
private ventas Elemento;
private Arreglo_ventasAR objArregloVentas;
private Arreglo_usuarioNA objarregloUsuarioNA;
private Arreglo_PersonaNA objarregloPersonaNA;
    
    public JDialog_ventas_opera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
     
    cbn_tipo_comprobante.addItem("Boleta");
    cbn_tipo_comprobante.addItem("Factura");
    cbn_estado.addItem("Registrado");
    cbn_estado.addItem("Pagado");
    cbn_estado.addItem("Anulado");
    
    objarregloPersonaNA = new Arreglo_PersonaNA(PersonaDAO.ContarRegistros());
        PersonaDAO.ConsultarTodosCBN(cbn_tipoPersona, objarregloPersonaNA);
    
    objarregloUsuarioNA = new Arreglo_usuarioNA(UsuarioDAO.ContarRegistros());
       UsuarioDAO.ConsultarTodosCBN(cbn_usuario, objarregloUsuarioNA);
        
        objArregloVentas = new Arreglo_ventasAR();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);
        
        
    }

    
    private void actualizarTotalVenta() {
        if (Elemento != null && Elemento.getIdVentas() != 0) {
            try {
                double totalVenta = consulta_ventasDAO.calcularTotalVenta(Elemento.getIdVentas());
                txt_total_venta.setText(String.format("%.2f", totalVenta));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al calcular el total de venta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
     
    
    
     public void Actualizar_Tabla() {
      
        ventasDAO.ConsultarTodos(tbl_datos, objArregloVentas);
    }
    
  
    
  private void Estado_Controles(boolean estado) {
        cbn_tipo_comprobante.setEnabled(estado);
        txt_deto.setEnabled(estado);
        spn_num_com.setEnabled(estado);
        spn_serie_com.setEnabled(estado);
        txt_impuesto.setEnabled(estado);
        txt_total_venta.setEnabled(estado);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spn_serie_com = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spn_num_com = new javax.swing.JSpinner();
        cbn_tipo_comprobante = new javax.swing.JComboBox<>();
        txt_total_venta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbn_estado = new javax.swing.JComboBox<>();
        cbn_tipoPersona = new javax.swing.JComboBox<>();
        txt_impuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_deto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbn_usuario = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos_venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel5.setText("Fecha y hora:");

        jLabel7.setText("Estado:");

        jLabel2.setText("Comprobante:");

        jLabel6.setText("Impuesto:");

        jLabel8.setText("Tipo persona:");

        cbn_tipo_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_tipo_comprobanteActionPerformed(evt);
            }
        });

        jLabel3.setText("Serie de comprobante:");

        cbn_tipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_tipoPersonaActionPerformed(evt);
            }
        });

        txt_impuesto.setText("18%");

        jLabel4.setText("Número de comprobante:");

        jLabel9.setText("total_venta:");

        txt_deto.setText("2024-12-14 12:00:00");

        jLabel1.setText("usuario:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_nuevo.setText("nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setText("guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cerrar.setText("cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_editar.setText("editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btn_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbn_tipo_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spn_serie_com, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spn_num_com, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbn_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txt_deto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbn_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbn_tipo_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
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
                                .addGap(6, 6, 6))
                            .addComponent(txt_deto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbn_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbn_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Estado_Controles(true);
        int fila = tbl_datos.getSelectedRow();

        if (fila != -1) {
            // Obtener valores de la fila seleccionada
            int IdVentas = Integer.parseInt(tbl_datos.getValueAt(fila, 0).toString());
            String comprobante = tbl_datos.getValueAt(fila, 1).toString();
            String serie_comprobante = tbl_datos.getValueAt(fila, 2).toString();
            String num_comprobante = tbl_datos.getValueAt(fila, 3).toString();
            String fecha_hora = tbl_datos.getValueAt(fila, 4).toString();
            double impuesto = Double.parseDouble(tbl_datos.getValueAt(fila, 5).toString());
            double total_Ventas= Double.parseDouble(tbl_datos.getValueAt(fila, 6).toString());
            String estado = tbl_datos.getValueAt(fila, 7).toString();
            
            int idpersona = objArregloVentas.BuscarCodigo(IdVentas).getId_Persona_Cliente();
            int idusuario = objArregloVentas.BuscarCodigo(IdVentas).getId_usuario();

            // Configurar el objeto `Elemento`
            Elemento = new ventas();
            Elemento.setIdVentas(IdVentas);
            Elemento.setTipo_comprobante(comprobante);
            Elemento.setSerie_comprobante(serie_comprobante);
            Elemento.setNum_comprobante(num_comprobante);
            Elemento.setFecha_hora(fecha_hora);
            Elemento.setImpuesto(impuesto);
            Elemento.setTotalVenta(total_Ventas);
            Elemento.setEstado(estado);
            Elemento.setId_Persona_Cliente(idpersona);
            Elemento.setId_usuario(idusuario);

            // Llenar los controles con los valores de la fila
            cbn_tipo_comprobante.setSelectedItem(comprobante);
            spn_serie_com.setValue(Integer.parseInt(serie_comprobante));
            spn_num_com.setValue(Integer.parseInt(num_comprobante));
            txt_deto.setText(fecha_hora);
            txt_impuesto.setText(impuesto+"");
            txt_total_venta.setText(total_Ventas+"");
            cbn_estado.setSelectedItem(estado);
            
            cbn_tipoPersona.setSelectedItem(objarregloPersonaNA.BuscarCodigo(idpersona).getNombre());
            cbn_usuario.setSelectedItem(objarregloUsuarioNA.BuscarCodigo(idusuario).getNombre());
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para editar");
        }

        // Cambiar operación a edición
        Tipo_Ope = 2;
        actualizarTotalVenta();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        Estado_Controles(false);

        String tipoComprobante = cbn_tipo_comprobante.getSelectedItem().toString();

        String serie_com = spn_serie_com.getValue().toString();

        String num_com = spn_num_com.getValue().toString();
        
        String deto = txt_deto.getText();
        
        double impuesto = Double.parseDouble(txt_impuesto.getText());
        
        double total_venta = Double.parseDouble(txt_total_venta.getText());
        
        String tipo_estado = cbn_estado.getSelectedItem().toString();

        

        

        // Obtener el ID 
        persona idproveedorfake = objarregloPersonaNA.getDato(cbn_tipoPersona.getSelectedIndex());
        int idproveedorreal = idproveedorfake.getIdpersona();
        usuario idusuariofake = objarregloUsuarioNA.getDato(cbn_usuario.getSelectedIndex());
        int idusuarioreal =  idusuariofake.getIduser();

        switch (Tipo_Ope) {
            case 1: // Inserción
                
            Elemento = new ventas();
            Elemento.setTipo_comprobante(tipoComprobante);
            Elemento.setSerie_comprobante(serie_com);
            Elemento.setNum_comprobante(num_com);
            Elemento.setFecha_hora(deto);   
            Elemento.setImpuesto(impuesto);
            Elemento.setTotalVenta(total_venta);
            Elemento.setEstado(tipo_estado);
            
            Elemento.setId_Persona_Cliente(idproveedorreal);
            Elemento.setId_usuario(idusuarioreal);

            ventasDAO.Insertar(Elemento);
              actualizarTotalVenta();
            break;

            case 2: // Actualización
                
            Elemento.setTipo_comprobante(tipoComprobante);
            Elemento.setSerie_comprobante(serie_com);
            Elemento.setNum_comprobante(num_com);
            Elemento.setFecha_hora(deto);   
            Elemento.setImpuesto(impuesto);
            Elemento.setTotalVenta(total_venta);
            Elemento.setEstado(tipo_estado);
            
            Elemento.setId_Persona_Cliente(idproveedorreal);
            Elemento.setId_usuario(idusuarioreal);

            ventasDAO.Actualizar(Elemento);
              actualizarTotalVenta();
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

    private void cbn_tipo_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_tipo_comprobanteActionPerformed

    }//GEN-LAST:event_cbn_tipo_comprobanteActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_ventas_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_ventas_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_ventas_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_ventas_opera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_ventas_opera dialog = new JDialog_ventas_opera(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbn_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_num_com;
    private javax.swing.JSpinner spn_serie_com;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_deto;
    private javax.swing.JTextField txt_impuesto;
    private javax.swing.JTextField txt_total_venta;
    // End of variables declaration//GEN-END:variables
}
