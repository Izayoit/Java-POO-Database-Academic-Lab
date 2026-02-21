package Vista_mantenimiento;

import Control.Arreglo_personaAR;
import Control.PersonaDAO;
import Modelo_mantenimiento.persona;
import static java.lang.String.valueOf;

import javax.swing.JOptionPane;
import sun.jvm.hotspot.utilities.IntArray;

public class JDialog_Persona extends javax.swing.JDialog {
    
    private int Tipo_Ope = 0;
    private persona Elemento;
    private Arreglo_personaAR objArregloPersona;
    
    public JDialog_Persona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    cbo_Persona.addItemListener(new java.awt.event.ItemListener() {
    @Override
    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            Tipos_Persona();
        }
    }
});
        objArregloPersona = new Arreglo_personaAR();
        setLocationRelativeTo(parent);
        Actualizar_Tabla();
        Estado_Controles(false);
        Tipos_Persona();
    }
    
    public void Actualizar_Tabla() {
        /*EstudianteDAO.ConsultarTodos(tbl_datos, objArregloEstudiante);*/
        PersonaDAO.ConsultarTodos(tbl_datos, objArregloPersona);
    }
     
    public void Tipos_Persona() {
        String tipo_persona = (String) cbo_Persona.getSelectedItem();
        if ("Cliente".equals(tipo_persona)) {
        cbo_Documento.setSelectedItem("DNI");
    } else if ("Proveedor".equals(tipo_persona)) {
        cbo_Documento.setSelectedItem("RUC");
    
    }
    }
    private void Estado_Controles(boolean estado) {
        cbo_Persona.setEnabled(estado);
        txt_Nombres.setEnabled(estado);
        // txt_Apellidos.setEnabled(estado);
        //cbo_Documento.setEnabled(estado);
        cbo_Documento.setEnabled(false);
        txt_numDocumento.setEnabled(estado);
        txt_Direccion.setEnabled(estado);
        txt_Telefono.setEnabled(estado);
        txt_email.setEnabled(estado);
        btn_Nuevo.setEnabled(!estado);
        btn_Editar.setEnabled(!estado);
        btn_Guardar.setEnabled(estado);
        btn_Cancelar.setEnabled(estado);
        btn_Eliminar.setEnabled(!estado);
        btn_Cerrar.setEnabled(!estado);
        tbl_datos.setEnabled(!estado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbo_Persona = new javax.swing.JComboBox<>();
        cbo_Documento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_numDocumento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Nombres:");

        jLabel2.setText("TIpo de Doc.:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Email:");

        jLabel5.setText("Tipo de Pers.:");

        cbo_Persona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Proveedor" }));
        cbo_Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_PersonaActionPerformed(evt);
            }
        });

        cbo_Documento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        cbo_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_DocumentoActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefono:");

        jLabel7.setText("Núm. Doc.:");

        txt_numDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numDocumentoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbo_Persona, 0, 230, Short.MAX_VALUE)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbo_Documento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Telefono)
                    .addComponent(txt_email)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txt_numDocumento))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbo_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_numDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17))
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

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Nuevo);

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Editar);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Guardar);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cancelar);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Eliminar);

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cerrar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos del Cliente");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Estado_Controles(true);
        Tipo_Ope = 1;
     
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        Estado_Controles(true);
        int fila = tbl_datos.getSelectedRow();
        if (fila != -1) {
            int Idpersona = Integer.parseInt(tbl_datos.getValueAt(fila, 0).toString());
            String tipo_persona = objArregloPersona.BuscarPersona(Idpersona).getTipo_persona();
            String Nombres = tbl_datos.getValueAt(fila, 2).toString();
            String tipo_documento = objArregloPersona.BuscarPersona(Idpersona).getTipo_documento();            
            int num_documento = Integer.parseInt(tbl_datos.getValueAt(fila, 4).toString());
            String direccion = tbl_datos.getValueAt(fila, 5).toString();
            int telefono = Integer.parseInt(tbl_datos.getValueAt(fila, 6).toString());
            String email = tbl_datos.getValueAt(fila, 7).toString();
            
            Elemento = new persona();
            Elemento.setIdpersona(Idpersona);
            Elemento.setTipo_persona(tipo_persona);
            Elemento.setNombre(Nombres);
            Elemento.setTipo_documento(tipo_documento);
            Elemento.setNum_documento(num_documento);
            Elemento.setDireccion(direccion);
            Elemento.setTelefono(telefono);
            Elemento.setEmail(email);
            cbo_Persona.setSelectedItem(objArregloPersona.BuscarPersona(Idpersona).getTipo_persona());
            txt_Nombres.setText(Nombres);
            cbo_Documento.setSelectedItem(objArregloPersona.BuscarPersona(Idpersona).getTipo_documento());
            txt_numDocumento.setText(num_documento + "");
            txt_Direccion.setText(direccion);
            txt_Telefono.setText(telefono + "");
            txt_email.setText(email);
            
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }
        Tipo_Ope = 2;
        cbo_Documento.setEnabled(true);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Estado_Controles(false);
     
        String tipo_persona = cbo_Persona.getSelectedItem().toString();
        
        String Nombres = txt_Nombres.getText();

     
          
        String tipo_docu = cbo_Documento.getSelectedItem().toString();
        
        int num_docu = Integer.parseInt(txt_numDocumento.getText());
        String direccion = txt_Direccion.getText();
        int telefono = Integer.parseInt(txt_Telefono.getText());
        String email = txt_email.getText();

        switch (Tipo_Ope) {
            case 1:
                Elemento = new persona();
                Elemento.setTipo_persona(tipo_persona);
                Elemento.setNombre(Nombres);
               Elemento.setTipo_documento(tipo_docu);
               Elemento.setNum_documento(num_docu);
               Elemento.setDireccion(direccion);
               Elemento.setTelefono(telefono);
               Elemento.setEmail(email);
              
                PersonaDAO.Insertar(Elemento);
               
                break;
            case 2:
                
                Elemento.setTipo_persona(tipo_persona+"");
                Elemento.setNombre(Nombres);
               Elemento.setTipo_documento(tipo_docu+"");
               Elemento.setDireccion(direccion);
               Elemento.setTelefono(telefono);
               Elemento.setEmail(email);
                PersonaDAO.Actualizar(Elemento);
        }
        Actualizar_Tabla();
        cbo_Persona.setSelectedIndex(-1);
        txt_Nombres.setText("");
       cbo_Documento.setSelectedIndex(-1);
      txt_numDocumento.setText("");
       txt_Direccion.setText("");
       txt_Telefono.setText("");
       txt_email.setText("");
       
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
     int rpta = JOptionPane.showConfirmDialog(this, "Desea eliminar?", "Eliminación", JOptionPane.YES_NO_OPTION);
        if (rpta == JOptionPane.YES_OPTION) {
            if (Elemento != null) {
                PersonaDAO.Eliminar(Elemento);
                Elemento = null;
                Actualizar_Tabla();
            } else {
                JOptionPane.showMessageDialog(this, "Ningún curso ha sido seleccionado");
            }
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Estado_Controles(false);
        Tipo_Ope = 0;
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void txt_numDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numDocumentoKeyTyped
        String tipo_documento = (String)cbo_Documento.getSelectedItem();
        if("DNI".equals(tipo_documento)&& txt_numDocumento.getText().length()>= 8){
            evt.consume();
        }else if("RUC".equals(tipo_documento)&& txt_numDocumento.getText().length() >= 10){
            evt.consume();
        }
        
    }//GEN-LAST:event_txt_numDocumentoKeyTyped

    private void cbo_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_DocumentoActionPerformed

    private void cbo_PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_PersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_PersonaActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Persona dialog = new JDialog_Persona(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cbo_Documento;
    private javax.swing.JComboBox<String> cbo_Persona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_numDocumento;
    // End of variables declaration//GEN-END:variables
}
