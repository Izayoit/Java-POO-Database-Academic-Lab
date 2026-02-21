

package Vista;

import DAO.IngresoDAO;
import Modelo.Ingreso;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dayro
 */
public class JDialog_ConsultaCompras extends javax.swing.JDialog {

    public JDialog_ConsultaCompras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        cargarCompras();
    }

     // Método para cargar todas las compras en la tabla
    private void cargarCompras() {
        IngresoDAO dao = new IngresoDAO();
        DefaultTableModel modelo = (DefaultTableModel) tblCompras.getModel();
        modelo.setRowCount(0);
        for (Ingreso ingreso : dao.ConsultarTodos()) {
            modelo.addRow(new Object[]{
                ingreso.getIdIngreso(),
                ingreso.getIdProveedor(),
                ingreso.getTipoComprobante(),
                ingreso.getNumComprobante(),
                ingreso.getFechaHora(),
                ingreso.getImpuesto(),
                ingreso.getEstado()
            });
        }
    }

    // Método para buscar compras con un criterio específico
    private void buscarCompras(String criterio, String valor) {
        IngresoDAO dao = new IngresoDAO();
        DefaultTableModel modelo = (DefaultTableModel) tblCompras.getModel();
        modelo.setRowCount(0);
        for (Ingreso ingreso : dao.ConsultarPorCriterio(criterio, valor)) {
            modelo.addRow(new Object[]{
                ingreso.getIdIngreso(),
                ingreso.getIdProveedor(),
                ingreso.getTipoComprobante(),
                ingreso.getNumComprobante(),
                ingreso.getFechaHora(),
                ingreso.getImpuesto(),
                ingreso.getEstado()
            });
        }
    }



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
            java.util.logging.Logger.getLogger(JDialog_ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDialog_ConsultaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
