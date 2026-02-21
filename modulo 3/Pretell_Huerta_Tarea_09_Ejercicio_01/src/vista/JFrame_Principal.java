package vista;

import control.Arreglo_ventas;

import acceso.Gestor_Archivos;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.HashMap;

import java.util.Map;
import javax.swing.JOptionPane;


import modelo.precios;
import modelo.Ventas;
import modelo.turnos;

public class JFrame_Principal extends javax.swing.JFrame {
 Gestor_Archivos objGestorArchivos = new Gestor_Archivos();
    Arreglo_ventas objArregloVentas = new Arreglo_ventas();
    precios objprecios = new precios();
    Ventas objVentas = new Ventas();
    turnos objturnos = new turnos();
    private int Estado = 0;
    private Map<Integer, Boolean> boletosVendidos = new HashMap();//Integer = indice , bolean true o false
    private Map<Integer, Boolean> asientosOcupados = new HashMap();
  
   
    public JFrame_Principal() {

        initComponents();
        
        for (int j = 0; j < 10; j++) {

            cbn_turno.addItem("Turno " + (j + 1));
        }
        for (int i = 0; i < 999; i++) {
            cbn_boletos.addItem("boleto " + (i + 1));
        }
        for (int q = 0; q < 44; q++) {
            cbn_asiento.addItem("asiento " + (q + 1));
        }
        
       

        objArregloVentas.listar(tbl_ventas);
        objprecios.Listar(tbl_precios);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cbn_destino = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_pasajero = new javax.swing.JTextField();
        cbn_turno = new javax.swing.JComboBox<>();
        cbn_origen = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbn_fecha = new javax.swing.JComboBox<>();
        txt_tarifa = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        cbn_boletos = new javax.swing.JComboBox<>();
        rbt_vendido = new javax.swing.JRadioButton();
        rbt_NoVendido = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        cbn_asiento = new javax.swing.JComboBox<>();
        rbt_ocupado = new javax.swing.JRadioButton();
        rbt_desocupado = new javax.swing.JRadioButton();
        btn_registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_reiniciar = new javax.swing.JButton();
        btn_block = new javax.swing.JButton();
        btn_registrar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ventas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_precios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setAlignmentX(0.0F);
        jTabbedPane1.setAlignmentY(0.0F);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JPanel1.setBackground(new java.awt.Color(102, 102, 255));
        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro pasajeros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        cbn_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "huacho", "barranca", "huaral\t", "chancay", "lima" }));
        cbn_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_destinoActionPerformed(evt);
            }
        });

        jLabel14.setText("Destino:");

        jLabel15.setText("Origen:");

        jLabel16.setText("Turno:");

        jLabel18.setText("Pasajero:");

        txt_pasajero.setText("nombre");
        txt_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pasajeroActionPerformed(evt);
            }
        });
        txt_pasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pasajeroKeyTyped(evt);
            }
        });

        cbn_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_turnoActionPerformed(evt);
            }
        });

        cbn_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "huacho", "barranca", "huaral\t", "chancay", "lima" }));
        cbn_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_origenActionPerformed(evt);
            }
        });

        jLabel20.setText("fecha");

        cbn_fecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06/01/2025", "07/01/2025", "08/01/2025", "09/01/2025", "10/01/2025", "11/01/2025", "12/01/2025" }));
        cbn_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_fechaActionPerformed(evt);
            }
        });

        txt_tarifa.setEditable(false);
        txt_tarifa.setText("0");
        txt_tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarifaActionPerformed(evt);
            }
        });
        txt_tarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tarifaKeyTyped(evt);
            }
        });

        jLabel21.setText("Tarifa:");

        jLabel5.setText("Cantidad Asientos:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbn_turno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner1))
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel18))
                            .addComponent(cbn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbn_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbn_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5)
                        .addComponent(cbn_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbn_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbn_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        JPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 270));

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Boletos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        cbn_boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_boletosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_vendido);
        rbt_vendido.setText("vendido");

        buttonGroup1.add(rbt_NoVendido);
        rbt_NoVendido.setSelected(true);
        rbt_NoVendido.setText("no vendido");
        rbt_NoVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_NoVendidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbt_vendido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbn_boletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbt_NoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbn_boletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rbt_vendido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt_NoVendido)
                .addGap(20, 20, 20))
        );

        JPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 130));

        jPanel7.setBackground(new java.awt.Color(153, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N

        cbn_asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_asientoActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbt_ocupado);
        rbt_ocupado.setText("ocupado");

        buttonGroup2.add(rbt_desocupado);
        rbt_desocupado.setSelected(true);
        rbt_desocupado.setText("desocupado");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbt_ocupado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbt_desocupado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbn_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbn_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt_ocupado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbt_desocupado)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, 130));

        btn_registrar.setBackground(new java.awt.Color(153, 255, 204));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("registrar ");
        btn_registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_registrar.setBorderPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        JPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("\"TRANSPORTES SEGUROS\"");
        JPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/image1.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        btn_reiniciar.setBackground(new java.awt.Color(153, 255, 204));
        btn_reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reiniciar.setForeground(new java.awt.Color(0, 0, 0));
        btn_reiniciar.setText("liberar asientos otros turnos");
        btn_reiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_reiniciar.setBorderPainted(false);
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        JPanel1.add(btn_reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 170, 20));

        btn_block.setBackground(new java.awt.Color(153, 255, 204));
        btn_block.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_block.setForeground(new java.awt.Color(0, 0, 0));
        btn_block.setText("bloquear");
        btn_block.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_block.setBorderPainted(false);
        btn_block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blockActionPerformed(evt);
            }
        });
        JPanel1.add(btn_block, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 110, 20));

        btn_registrar1.setBackground(new java.awt.Color(153, 255, 204));
        btn_registrar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_registrar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar1.setText("reinicio global");
        btn_registrar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_registrar1.setBorderPainted(false);
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1ActionPerformed(evt);
            }
        });
        JPanel1.add(btn_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 170, 20));

        jTabbedPane1.addTab("registro", JPanel1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_ventas.setBackground(new java.awt.Color(0, 204, 204));
        tbl_ventas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#boleto", "Origen", "Destino", "Precio", "Pasajero", "#Asiento", "Fecha", "turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ventas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("\"VENTAS\"");

        tbl_precios.setBackground(new java.awt.Color(0, 204, 204));
        tbl_precios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_precios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tbl_precios);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("\"PRECIOS\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel4)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("consultas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private void letras(java.awt.event.KeyEvent evt){
 char c = evt.getKeyChar();
      
           if(!Character.isAlphabetic(c)&& c !=' '){
 evt.consume();

 }
      

      
  }
 
   
  
       
  
  
   
    private void ActualizarEstado() {
        
        int Boletoindex = cbn_boletos.getSelectedIndex();
        int asientoindex = cbn_asiento.getSelectedIndex();
        rbt_NoVendido.setSelected(!boletosVendidos.getOrDefault(Boletoindex, false));
        rbt_vendido.setSelected(boletosVendidos.getOrDefault(Boletoindex, false));

        rbt_desocupado.setSelected(!asientosOcupados.getOrDefault(asientoindex, false));
        rbt_ocupado.setSelected(asientosOcupados.getOrDefault(asientoindex, false));

        boolean esVendido = boletosVendidos.getOrDefault(Boletoindex, false);
        boolean esOcupado = asientosOcupados.getOrDefault(asientoindex, false);
        btn_registrar.setEnabled(!(esVendido && esOcupado));
        // Habilitar el botón de registrar
       

        boolean esNoVendido = rbt_NoVendido.isSelected();
        boolean esDesocupado = rbt_desocupado.isSelected();

        // Habilitar el botón de registrar solo si ambos RadioButtons están en No Vendido y Desocupado
        btn_registrar.setEnabled(esNoVendido && esDesocupado);
        
        
       
    }

    private void cbn_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_origenActionPerformed
        int index1 = cbn_destino.getSelectedIndex();
        int index2 = cbn_origen.getSelectedIndex();
        int value = objprecios.Lista_precios[index1][index2];
        txt_tarifa.setText(String.valueOf(value));
    }//GEN-LAST:event_cbn_origenActionPerformed

    private void cbn_boletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_boletosActionPerformed

        ActualizarEstado();
        

    }//GEN-LAST:event_cbn_boletosActionPerformed

    private void rbt_NoVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_NoVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_NoVendidoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

        jSpinner1.setValue(objVentas.getContador()-1);
        objVentas.setContador((int)jSpinner1.getValue());
        
        
        int precio =0;
        int boletoindex = cbn_boletos.getSelectedIndex();
        int asientosindex = cbn_asiento.getSelectedIndex();
        
        //actualizar los estados de los boletos y asientos
        boletosVendidos.put(boletoindex, true);
        asientosOcupados.put(asientosindex, true);
        //cambiar los estados 
        rbt_vendido.setSelected(true);
        rbt_ocupado.setSelected(true);
        //desactivar el boton registrar
        btn_registrar.setEnabled(false);

        int fecha = cbn_fecha.getSelectedIndex(); //lo selecionado 0 , 1, 2,3..
        String TipoFecha = null;
        switch (fecha) {
            case 0:
                TipoFecha = "06/01/2025";
                break;
            case 1:
                TipoFecha = "07/01/2025";
                break;
            case 2:
                TipoFecha = "08/01/2025";
                break;
            case 3:
                TipoFecha = "09/01/2025";
                break;
            case 4:
                TipoFecha = "10/01/2025";
                break;
            case 5:
                TipoFecha = "11/01/2025";
                break;
            case 6:
                TipoFecha = "12/01/2025";
                break;
        }
       
            
           
             
        
       

        int pos2 = cbn_destino.getSelectedIndex();
        String TipoDestino = null;

        switch (pos2) {
            case 0:
                TipoDestino = "huacho";
                break;
            case 1:
                TipoDestino = "barranca";
                break;
            case 2:
                TipoDestino = "huaral";
                break;
            case 3:
                TipoDestino = "chancay";
                break;
            case 4:
                TipoDestino = "lima";
                break;

        }

        int pos3 = cbn_origen.getSelectedIndex();
        String TipoOrigen = null;
        switch (pos2) {
            case 0:
                TipoOrigen = "huacho";
                break;
            case 1:
                TipoOrigen = "barranca";
                break;
            case 2:
                TipoOrigen = "huaral";
                break;
            case 3:
                TipoOrigen = "chancay";
                break;
            case 4:
                TipoOrigen = "lima";
                break;
        } 
      
            
        
        
       
     
        try {
             
            precio = Integer.parseInt(txt_tarifa.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"solo numeros enteros");
        }
     
    
      String nombre=txt_pasajero.getText();
     
      
        String boleto = (String) cbn_boletos.getSelectedItem();
        String asientos = (String) cbn_asiento.getSelectedItem();
        String turno = (String) cbn_turno.getSelectedItem();
          Object[] registrar = {boleto, TipoOrigen, TipoDestino, precio, nombre, asientos, TipoFecha, turno};
        objArregloVentas.Registrar(registrar);
        objArregloVentas.listar(tbl_ventas);
        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void cbn_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbn_fechaActionPerformed

    private void cbn_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_destinoActionPerformed
        int index1 = cbn_destino.getSelectedIndex();
        int index2 = cbn_origen.getSelectedIndex();
        int value = objprecios.Lista_precios[index1][index2];
        txt_tarifa.setText(String.valueOf(value));
    }//GEN-LAST:event_cbn_destinoActionPerformed

    private void cbn_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_turnoActionPerformed

       int pos = cbn_turno.getSelectedIndex();
        switch (pos) {
            case 0: objVentas = objturnos.getObjturno1();
                break;
            case 1: objVentas = objturnos.getObjturno2();
                break;
            case 2: objVentas = objturnos.getObjturno3();
                break;
            case 3: objVentas = objturnos.getObjturno4();
                break;
            case 4: objVentas = objturnos.getObjturno5();
                break;
            case 5: objVentas = objturnos.getObjturno6();
        
                break;
            case 6: objVentas = objturnos.getObjturno7();
             break;
            case 7: objVentas = objturnos.getObjturno8();
                break;
            case 8: objVentas = objturnos.getObjturno9();
                break;
            case 9: objVentas = objturnos.getObjturno10();
                break;
           
        }       
        jSpinner1.setValue(objVentas.getContador());


    }//GEN-LAST:event_cbn_turnoActionPerformed

    private void cbn_asientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_asientoActionPerformed

        ActualizarEstado();


    }//GEN-LAST:event_cbn_asientoActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed

        // Limpiar los datos de boletos y asientos
        asientosOcupados.clear();
        

        // Restablecer ComboBoxes y RadioButtons a su estado inicial
        cbn_asiento.setSelectedIndex(0);

        rbt_desocupado.setSelected(true);

        // Habilitar el botón de registrar

    }//GEN-LAST:event_btn_reiniciarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
    objGestorArchivos.Cargar(objArregloVentas);
    
   objArregloVentas.listar(tbl_ventas);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  
        objGestorArchivos.guardar(objArregloVentas);
        
    }//GEN-LAST:event_formWindowClosing

    private void btn_blockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blockActionPerformed
       int boletoindex = cbn_boletos.getSelectedIndex();
        int asientosindex = cbn_asiento.getSelectedIndex();
        boletosVendidos.put(boletoindex, true);
        asientosOcupados.put(asientosindex, true);
        //cambiar los estados 
        rbt_vendido.setSelected(true);
        rbt_ocupado.setSelected(true);
        //desactivar el boton registrar
        btn_registrar.setEnabled(false);
    }//GEN-LAST:event_btn_blockActionPerformed

    private void btn_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1ActionPerformed

        
        asientosOcupados.clear();
        boletosVendidos.clear();

        // Restablecer ComboBoxes y RadioButtons a su estado inicial
        cbn_asiento.setSelectedIndex(0);
        cbn_boletos.setSelectedIndex(0);
        rbt_desocupado.setSelected(true);
        rbt_NoVendido.setSelected(true);
        objArregloVentas.Eliminar(); 
        objArregloVentas.listar(tbl_ventas);
    }//GEN-LAST:event_btn_registrar1ActionPerformed

    private void txt_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pasajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pasajeroActionPerformed

    private void txt_pasajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pasajeroKeyTyped
        letras(evt);
         
    }//GEN-LAST:event_txt_pasajeroKeyTyped

    private void txt_tarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tarifaActionPerformed

    }//GEN-LAST:event_txt_tarifaActionPerformed

    private void txt_tarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tarifaKeyTyped
        
    }//GEN-LAST:event_txt_tarifaKeyTyped

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
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton btn_block;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbn_asiento;
    private javax.swing.JComboBox<String> cbn_boletos;
    private javax.swing.JComboBox<String> cbn_destino;
    private javax.swing.JComboBox<String> cbn_fecha;
    private javax.swing.JComboBox<String> cbn_origen;
    private javax.swing.JComboBox<String> cbn_turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbt_NoVendido;
    private javax.swing.JRadioButton rbt_desocupado;
    private javax.swing.JRadioButton rbt_ocupado;
    private javax.swing.JRadioButton rbt_vendido;
    private javax.swing.JTable tbl_precios;
    private javax.swing.JTable tbl_ventas;
    private javax.swing.JTextField txt_pasajero;
    private javax.swing.JTextField txt_tarifa;
    // End of variables declaration//GEN-END:variables
}
