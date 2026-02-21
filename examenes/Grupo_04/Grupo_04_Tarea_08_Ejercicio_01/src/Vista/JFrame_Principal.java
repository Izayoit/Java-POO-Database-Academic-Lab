package Vista;

import Control.Arreglo_Equipos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class JFrame_Principal extends javax.swing.JFrame {
    private Arreglo_Equipos arregloEquipos;
    private DefaultListModel modLista;
    private DefaultListModel equipoA;
    private DefaultListModel equipoB;
    private DefaultListModel equipoC;
    private DefaultListModel equipoD;
    private DefaultListModel encuentros;
    private int[][] resultados;
    private int[][] goles;

    public JFrame_Principal() {
        initComponents();
        arregloEquipos = new Arreglo_Equipos();
        modLista = new DefaultListModel();
        equipoA = new DefaultListModel();
        equipoB = new DefaultListModel();
        equipoC = new DefaultListModel();
        equipoD = new DefaultListModel();
        encuentros = new DefaultListModel();
        lst_DatosEquipoA.setModel(equipoA);
        lst_DatosEquipoB.setModel(equipoB);
        lst_DatosEquipoC.setModel(equipoC);
        lst_DatosEquipoD.setModel(equipoD);
        lst_DatosEncuentros.setModel(encuentros);
        resultados = new int[4][4];
        goles = new int[4][4];
        
    }
    
    
    private void agregarJugadorAEQUIPO(String nombre, String apellido, int indiceEquipo) {
        String datosjugador = nombre + " " + apellido;

        switch (indiceEquipo) {
            case 0: 
                equipoA.addElement(datosjugador);
                break;
            case 1: 
                equipoB.addElement(datosjugador);
                break;
            case 2: 
                equipoC.addElement(datosjugador);
                break;
            case 3: 
                equipoD.addElement(datosjugador);
                break;
            default:
                break;
        }
    }

    private void actualizarTablaPosiciones() {
    int[] puntos = new int[4];
    int[] golesFavor = new int[4];
    int[] golesContra = new int[4];
    
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (i != j) {
                puntos[i] += resultados[i][j];
                golesFavor[i] += goles[i][j];
                golesContra[i] += goles[j][i];
            }
        }
    }
    
    // Ordenar equipos por puntos y diferencia de goles
    Integer[] indices = {0, 1, 2, 3};
    int[] puntosF = puntos;
    int[] golesFavorF = golesFavor;
    int[] golesContraF = golesContra;
    Arrays.sort(indices, (i1, i2) -> {
        if (puntosF[i2]!= puntosF[i1]) {
            return Integer.compare(puntosF[i2], puntosF[i1]);
        }
        return (golesFavor[i2] - golesContra[i2]) - (golesFavor[i1] - golesContra[i1]);
    });
    
    // Actualizar lst_DatosPosiciones
    DefaultListModel<String> modeloPosiciones = new DefaultListModel<>();
    for (int i = 0; i < 4; i++) {
        int index = indices[i];
        String equipo = String.valueOf((char)('A' + index));
        modeloPosiciones.addElement(String.format("%s: %d pts, Goles a Favor: %d, Goles en Contra: %d, Diferencia: %d", 
            equipo, puntos[index], golesFavor[index], golesContra[index], 
            golesFavor[index] - golesContra[index]));
    }
    lst_DatosPosiciones.setModel(modeloPosiciones);
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Ndeequipo = new javax.swing.JLabel();
        cbo_Equipos = new javax.swing.JComboBox<>();
        lbl_Nombrejug = new javax.swing.JLabel();
        txt_Nombrejug = new javax.swing.JTextField();
        lbl_Apellidojug = new javax.swing.JLabel();
        txt_Apellidojug = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_REGISTRAREQUIPO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_DatosEquipoA = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst_DatosEquipoB = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_DatosEquipoC = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_DatosEquipoD = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbo_Encuentros1 = new javax.swing.JComboBox<>();
        cbo_Encuentros2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Registrarencuentrosypuntos = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Goles1 = new javax.swing.JTextField();
        txt_Goles2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbo_Puntos1 = new javax.swing.JComboBox<>();
        cbo_Puntos2 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lst_DatosEncuentros = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lst_DatosPosiciones = new javax.swing.JList<>();
        cargar = new javax.swing.JButton();
        boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("REGISTRO EQUIPO");

        lbl_Ndeequipo.setText("N. de equipo:");

        cbo_Equipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        lbl_Nombrejug.setText("Nombre:");

        lbl_Apellidojug.setText("Apellido:");

        jLabel5.setText("Datos del jugador:");

        btn_REGISTRAREQUIPO.setText("REGISTRAR");
        btn_REGISTRAREQUIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_REGISTRAREQUIPOActionPerformed(evt);
            }
        });

        lst_DatosEquipoA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lst_DatosEquipoA);

        jLabel16.setText("A:");

        jLabel17.setText("B:");

        lst_DatosEquipoB.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lst_DatosEquipoB);

        jLabel18.setText("C:");

        lst_DatosEquipoC.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lst_DatosEquipoC);

        jLabel19.setText("D:");

        lst_DatosEquipoD.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lst_DatosEquipoD);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(btn_REGISTRAREQUIPO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_Ndeequipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_Equipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Nombrejug)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Nombrejug))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_Apellidojug)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Apellidojug))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Ndeequipo)
                    .addComponent(cbo_Equipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombrejug)
                    .addComponent(txt_Nombrejug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Apellidojug)
                    .addComponent(txt_Apellidojug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_REGISTRAREQUIPO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("ENCUENTROS");

        cbo_Encuentros1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        cbo_Encuentros2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jLabel7.setText("Elegir equipo:");

        jLabel8.setText("Elegir equipo:");

        btn_Registrarencuentrosypuntos.setText("REGISTRAR");
        btn_Registrarencuentrosypuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarencuentrosypuntosActionPerformed(evt);
            }
        });

        jLabel14.setText("Goles:");

        jLabel15.setText("Goles:");

        jLabel11.setText("Puntos:");

        jLabel13.setText("Puntos:");

        cbo_Puntos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "3" }));

        cbo_Puntos2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "3" }));

        lst_DatosEncuentros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lst_DatosEncuentros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Registrarencuentrosypuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbo_Encuentros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Goles2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbo_Encuentros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Goles1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_Puntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_Puntos1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbo_Encuentros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Goles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbo_Puntos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbo_Encuentros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Goles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbo_Puntos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Registrarencuentrosypuntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setText("Tabla de posiciones:");

        lst_DatosPosiciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lst_DatosPosiciones);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cargar.setText("cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        boton.setText("guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(cargar)
                        .addGap(83, 83, 83)
                        .addComponent(boton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargar)
                    .addComponent(boton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_REGISTRAREQUIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_REGISTRAREQUIPOActionPerformed
        String nombre = txt_Nombrejug.getText();
        String apellido = txt_Apellidojug.getText();
        int nequipo = cbo_Equipos.getSelectedIndex();
        
    if (nombre.isEmpty() || apellido.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No ingreso ningun dato");
        return;
    }
      if (arregloEquipos.jugadorInscrito(nombre, apellido)) {
        javax.swing.JOptionPane.showMessageDialog(this, "El jugador ya está inscrito en un equipo.");
        return;
    }
    
    boolean registroExitoso = arregloEquipos.agregarJugadoraequipo(nombre, apellido, nequipo);
    if (!registroExitoso) {
        javax.swing.JOptionPane.showMessageDialog(this, "El jugador ya está inscrito en un equipo.");
        return;
    }
    
        agregarJugadorAEQUIPO(nombre, apellido, nequipo);
    
    txt_Nombrejug.setText("");
    txt_Apellidojug.setText("");         
    
    }//GEN-LAST:event_btn_REGISTRAREQUIPOActionPerformed

    private void btn_RegistrarencuentrosypuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarencuentrosypuntosActionPerformed
    int equipo1 = cbo_Encuentros1.getSelectedIndex();
    int equipo2 = cbo_Encuentros2.getSelectedIndex();        
    int puntos1 = Integer.parseInt((String) cbo_Puntos1.getSelectedItem());
    int puntos2 = Integer.parseInt((String) cbo_Puntos2.getSelectedItem());
    String goles1Text = txt_Goles1.getText();
    String goles2Text = txt_Goles2.getText();
        
    if (equipo1 == equipo2==false) {
  
    }else if(equipo1==equipo2==true){ 
      modLista.addElement("");
    JOptionPane.showMessageDialog(this, "El valor 'true' ya existe en la tabla.");}
    if (goles1Text.isEmpty() || goles2Text.isEmpty()) {
        
        return;
    }
    
    int goles1, goles2;
    try {
        goles1 = Integer.parseInt(goles1Text);
        goles2 = Integer.parseInt(goles2Text);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los goles deben ser números enteros");
        return;
    }
    
    if (goles1 < 0 || goles2 < 0 || goles1 > 99 || goles2 > 99) {
        JOptionPane.showMessageDialog(this, "Los goles deben ser números entre 0 y 99");
        return;
    }
    
    // Registrar resultados y goles
        
    
    resultados[equipo2][equipo1] = puntos2;
    goles[equipo2][equipo1] = goles2;
    
    String resultado = String.format("Encuentro: %s vs %s, Goles: %d - %d, Puntos: %d - %d",
        cbo_Encuentros1.getItemAt(equipo1), 
        cbo_Encuentros2.getItemAt(equipo2), 
        goles1, 
        goles2, 
        puntos1, 
        puntos2);
    
    encuentros.addElement(resultado);
    txt_Goles1.setText("");
    txt_Goles2.setText("");
    
    actualizarTablaPosiciones();
    }//GEN-LAST:event_btn_RegistrarencuentrosypuntosActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        
    }//GEN-LAST:event_cargarActionPerformed

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
    private javax.swing.JButton boton;
    private javax.swing.JButton btn_REGISTRAREQUIPO;
    private javax.swing.JButton btn_Registrarencuentrosypuntos;
    private javax.swing.JButton cargar;
    private javax.swing.JComboBox<String> cbo_Encuentros1;
    private javax.swing.JComboBox<String> cbo_Encuentros2;
    private javax.swing.JComboBox<String> cbo_Equipos;
    private javax.swing.JComboBox<String> cbo_Puntos1;
    private javax.swing.JComboBox<String> cbo_Puntos2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_Apellidojug;
    private javax.swing.JLabel lbl_Ndeequipo;
    private javax.swing.JLabel lbl_Nombrejug;
    private javax.swing.JList<String> lst_DatosEncuentros;
    private javax.swing.JList<String> lst_DatosEquipoA;
    private javax.swing.JList<String> lst_DatosEquipoB;
    private javax.swing.JList<String> lst_DatosEquipoC;
    private javax.swing.JList<String> lst_DatosEquipoD;
    private javax.swing.JList<String> lst_DatosPosiciones;
    private javax.swing.JTextField txt_Apellidojug;
    private javax.swing.JTextField txt_Goles1;
    private javax.swing.JTextField txt_Goles2;
    private javax.swing.JTextField txt_Nombrejug;
    // End of variables declaration//GEN-END:variables
}
