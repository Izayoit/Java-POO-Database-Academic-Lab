package Vista;

import Modelo.Alumno;
import Modelo.Asistencia;
import Modelo.Aula;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {

    private Aula objAula;
    private Alumno objAlumno = null;
    private int pos_alumno = -1;
    private int pos_semana = 0;
    private int pos_dia = 0;
    private int asistencia_dia;
    private DefaultListModel modLista;
    private Asistencia objAsistencia;
    //private DefaultComboBoxModel modComboSemana, modComboDia;
    
    public JFrame_Principal() {
        initComponents();
    }
    
    public void Cargar_Asistencia(){
        switch (pos_semana) {
            case 0: objAsistencia = objAlumno.getObjAsistencia01();                
                break;
            case 1: objAsistencia = objAlumno.getObjAsistencia02();                
                break;
            case 2: objAsistencia = objAlumno.getObjAsistencia03();                
                break;
            case 3: objAsistencia = objAlumno.getObjAsistencia04();                
                break;
        }
        switch (pos_dia) {
            case 0: asistencia_dia = objAsistencia.getLunes();
                break;
            case 1: asistencia_dia = objAsistencia.getMartes();
                break;
            case 2: asistencia_dia = objAsistencia.getMiercoles();
                break;
            case 3: asistencia_dia = objAsistencia.getJueves();
                break;
            case 4: asistencia_dia = objAsistencia.getViernes();
                break;
        }
        switch (asistencia_dia) {
            case 1: rbt_Asistio.setSelected(true);
                break;
            case 2: rbt_NoAsistio.setSelected(true);
                break;
            default:rbt_SinAsignar.setSelected(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_asistencia = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        btn_ActualizarAlumno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbo_Semana = new javax.swing.JComboBox<>();
        cbo_Dia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rbt_SinAsignar = new javax.swing.JRadioButton();
        rbt_Asistio = new javax.swing.JRadioButton();
        rbt_NoAsistio = new javax.swing.JRadioButton();
        btn_ActualizarAsistencia = new javax.swing.JButton();
        btn_CrearAula = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spn_NumAlumnos = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Alumnos = new javax.swing.JList<>();
        btn_CrearRelacionAlumnos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Alumno"));

        jLabel1.setText("Apellidos:");

        jLabel2.setText("Nombres:");

        btn_ActualizarAlumno.setText("Actualizar Alumno");
        btn_ActualizarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarAlumnoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencia"));

        jLabel3.setText("Semana:");

        cbo_Semana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semana 01", "Semana 02", "Semana 03", "Semana 04" }));
        cbo_Semana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_SemanaActionPerformed(evt);
            }
        });

        cbo_Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" }));
        cbo_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_DiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Día de la Semana:");

        grupo_asistencia.add(rbt_SinAsignar);
        rbt_SinAsignar.setSelected(true);
        rbt_SinAsignar.setText("Sin Registrar");

        grupo_asistencia.add(rbt_Asistio);
        rbt_Asistio.setText("Asistió");

        grupo_asistencia.add(rbt_NoAsistio);
        rbt_NoAsistio.setText("No Asistió");

        btn_ActualizarAsistencia.setText("Actualizar Asistencia");
        btn_ActualizarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_Semana, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_Dia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbt_SinAsignar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt_Asistio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt_NoAsistio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btn_ActualizarAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_Semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_SinAsignar)
                    .addComponent(rbt_Asistio)
                    .addComponent(rbt_NoAsistio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ActualizarAsistencia))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ActualizarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nombres)
                            .addComponent(txt_Apellidos))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ActualizarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_CrearAula.setText("Crear Aula");
        btn_CrearAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearAulaActionPerformed(evt);
            }
        });

        jLabel6.setText("Número de Alumnos:");

        spn_NumAlumnos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jLabel10.setText("Lista de Alumnos:");

        lst_Alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_AlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lst_Alumnos);

        btn_CrearRelacionAlumnos.setText("Crear Relación de Alumnos del Aula");
        btn_CrearRelacionAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearRelacionAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CrearAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spn_NumAlumnos))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btn_CrearRelacionAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_CrearAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(spn_NumAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CrearRelacionAlumnos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearAulaActionPerformed
        objAula = new Aula();
    }//GEN-LAST:event_btn_CrearAulaActionPerformed

    private void btn_CrearRelacionAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearRelacionAlumnosActionPerformed
        int cantidad = (int) spn_NumAlumnos.getValue();
        modLista = new DefaultListModel();
        lst_Alumnos.setModel(modLista);
        for (int i = 1; i <= cantidad; i++) {
            modLista.addElement("Sin Registrar");
        }
    }//GEN-LAST:event_btn_CrearRelacionAlumnosActionPerformed

    private void lst_AlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_AlumnosMouseClicked
        pos_alumno = lst_Alumnos.getSelectedIndex();
        switch (pos_alumno) {
            case 0: objAlumno = objAula.getObjAlumno01();
                break;
            case 1: objAlumno = objAula.getObjAlumno02();
                break;
            case 2: objAlumno = objAula.getObjAlumno03();
                break;
            case 3: objAlumno = objAula.getObjAlumno04();
                break;
        }
        txt_Apellidos.setText(objAlumno.getApellidos());
        txt_Nombres.setText(objAlumno.getNombres());
        objAsistencia = objAlumno.getObjAsistencia01();
        
        //pos_semana = 0;
        cbo_Semana.setSelectedIndex(0);
        //pos_dia = 0;
        cbo_Dia.setSelectedIndex(0);
    }//GEN-LAST:event_lst_AlumnosMouseClicked

    private void btn_ActualizarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarAlumnoActionPerformed
        objAlumno.setApellidos(txt_Apellidos.getText());
        objAlumno.setNombres(txt_Nombres.getText());
        modLista.setElementAt(txt_Apellidos.getText() + " " + 
                              txt_Nombres.getText(), pos_alumno);
    }//GEN-LAST:event_btn_ActualizarAlumnoActionPerformed

    private void cbo_SemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_SemanaActionPerformed
        pos_semana = cbo_Semana.getSelectedIndex();
        Cargar_Asistencia();
    }//GEN-LAST:event_cbo_SemanaActionPerformed

    private void cbo_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_DiaActionPerformed
        pos_dia = cbo_Dia.getSelectedIndex();
        Cargar_Asistencia();
    }//GEN-LAST:event_cbo_DiaActionPerformed

    private void btn_ActualizarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarAsistenciaActionPerformed
        if(rbt_Asistio.isSelected()){
            asistencia_dia = 1;
        }else if(rbt_NoAsistio.isSelected()){
            asistencia_dia = 2;
        }else{
            asistencia_dia = 0;
        }
        switch (pos_dia) {
            case 0: objAsistencia.setLunes(asistencia_dia);
                break;
            case 1: objAsistencia.setMartes(asistencia_dia);
                break;
            case 2: objAsistencia.setMiercoles(asistencia_dia);
                break;
            case 3: objAsistencia.setJueves(asistencia_dia);
                break;
            case 4: objAsistencia.setViernes(asistencia_dia);
                break;
        }
    }//GEN-LAST:event_btn_ActualizarAsistenciaActionPerformed

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
    private javax.swing.JButton btn_ActualizarAlumno;
    private javax.swing.JButton btn_ActualizarAsistencia;
    private javax.swing.JButton btn_CrearAula;
    private javax.swing.JButton btn_CrearRelacionAlumnos;
    private javax.swing.JComboBox<String> cbo_Dia;
    private javax.swing.JComboBox<String> cbo_Semana;
    private javax.swing.ButtonGroup grupo_asistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Alumnos;
    private javax.swing.JRadioButton rbt_Asistio;
    private javax.swing.JRadioButton rbt_NoAsistio;
    private javax.swing.JRadioButton rbt_SinAsignar;
    private javax.swing.JSpinner spn_NumAlumnos;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Nombres;
    // End of variables declaration//GEN-END:variables
}
