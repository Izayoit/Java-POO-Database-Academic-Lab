package Vista;

import DAO.VentaDAO;
import Modelo.Venta;
import javax.swing.table.DefaultTableModel;

public class JDialog_ConsultasVentas extends javax.swing.JDialog {

    public JDialog_ConsultasVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        cargarVentas();
    }

    private void cargarVentas() {
        VentaDAO dao = new VentaDAO();
        DefaultTableModel modelo = (DefaultTableModel) tblVentas.getModel();
        modelo.setRowCount(0);
        for (Venta venta : dao.ConsultarTodos()) {
            modelo.addRow(new Object[]{
                venta.getIdVenta(),
                venta.getIdCliente(),
                venta.getIdUsuario(),
                venta.getTipoComprobante(),
                venta.getNumComprobante(),
                venta.getFechaHora(),
                venta.getImpuesto(),
                venta.getTotalVenta(),
                venta.getEstado()
            });
        }
    }

    private void buscarVentas(String criterio, String valor) {
        VentaDAO dao = new VentaDAO();
        DefaultTableModel modelo = (DefaultTableModel) tblVentas.getModel();
        modelo.setRowCount(0);
        for (Venta venta : dao.ConsultarPorCriterio(criterio, valor)) {
            modelo.addRow(new Object[]{
                venta.getIdVenta(),
                venta.getIdCliente(),
                venta.getIdUsuario(),
                venta.getTipoComprobante(),
                venta.getNumComprobante(),
                venta.getFechaHora(),
                venta.getImpuesto(),
                venta.getTotalVenta(),
                venta.getEstado()
            });
        }
    }

    private void initComponents() {
        jPanelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbCriterio = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ventas");

        jPanelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));

        jLabel1.setText("Buscar por:");

        cbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cliente", "Tipo Comprobante", "Número Comprobante"}));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(evt -> {
            String criterio = obtenerCriterio();
            String valor = txtBuscar.getText().trim();
            if (!valor.isEmpty()) {
                buscarVentas(criterio, valor);
            } else {
                cargarVentas();
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(evt -> dispose());

        tblVentas.setModel(new DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Cliente", "Usuario", "Tipo Comprobante", "Número", "Fecha", "Impuesto", "Total", "Estado"}
        ));

        jScrollPane1.setViewportView(tblVentas);

        // Diseño omitido por simplicidad
    }

    private String obtenerCriterio() {
        switch (cbCriterio.getSelectedItem().toString()) {
            case "Cliente":
                return "idcliente";
            case "Tipo Comprobante":
                return "tipo_comprobante";
            case "Número Comprobante":
                return "num_comprobante";
            default:
                return "";
        }
    }

    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbCriterio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtBuscar;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JDialog_ConsultasVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultasVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultasVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultasVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialog_ConsultasVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
