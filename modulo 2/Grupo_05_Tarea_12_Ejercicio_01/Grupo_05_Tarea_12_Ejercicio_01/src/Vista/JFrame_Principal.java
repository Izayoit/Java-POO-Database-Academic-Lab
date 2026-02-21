package Vista;

import Control.Arreglo_Administrativo;
import Control.Arreglo_Docente;
import Modelo.Administrativo;
import Modelo.Docente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame_Principal extends javax.swing.JFrame {

    private Arreglo_Docente objArreglo_Docente = new Arreglo_Docente();
    private Arreglo_Administrativo objArreglo_Administrativo = new Arreglo_Administrativo();
    private DefaultTableModel tableModelDocente, tableModelAdm;

    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Configurar_Tabla_admi();
        Actualizar_Tabla_admi();

        Configurar_Tabla_docente();
        Actualizar_Tabla_docente();
    }

    private void Configurar_Tabla_docente() {
        String[] cabecera = {"Nombre", "Apellidos", "Sueldo", "Categoria", "N°Horas"};
        tableModelDocente = new DefaultTableModel(cabecera, 0);
        tbl_datos_docente.setModel(tableModelDocente);
    }

    private void Actualizar_Tabla_docente() {
        objArreglo_Docente.Listar(tableModelDocente);
    }

    private void Configurar_Tabla_admi() {
        String[] cabecera = {"Nombre", "Apellidos", "Sueldo", "Jefatura", "Cargo"};
        tableModelAdm = new DefaultTableModel(cabecera, 0);
        tbl_datos_admi.setModel(tableModelAdm);
    }

    private void Actualizar_Tabla_admi() {
        objArreglo_Administrativo.Listar(tableModelAdm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_nombre_docente = new javax.swing.JLabel();
        txt_nombre_docente = new javax.swing.JTextField();
        lbl_apellidos_docente = new javax.swing.JLabel();
        txt_apellidos_docente = new javax.swing.JTextField();
        lbl_sueldo_docente = new javax.swing.JLabel();
        txt_sueldo_docente = new javax.swing.JTextField();
        lbl_categoria_docente = new javax.swing.JLabel();
        txt_categoria_docente = new javax.swing.JTextField();
        lbl_n_horas_docente = new javax.swing.JLabel();
        spn_n_horas_docente = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_datos_docente = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_mostrar_info_docente = new javax.swing.JTextArea();
        btn_registrar_doc = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbl_nombre_admi = new javax.swing.JLabel();
        txt_nombre_admi = new javax.swing.JTextField();
        lbl_apellidos_admi = new javax.swing.JLabel();
        txt_apellidos_admi = new javax.swing.JTextField();
        lbl_sueldo_admi = new javax.swing.JLabel();
        txt_sueldo_admi = new javax.swing.JTextField();
        lbl_jefatura_admi = new javax.swing.JLabel();
        txt_jefatura_admi = new javax.swing.JTextField();
        lbl_cargo_admi = new javax.swing.JLabel();
        txt_cargo_admi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos_admi = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mostrar_info_admi = new javax.swing.JTextArea();
        btn_registrar_admi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 0, 14))); // NOI18N

        lbl_nombre_docente.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_nombre_docente.setText("Nombre:");

        lbl_apellidos_docente.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_apellidos_docente.setText("Apellidos:");

        lbl_sueldo_docente.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_sueldo_docente.setText("Sueldo:");

        lbl_categoria_docente.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_categoria_docente.setText("Categoria:");

        lbl_n_horas_docente.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_n_horas_docente.setText("N° Horas:");

        spn_n_horas_docente.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        tbl_datos_docente.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_datos_docente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_datos_docenteMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_datos_docente);

        txt_mostrar_info_docente.setColumns(20);
        txt_mostrar_info_docente.setRows(5);
        jScrollPane4.setViewportView(txt_mostrar_info_docente);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellidos_docente)
                    .addComponent(lbl_sueldo_docente)
                    .addComponent(lbl_nombre_docente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_sueldo_docente)
                    .addComponent(txt_nombre_docente)
                    .addComponent(txt_apellidos_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_categoria_docente)
                    .addComponent(lbl_n_horas_docente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_categoria_docente)
                    .addComponent(spn_n_horas_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_docente)
                    .addComponent(txt_nombre_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_categoria_docente)
                    .addComponent(txt_categoria_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos_docente)
                    .addComponent(txt_apellidos_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_n_horas_docente)
                    .addComponent(spn_n_horas_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sueldo_docente)
                    .addComponent(txt_sueldo_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        btn_registrar_doc.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btn_registrar_doc.setText("Registrar");
        btn_registrar_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_docActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registrar_doc)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_registrar_doc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Docente", jPanel5);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Administrativo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 0, 14))); // NOI18N

        lbl_nombre_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_nombre_admi.setText("Nombre:");

        lbl_apellidos_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_apellidos_admi.setText("Apellidos:");

        lbl_sueldo_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_sueldo_admi.setText("Sueldo:");

        lbl_jefatura_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_jefatura_admi.setText("Jefatura:");

        lbl_cargo_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        lbl_cargo_admi.setText("Cargo:");

        tbl_datos_admi.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_datos_admi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_datos_admiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_datos_admi);

        txt_mostrar_info_admi.setColumns(20);
        txt_mostrar_info_admi.setRows(5);
        jScrollPane2.setViewportView(txt_mostrar_info_admi);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre_admi)
                            .addComponent(lbl_apellidos_admi)
                            .addComponent(lbl_sueldo_admi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apellidos_admi)
                            .addComponent(txt_sueldo_admi)
                            .addComponent(txt_nombre_admi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cargo_admi)
                            .addComponent(lbl_jefatura_admi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_jefatura_admi)
                            .addComponent(txt_cargo_admi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre_admi)
                            .addComponent(txt_nombre_admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellidos_admi)
                            .addComponent(txt_apellidos_admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_jefatura_admi)
                            .addComponent(txt_jefatura_admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cargo_admi)
                            .addComponent(txt_cargo_admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sueldo_admi)
                    .addComponent(txt_sueldo_admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btn_registrar_admi.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btn_registrar_admi.setText("Registrar");
        btn_registrar_admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_admiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_registrar_admi)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrar_admi)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Administrativo", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_docActionPerformed
        try {
            String nombre = txt_nombre_docente.getText();
            String apellidos = txt_apellidos_docente.getText();
            double sueldo = Double.parseDouble(txt_sueldo_docente.getText());
            String categoria = txt_categoria_docente.getText();
            int n_horas = (int) spn_n_horas_docente.getValue();
            Docente dato = new Docente(categoria, n_horas, nombre, apellidos, sueldo);
            objArreglo_Docente.Registrar(dato);
            Actualizar_Tabla_docente();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor numérico inválido");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Lista llena");
        }

    }//GEN-LAST:event_btn_registrar_docActionPerformed

    private void btn_registrar_admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_admiActionPerformed
        try {
            String nombre = txt_nombre_admi.getText();
            String apellidos = txt_apellidos_admi.getText();
            double sueldo = Double.parseDouble(txt_sueldo_admi.getText());
            String jefatura = txt_jefatura_admi.getText();
            String cargo = txt_cargo_admi.getText();
            Administrativo dato = new Administrativo(jefatura, cargo, nombre, apellidos, sueldo);
            objArreglo_Administrativo.Registrar(dato);
            Actualizar_Tabla_admi();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor numérico inválido");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Lista llena");
        }
    }//GEN-LAST:event_btn_registrar_admiActionPerformed

    private void tbl_datos_docenteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datos_docenteMouseReleased

        DefaultTableModel modTabla = (DefaultTableModel) tbl_datos_docente.getModel();
        int fila = tbl_datos_docente.getSelectedRow();
        if (fila != -1) {
            String nombre = (String) modTabla.getValueAt(fila, 0);
            Docente objDoc = (Docente) objArreglo_Docente.Buscar_Nombre(nombre);
            txt_mostrar_info_docente.setText(objDoc.MostrarInfo());
        }
        
        
        
    }//GEN-LAST:event_tbl_datos_docenteMouseReleased

    private void tbl_datos_admiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datos_admiMouseReleased
        DefaultTableModel modTabla = (DefaultTableModel) tbl_datos_admi.getModel();
        int fila = tbl_datos_admi.getSelectedRow();
        if (fila != -1) {
            String nombre = (String) modTabla.getValueAt(fila, 0);
            Administrativo objAdm = (Administrativo) objArreglo_Administrativo.Buscar_Nombre(nombre);
            txt_mostrar_info_admi.setText(objAdm.MostrarInfo());
        }
        
       
    }//GEN-LAST:event_tbl_datos_admiMouseReleased

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar_admi;
    private javax.swing.JButton btn_registrar_doc;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lbl_apellidos_admi;
    private javax.swing.JLabel lbl_apellidos_docente;
    private javax.swing.JLabel lbl_cargo_admi;
    private javax.swing.JLabel lbl_categoria_docente;
    private javax.swing.JLabel lbl_jefatura_admi;
    private javax.swing.JLabel lbl_n_horas_docente;
    private javax.swing.JLabel lbl_nombre_admi;
    private javax.swing.JLabel lbl_nombre_docente;
    private javax.swing.JLabel lbl_sueldo_admi;
    private javax.swing.JLabel lbl_sueldo_docente;
    private javax.swing.JSpinner spn_n_horas_docente;
    private javax.swing.JTable tbl_datos_admi;
    private javax.swing.JTable tbl_datos_docente;
    private javax.swing.JTextField txt_apellidos_admi;
    private javax.swing.JTextField txt_apellidos_docente;
    private javax.swing.JTextField txt_cargo_admi;
    private javax.swing.JTextField txt_categoria_docente;
    private javax.swing.JTextField txt_jefatura_admi;
    private javax.swing.JTextArea txt_mostrar_info_admi;
    private javax.swing.JTextArea txt_mostrar_info_docente;
    private javax.swing.JTextField txt_nombre_admi;
    private javax.swing.JTextField txt_nombre_docente;
    private javax.swing.JTextField txt_sueldo_admi;
    private javax.swing.JTextField txt_sueldo_docente;
    // End of variables declaration//GEN-END:variables
}
