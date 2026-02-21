
package vista;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Estado;
import modelo.cliente;
import modelo.empresa1;
import modelo.evento;
import modelo.local;


public class JFrame_principal03 extends javax.swing.JFrame {

   private DefaultListModel ModLista;
       private  empresa1 objempresa1;
        private evento objevento;
        private cliente objcliente;
         private local objlocal;
         private int pos_estado =0;
         private Estado objestado;
         private int estadolocal;
                 
    public JFrame_principal03() {
       
      
      initComponents();
        
        objempresa1 = new empresa1();
        objevento = new  evento();
        ModLista = new DefaultListModel();
        objestado = new Estado(); 
        cliente objcliente = new cliente("", "", 0);
      txt_nombreCliente.setText(objcliente.getNombres());
      txt_apellidoCliente.setText(objcliente.getApellidos());
      txt_DniCliente.setText(objcliente.getDni()+"");
       
      
       local objlocal01 =  new local(100, "av.pana");
       local objlocal02 = new local(101,"av.ollon");
       local objlocal03 =  new local(102, "av.medina");
       local objlocal04 =  new local(103, "av.tupac");
       local objlocal05 =  new local(104, "av.tamayo");
       evento objevento01 = new evento(0, 0);
       evento objevento02 = new evento(0, 0);
       evento objevento03 = new evento(0, 0);
       evento objevento04 = new evento(0, 0);
       evento  objevento05 = new evento(0, 0);
       objempresa1 = new empresa1(objevento01, objevento02, objevento03, objevento04, objevento05, objlocal01, objlocal02, objlocal03, objlocal04, objlocal05);
       
       cbn_local.setSelectedIndex(0);
       cbn_eventos.setSelectedIndex(0);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_noAsignarr05 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_apellidoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_DniCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_registrarCliente = new javax.swing.JButton();
        btn_consultarCliente = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_numero = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbt_disponible = new javax.swing.JRadioButton();
        rbt_ocupado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cbn_local = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btn_RegistrarLocales = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbn_eventos = new javax.swing.JComboBox<>();
        txt_codigoEvento = new javax.swing.JTextField();
        txt_costoEvento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tipoEvento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_registrarEvento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_lista = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        btn_asignar01 = new javax.swing.JButton();
        btn_noAsignar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_noAsignarr05.setBackground(new java.awt.Color(0, 0, 102));
        btn_noAsignarr05.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_noAsignarr05.setForeground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), null));

        jLabel1.setText("nombre:");

        jLabel2.setText("apellido:");

        jLabel5.setText("\"CLIENTE\"");

        jLabel7.setText("dni:");

        btn_registrarCliente.setText("registrar cliente");
        btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarClienteActionPerformed(evt);
            }
        });

        btn_consultarCliente.setText("consultar");
        btn_consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarClienteActionPerformed(evt);
            }
        });

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_DniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultarCliente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_registrarCliente)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_consultarCliente)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registrarCliente)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("numero:");

        jLabel4.setText("direccion:");

        buttonGroup1.add(rbt_disponible);
        rbt_disponible.setText("disponible");
        rbt_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_disponibleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_ocupado);
        rbt_ocupado.setText("ocupado");
        rbt_ocupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_ocupadoActionPerformed(evt);
            }
        });

        jLabel6.setText("\"LOCAL\"");

        cbn_local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "local01", "local02", "local03", "local04", "local05" }));
        cbn_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_localActionPerformed(evt);
            }
        });

        jLabel11.setText("locales:");

        btn_RegistrarLocales.setText("registrar locales");
        btn_RegistrarLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarLocalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbn_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbt_ocupado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_RegistrarLocales)))
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbn_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbt_disponible)
                    .addComponent(rbt_ocupado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_RegistrarLocales)
                .addContainerGap())
        );

        btn_crear.setText("crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("\"EVENTO\"");

        cbn_eventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "evento01", "evento02", "evento03", "evento04", "evento05" }));
        cbn_eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbn_eventosActionPerformed(evt);
            }
        });

        jLabel9.setText("codigo:");

        jLabel10.setText("costo:");

        jLabel12.setText("eventos:");

        jLabel13.setText("tipo:");

        btn_registrarEvento.setText("registrar Eventos");
        btn_registrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_costoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbn_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_registrarEvento)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_costoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbn_eventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lst_lista.setBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(lst_lista);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.GridLayout(2, 0, 5, 5));

        btn_asignar01.setText("asignar ");
        btn_asignar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignar01ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_asignar01);

        btn_noAsignar.setText("eliminar");
        btn_noAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noAsignarActionPerformed(evt);
            }
        });
        jPanel5.add(btn_noAsignar);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("botones ");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("lista (seleccione uno y eliminar)");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("(elimene con su respectivo local)");

        javax.swing.GroupLayout btn_noAsignarr05Layout = new javax.swing.GroupLayout(btn_noAsignarr05);
        btn_noAsignarr05.setLayout(btn_noAsignarr05Layout);
        btn_noAsignarr05Layout.setHorizontalGroup(
            btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                .addGroup(btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel15))
                    .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_crear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel14))))
                    .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_noAsignarr05Layout.setVerticalGroup(
            btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_noAsignarr05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btn_noAsignarr05Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_noAsignarr05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_noAsignarr05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void solo_estado(){
            switch (pos_estado) {
            case 0: objestado.setA(estadolocal);
            break;
            case 1: objestado.setB(estadolocal);
            break;
            case 2: objestado.setC(estadolocal);
            break;
           case 3: objestado.setD(estadolocal);
            break;
            case 4: objestado.setE(estadolocal);
            break;
        }
    }
    public void Cargar_Estado(){
    switch (pos_estado) {
        case 0: estadolocal  = objestado.getA();
            break;
        case 1: estadolocal = objestado.getB();
         break;
        case 2: estadolocal = objestado.getC();
        break;
        case 3: estadolocal = objestado.getD();
        break;
        case 4: estadolocal = objestado.getE();
        
         
    }
    switch(estadolocal) {
        case 0: rbt_disponible.setSelected(true);
        btn_asignar01.setEnabled(true);
            break;
        case 1 : rbt_ocupado.setSelected(true);
        btn_asignar01.setEnabled(false);
            break;
          
       
    }
    
}

    private void rbt_ocupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_ocupadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_ocupadoActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
       
    }//GEN-LAST:event_btn_crearActionPerformed

    private void cbn_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_localActionPerformed
      

         int pos_Local = cbn_local.getSelectedIndex();
        switch (pos_Local) {
               case 0: 
                objlocal = objempresa1.getObjlocal01();
                break;
                case 1: 
                    objlocal = objempresa1.getObjlocal02();
                break;
                case 2:
                    objlocal = objempresa1.getObjlocal03();
                break;
                case 3:
                    objlocal = objempresa1.getObjlocal04();
                break;
                case 4:
                    objlocal = objempresa1.getObjlocal05();
                break;
                  }
        txt_numero.setText(objlocal.getNumero()+"");
        txt_direccion.setText(objlocal.getDireccion());
        
        
        
        pos_estado = cbn_local.getSelectedIndex();
       Cargar_Estado();
        
        
    }//GEN-LAST:event_cbn_localActionPerformed

    private void btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarClienteActionPerformed
     objcliente.setApellidos(txt_apellidoCliente.getText());
     objcliente.setNombres(txt_nombreCliente.getText());
     objcliente.setDni(Integer.parseInt(txt_DniCliente.getText()));
     
    }//GEN-LAST:event_btn_registrarClienteActionPerformed

    private void cbn_eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbn_eventosActionPerformed

 int pos_Local = cbn_eventos.getSelectedIndex();

        switch (pos_Local) {
                 case 0:objcliente = objevento.getObjcliente();
                        objevento = objempresa1.getObjevento01();
                break;
                case 1: objevento = objempresa1.getObjevento02();
                break;
                case 2:objevento = objempresa1.getObjevento03();
                break;
                case 3:objevento = objempresa1.getObjevento04();
                break;
                case 4:objevento = objempresa1.getObjevento05();
                break;
                  }
        txt_codigoEvento.setText(objevento.getCodigo()+"");
        txt_tipoEvento.setText(objevento.getTipo());
        txt_costoEvento.setText(objevento.getCosto()+"");
       
        


        
    }//GEN-LAST:event_cbn_eventosActionPerformed

    private void btn_consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarClienteActionPerformed
       txt_nombreCliente.setText(objcliente.getNombres());
       txt_DniCliente.setText(objcliente.getDni()+"");
       txt_apellidoCliente.setText(objcliente.getApellidos());
    }//GEN-LAST:event_btn_consultarClienteActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
      txt_nombreCliente.setText("");
       txt_DniCliente.setText("");
       txt_apellidoCliente.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void rbt_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_disponibleActionPerformed

    private void btn_asignar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignar01ActionPerformed
 
        lst_lista.setModel(ModLista);
         if(rbt_disponible.isSelected()){
         rbt_ocupado.setSelected(true);
         
         btn_asignar01.setEnabled(false);
         }
               

        //evento
        objevento.setCosto(Integer.parseInt(txt_costoEvento.getText()));
        int dato1 = objevento.getCosto();
        objevento.setCodigo(Integer.parseInt(txt_codigoEvento.getText()));
        int dato2 = objevento.getCodigo();
        objevento.setTipo(txt_tipoEvento.getText());
        String dato3 = objevento.getTipo();
        //local
        objlocal.setDireccion(txt_direccion.getText());
        String dato4 = objlocal.getDireccion();
        objlocal.setNumero(Integer.parseInt(txt_numero.getText()));
        int dato5 = objlocal.getNumero();

        String Asignar = "(EVENTO)=> "+"( Codigo:"+ dato2+")"+ "( Tipo: "+ dato3+")"+" ( Costo: "+ dato1 +")"+" (ASIGANDOO A LOCAL)=> "+"( Direnccion: "+ dato4 +")" + "( Numero Local: "+ dato5+")"+" (OCUPADO)";

        int pos = cbn_eventos.getSelectedIndex();
        switch (pos) {
            case 0:ModLista.addElement(Asignar);
                  
            break;
            case 1:ModLista.addElement(Asignar);
            break;
            case 2:ModLista.addElement(Asignar);
            break;
            case 3:ModLista.addElement(Asignar);
            break;
            case 4:ModLista.addElement(Asignar);
            break;

        }
        
         //guardar el rbt
         if(rbt_disponible.isSelected()){
            estadolocal= 0;
        }else if(rbt_ocupado.isSelected()){
            estadolocal =1;
        }
        solo_estado();
    }//GEN-LAST:event_btn_asignar01ActionPerformed

    private void btn_noAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noAsignarActionPerformed
        int selectedIndex = lst_lista.getSelectedIndex();
                if (selectedIndex != -1) {
                    ModLista.remove(selectedIndex);
                    if(rbt_ocupado.isSelected()){
         rbt_disponible.setSelected(true);
         btn_asignar01.setEnabled(true);
         }else if(rbt_ocupado.isSelected()){
         btn_asignar01.setEnabled(true);
         }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor selecciona un elemento para eliminar.");}

         if(rbt_disponible.isSelected()){
            estadolocal= 0;
        }else if(rbt_ocupado.isSelected()){
            estadolocal =1;
        }
       solo_estado();
        
    }//GEN-LAST:event_btn_noAsignarActionPerformed

    private void btn_registrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarEventoActionPerformed
      objevento.setCodigo(Integer.parseInt(txt_codigoEvento.getText()));
      objevento.setCosto(Integer.parseInt(txt_costoEvento.getText()));
      objevento.setTipo(txt_tipoEvento.getText());
    }//GEN-LAST:event_btn_registrarEventoActionPerformed

    private void btn_RegistrarLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarLocalesActionPerformed
     objlocal.setDireccion(txt_direccion.getText());
     objlocal.setNumero(Integer.parseInt(txt_numero.getText()));
    }//GEN-LAST:event_btn_RegistrarLocalesActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_RegistrarLocales;
    private javax.swing.JButton btn_asignar01;
    private javax.swing.JButton btn_consultarCliente;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_noAsignar;
    private javax.swing.JPanel btn_noAsignarr05;
    private javax.swing.JButton btn_registrarCliente;
    private javax.swing.JButton btn_registrarEvento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbn_eventos;
    private javax.swing.JComboBox<String> cbn_local;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_lista;
    private javax.swing.JRadioButton rbt_disponible;
    private javax.swing.JRadioButton rbt_ocupado;
    private javax.swing.JTextField txt_DniCliente;
    private javax.swing.JTextField txt_apellidoCliente;
    private javax.swing.JTextField txt_codigoEvento;
    private javax.swing.JTextField txt_costoEvento;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_tipoEvento;
    // End of variables declaration//GEN-END:variables
}
