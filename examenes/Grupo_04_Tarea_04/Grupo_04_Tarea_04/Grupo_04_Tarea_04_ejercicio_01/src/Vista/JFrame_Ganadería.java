
package Vista;

    import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class JFrame_Ganadería extends javax.swing.JFrame {

    // Mapa para almacenar datos sobre vacas por raza
    private final Map<String, Integer> totalVacas = new HashMap<>();
    private final Map<String, Integer> vacasCarne = new HashMap<>();
    private final Map<String, Integer> vacasLeche = new HashMap<>();
    private final Map<String, Double> maxPesoRaza = new HashMap<>();
    private final Map<String, Double> minPesoRaza = new HashMap<>();
    private double pesoTotal = 0;
    private int cantidadTotalVacas = 0;
    private double maxPesoGeneral = Double.MIN_VALUE;
    private double minPesoGeneral = Double.MAX_VALUE;

    // Constructor de la clase
    public JFrame_Ganadería() {
        initComponents(); // Método autogenerado en el diseño

        // Inicializamos las razas y sus contadores
        String[] razas = {"Shorton", "Yorkshire", "Holstein", "Hereford"};
        for (String raza : razas) {
            totalVacas.put(raza, 0);
            vacasCarne.put(raza, 0);
            vacasLeche.put(raza, 0);
            maxPesoRaza.put(raza, 0.0);
            minPesoRaza.put(raza, 0.0);
        }

        // Añadimos la acción al botón "Agregar" 
        btnAgregar.addActionListener((ActionEvent evt) -> {
            agregarVaca();
        });
    }

    // Método para agregar una vaca
    private void agregarVaca() {
        String razaSeleccionada = (String) cmbRaza.getSelectedItem(); // Obtener raza seleccionada
        String pesoStr = txtPeso.getText(); // Obtener el peso ingresado

        // Validar que el campo de peso no esté vacío y sea numérico
        if (pesoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un peso válido.");
            return;
        }

        
            double peso = Double.parseDouble(pesoStr);
            if (peso <= 0) {
                throw new NumberFormatException();
            }

            // Actualizar datos generales
            cantidadTotalVacas++;
            pesoTotal += peso;
            totalVacas.put(razaSeleccionada, totalVacas.get(razaSeleccionada) + 1);

            // Clasificación carne/leche
            if (peso <= 500) {
                vacasCarne.put(razaSeleccionada, vacasCarne.get(razaSeleccionada) + 1);
            } else {
                vacasLeche.put(razaSeleccionada, vacasLeche.get(razaSeleccionada) + 1);
            }

            // Actualizar peso máximo y mínimo por raza
            if (peso > maxPesoRaza.get(razaSeleccionada)) {
                maxPesoRaza.put(razaSeleccionada, peso);
            }
            else {
                minPesoRaza.put(razaSeleccionada, peso);
            }

            // Actualizar el peso máximo y mínimo general
            if (peso > maxPesoGeneral) {
                maxPesoGeneral = peso;
            }
            if (peso < minPesoGeneral) {
                minPesoGeneral = peso;
            }

            // Mostrar resultados actualizados
            mostrarResultados();

            // Limpiar campo de texto
            txtPeso.setText("");

        
    }

    // Método para mostrar los resultados
    private void mostrarResultados() {
        StringBuilder resultados = new StringBuilder();
        
        resultados.append("Resultados:\n");
        resultados.append("Número total de vacas ingresadas: ").append(cantidadTotalVacas).append("\n");
        resultados.append("Peso promedio de todas las vacas: ").append(pesoTotal / cantidadTotalVacas).append(" kg\n");
        resultados.append("Mayor peso ingresado (general): ").append(maxPesoGeneral).append(" kg\n");
        resultados.append("Menor peso ingresado (general): ").append(minPesoGeneral).append(" kg\n");

        for (String raza : totalVacas.keySet()) {
            resultados.append("\nRaza: ").append(raza).append("\n");
            resultados.append("Total de vacas: ").append(totalVacas.get(raza)).append("\n");
            resultados.append("Vacas para carne: ").append(vacasCarne.get(raza)).append("\n");
            resultados.append("Vacas para leche: ").append(vacasLeche.get(raza)).append("\n");
            resultados.append("Mayor peso: ").append(maxPesoRaza.get(raza)).append(" kg\n");
            resultados.append("Menor peso: ").append(minPesoRaza.get(raza)).append(" kg\n");
        }

        txtResultados.setText(resultados.toString());
    }

    // Este método se genera automáticamente en NetBeans cuando creas la interfaz gráfica
   
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbRaza = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione", "Shorton", "Yorkshire", "Holstein", "Hereford" }));

        jLabel1.setText("Raza:");

        jLabel2.setText("Peso");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel3.setText("NEGOCIO DE VACAS");

        btnAgregar.setText("AGREGAR VACA");

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        {
     if(!Character.isDigit(evt.getKeyChar())&&!(evt.getKeyChar()=='.'))
    evt.consume();     
    }
    }//GEN-LAST:event_txtPesoKeyTyped

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
            java.util.logging.Logger.getLogger(JFrame_Ganadería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ganadería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ganadería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Ganadería.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Ganadería().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
