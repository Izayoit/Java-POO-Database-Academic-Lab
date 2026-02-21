
package grupo_02_tarea_04_ejercicio_02;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Jframe_principal extends javax.swing.JFrame {

     DefaultListModel modLista1;
     DefaultListModel modLista2;
     DefaultListModel modLista3;
     DefaultListModel modLista4;
     
    public Jframe_principal() {
        initComponents();
         setLocationRelativeTo(null);
        modLista1 = new DefaultListModel();
        modLista2 = new DefaultListModel();
        modLista3 = new DefaultListModel();
        modLista4 = new DefaultListModel();
         lst_ventas.setModel(modLista1);
         lst_ventas1.setModel(modLista2);
         lst_ventas2.setModel(modLista3);
         lst_ventas3.setModel(modLista4);
         
         
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_aplicar_1 = new javax.swing.JButton();
        btn_aplicar_2 = new javax.swing.JButton();
        btn_aplicar_3 = new javax.swing.JButton();
        btn_aplicar_4 = new javax.swing.JButton();
        btn_aplicar_5 = new javax.swing.JButton();
        txt_talla = new javax.swing.JTextField();
        txt_genero = new javax.swing.JTextField();
        txt_nacionalidad = new javax.swing.JTextField();
        txt_resultado = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lst_ventas = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lst_ventas1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lst_ventas2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lst_ventas3 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_mayor_tallas = new javax.swing.JButton();
        btn_mayor_genero = new javax.swing.JButton();
        btn_mayor_procedencia = new javax.swing.JButton();
        spn_cantidad_genero = new javax.swing.JSpinner();
        spn_cantidad_nacionalidad = new javax.swing.JSpinner();
        btn_limpiar = new javax.swing.JButton();
        spn_cantidad_talla = new javax.swing.JSpinner();
        spn_cantidad = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("genero(hombre,mujer):");

        jLabel2.setText("nacionalidad(peruano ,extranjero):");

        jLabel3.setText("resultado(sin descuento):");

        jLabel5.setText("talla(S,M,L):");

        btn_aplicar_1.setText("total");
        btn_aplicar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicar_1ActionPerformed(evt);
            }
        });

        btn_aplicar_2.setText("aplicar 2");
        btn_aplicar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicar_2ActionPerformed(evt);
            }
        });

        btn_aplicar_3.setText("aplicar 3");
        btn_aplicar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicar_3ActionPerformed(evt);
            }
        });

        btn_aplicar_4.setText("aplicar 4");
        btn_aplicar_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicar_4ActionPerformed(evt);
            }
        });

        btn_aplicar_5.setText("aplicar 5");
        btn_aplicar_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicar_5ActionPerformed(evt);
            }
        });

        txt_talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tallaActionPerformed(evt);
            }
        });
        txt_talla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tallaKeyTyped(evt);
            }
        });

        txt_resultado.setEditable(false);
        txt_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resultadoActionPerformed(evt);
            }
        });

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });

        jLabel4.setText("precio:");

        lst_ventas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lst_ventas);

        lst_ventas1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(lst_ventas1);

        lst_ventas2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(lst_ventas2);

        lst_ventas3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(lst_ventas3);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("total tallas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("total generos");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("total procedencia");

        btn_mayor_tallas.setText("mayor");
        btn_mayor_tallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayor_tallasActionPerformed(evt);
            }
        });

        btn_mayor_genero.setText("mayor");
        btn_mayor_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayor_generoActionPerformed(evt);
            }
        });

        btn_mayor_procedencia.setText("mayor");
        btn_mayor_procedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mayor_procedenciaActionPerformed(evt);
            }
        });

        btn_limpiar.setText("limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Almacen de datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(0, 0, Short.MAX_VALUE))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_aplicar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_limpiar))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_resultado)
                            .addComponent(txt_precio)
                            .addComponent(txt_talla, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_genero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spn_cantidad_talla)
                                    .addComponent(spn_cantidad)
                                    .addComponent(spn_cantidad_genero)
                                    .addComponent(spn_cantidad_nacionalidad))
                                .addGap(50, 50, 50)
                                .addComponent(btn_aplicar_1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(btn_aplicar_5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_mayor_tallas)
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_mayor_genero)
                                .addGap(79, 79, 79)
                                .addComponent(btn_mayor_procedencia)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btn_aplicar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aplicar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addGap(364, 364, 364))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(spn_cantidad))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_precio)
                        .addComponent(btn_aplicar_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(btn_limpiar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_talla)
                            .addComponent(spn_cantidad_talla)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_genero)
                            .addComponent(spn_cantidad_genero))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nacionalidad)
                            .addComponent(spn_cantidad_nacionalidad))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_resultado)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aplicar_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_aplicar_5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_aplicar_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_aplicar_3))
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_mayor_procedencia)
                            .addComponent(btn_mayor_genero)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_mayor_tallas)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txt_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resultadoActionPerformed

    private void btn_aplicar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicar_1ActionPerformed
if(txt_genero.getText().isEmpty()||txt_nacionalidad.getText().isEmpty()||txt_precio.getText().isEmpty()||txt_talla.getText().isEmpty()){JOptionPane.showMessageDialog(this, "llene las casillas ");}
else{     // 3 primeros enunciados
       int cantidadtallas= Integer.parseInt(spn_cantidad_talla.getValue().toString());
       int cantidadgenero = Integer.parseInt(spn_cantidad_genero.getValue().toString());
       int cantidadprocedencia = Integer.parseInt(spn_cantidad_nacionalidad.getValue().toString());
        int cantidad = Integer.parseInt(txt_precio.getText());
        char talla = txt_talla.getText().charAt(0);
        String nacionalidad = txt_nacionalidad.getText();
        String genero = txt_genero.getText();
        
       if(txt_precio.getText().isEmpty()||txt_genero.getText().isEmpty()||txt_nacionalidad.getText().isEmpty()||txt_talla.getText().isEmpty()){ JOptionPane.showMessageDialog(this, "escriba en las casillas"); }
       else
             {switch (talla) { 
            case 'S':{ txt_resultado.setText(cantidad*cantidadtallas+"");
            
            
               
            }   
                 break;
            case 'M':{
           
    
            txt_resultado.setText(cantidad*cantidadtallas+"");
            
            
            }
                break;
             case 'L':{
                 
                
                 txt_resultado.setText(cantidad*cantidadtallas+"");
                 
                 
                 
             }
                break;
            default:
                throw new AssertionError();
        }
    }
        
        
        switch (genero) { 
            case "mujer":{ txt_resultado.setText(cantidad*cantidadgenero+"");
            
            
               
            }   
                 break;
            case "hombre":{
           
    
            txt_resultado.setText(cantidad*cantidadgenero+"");
            
            
            }
                
        }
        switch (nacionalidad) { 
            case "peruano":{ txt_resultado.setText(cantidad*cantidadprocedencia+"");
            
            
               
            }   
                 break;
            case "extranjero":{
           
    
            txt_resultado.setText(cantidad*cantidadprocedencia+"");
            
            
            }
                
        }
    
}
       
       
       
       
    }//GEN-LAST:event_btn_aplicar_1ActionPerformed

    private void txt_tallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tallaActionPerformed

    private void btn_aplicar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicar_2ActionPerformed
       if(txt_genero.getText().isEmpty()||txt_nacionalidad.getText().isEmpty()||txt_precio.getText().isEmpty()||txt_talla.getText().isEmpty()){ JOptionPane.showMessageDialog(this, "llene las casillas para almacenar");}  
       else{     
       // importar total de compras 
  

       int cantidadtotal = Integer.parseInt(spn_cantidad.getValue().toString());
       int cantidadgenero = Integer.parseInt(spn_cantidad_genero.getValue().toString());
       int cantidadprocedencia = Integer.parseInt(spn_cantidad_nacionalidad.getValue().toString());
        int cantidad = Integer.parseInt(txt_precio.getText());
        char talla = txt_talla.getText().charAt(0);
        String nacionalidad = txt_nacionalidad.getText();
        String genero = txt_genero.getText();
        double porcetaje =0;
       if(txt_precio.getText().isEmpty()||txt_genero.getText().isEmpty()||txt_nacionalidad.getText().isEmpty()||txt_talla.getText().isEmpty()){ JOptionPane.showMessageDialog(this, "escriba en las casillas"); }
       else
             {switch (talla) { 
            case 'S':{ switch (genero) {
                    case "hombre": {
                        switch (nacionalidad) {
                             case "extranjero": { modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.05+"");}
      
                                break;
                              case "peruano":{modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.04+"");}
                                
                                break;
                            
                        }
                    
                    }
                   
                    
                        break;
                     case "mujer": {
                         switch (nacionalidad) {
                             case "extranjero": {modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.06+"");}
                                 
                                 break;
                              case "peruano":  {modLista1.addElement((cantidad*cantidadtotal-cantidad*cantidadtotal*0.05+""));}
                                 
                                 break;
                             
                         }
                     
                     }
                        break;
                        
                    
                }
                
                
                
               
            }   
                break;
            case 'M':{
            switch (genero) { 
                    case "hombre": { 
                        switch (nacionalidad) {
                             case "extranjero": { modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.07+"");}
      
                                break;
                              case "peruano":{modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.06+"");}
                                
                                break;
                            
                        }
                    
                    }
                   
                    
                        break;
                     case "mujer": {
                         switch (nacionalidad) {
                             case "extranjero": {modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.09+"");}
                                 
                                 break;
                              case "peruano":  {modLista1.addElement((cantidad*cantidadtotal-cantidad*cantidadtotal*0.08+""));}
                                 
                                 break;
                             
                         }
                     
                     }
                        break;
                        
                    
                }
            
            
            
            
            
            
            }
                break;
             case 'L':{
                 
                 switch (genero) {
                    case "hombre": {
                        switch (nacionalidad) {
                             case "extranjero": { modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*.10+"");}
      
                                break;
                              case "peruano":{modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.09+"");}
                                
                                break;
                            
                        }
                    
                    }
                   
                    
                        break;
                     case "mujer": {
                         switch (nacionalidad) {
                             case "extranjero": {modLista1.addElement(cantidad*cantidadtotal-cantidad*cantidadtotal*0.12+"");}
                                 
                                 break;
                              case "peruano":  {modLista1.addElement((cantidad*cantidadtotal-cantidad*cantidadtotal*0.10+""));}
                                 
                                 break;
                             
                         }
                     
                     }
                        break;
                        
                    
                }
                 
                 
                 
                 
                 
                 
             }
                break;
            default:
                throw new AssertionError();
        }
    }
       
       
       
    
       
       }
        
    }//GEN-LAST:event_btn_aplicar_2ActionPerformed

    private void btn_aplicar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicar_3ActionPerformed
         
        
        int cantidad = Integer.parseInt(txt_precio.getText());
        char talla = txt_talla.getText().charAt(0);
         int cantidadtallas = Integer.parseInt(spn_cantidad_talla.getValue().toString());  
       int dato1 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.05);//'S'                       
       int dato2 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.04);// 'S'   
       int dato3 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.06);// 's'   
       int dato4 =(int) (cantidad*cantidadtallas-cantidad*cantidadtallas*0.05);// 's'   
       int dato5 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.07);// 'M'   
      int dato6 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.06);//'M'    
       int dato7 =(int) (cantidad*cantidadtallas-cantidad*cantidadtallas*0.09);//'M'   
       int dato8 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.08);//'M'    
       int dato9 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.10);//'L'    
       int dato10 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.09);//'L'    
       int dato11 = (int)(cantidad*cantidadtallas -cantidad*cantidadtallas*0.12);//'L'   
       int dato12 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.10);//'L'     

       int tallas_S = dato1 + dato2 +dato3 + dato4 ;
       int  tallas_M = dato5 + dato6 +dato7 + dato8 ;
      int  tallas_L = dato9 + dato10 +dato11 + dato12 ;
         
       
            
        
       
       
       
       
       
             switch (talla) { 
            case 'S':{ modLista2.addElement("total talla S: "+tallas_S);
                 
       
            }   
                break;
            case 'M':{ modLista2.addElement("total talla M: "+tallas_M);
    
            
            
            
            }
                break;
             case 'L':{modLista2.addElement("total talla L: "+tallas_L);
                 
             
                 
              
                 
             }
                break;
                
                
                
            default:
                throw new AssertionError();
        }
    
       
       
       
       
       
       
       
       

       
       
       
       
         
       
       
           
           
            
       
       
    }//GEN-LAST:event_btn_aplicar_3ActionPerformed

    private void btn_aplicar_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicar_4ActionPerformed
           int cantidad = Integer.parseInt(txt_precio.getText());
        int cantidadgenero = Integer.parseInt(spn_cantidad_genero.getValue().toString());
        String genero = txt_genero.getText();     
       int dato1 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.05);//  "hombre"     'S'"extranjero"                      
       int dato2 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.04);//  "hombre"     'S' "peruano"
       int dato3 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.06);//   "mujer"     's'"extrajero"
       int dato4 =(int) (cantidad*cantidadgenero-cantidad*cantidadgenero*0.05);//   "mujer"     's' "peruano"
       int dato5 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.07);//  "hombre"    'M' "extranjero"
      int dato6 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.06);//   "hombre"     'M'"peruano"
       int dato7 =(int) (cantidad*cantidadgenero-cantidad*cantidadgenero*0.09);//  "mujer"     'M' "extrajero"
       int dato8 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.08);//  "mujer"       'M'  "peruano"
       int dato9 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.10);//  "hombre"      'L' "extranjero"
       int dato10 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.09);//  "hombre"    'L'  "peruano"
       int dato11 = (int)(cantidad*cantidadgenero -cantidad*cantidadgenero *0.12);//"mujer"      'L' "extranjero"
       int dato12 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.10);//  "mujer"        'L'  "peruano"

       int hombres = dato1 + dato2 +dato5 + dato6 + dato9 + dato10 ;
       int mujeres = dato3 + dato4 +dato7 + dato8 +dato11 + dato12 ;
      
         
       
            
        
       
       
       
       
       
             {switch (genero) { 
            case "mujer":{ modLista3.addElement("total mujeres: " + mujeres);
                 
       
            }   
                break;
            case "hombre" :{ modLista3.addElement("total hombres: "+ hombres);
    
            
            
            
            }
                
              
                
                
            default:
                throw new AssertionError();
        }
    }
    }//GEN-LAST:event_btn_aplicar_4ActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
       
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
       evt.consume();
       }
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_tallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tallaKeyTyped
        
    }//GEN-LAST:event_txt_tallaKeyTyped

    private void btn_aplicar_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicar_5ActionPerformed
       
        
        
        
        int cantidadnacionalidad = Integer.parseInt(spn_cantidad_nacionalidad.getValue().toString());
        
         
        int cantidad = Integer.parseInt(txt_precio.getText());
       
        String nacionalidad = txt_nacionalidad.getText();
          
       int dato1 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.05);//"extranjero"                      
       int dato2 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.04);//  "peruano"
       int dato3 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.06);//  "extrajero"
       int dato4 =(int) (cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.05);//  "peruano"
       int dato5 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.07);//  "extranjero"
      int dato6 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.06);//  "peruano"
       int dato7 =(int) (cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.09);//    "extrajero"
       int dato8 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.08);//   "peruano"
       int dato9 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.10);//    "extranjero"
       int dato10 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.09);//    "peruano"
       int dato11 = (int)(cantidad*cantidadnacionalidad -cantidad *cantidadnacionalidad*0.12);//    "extranjero"
       int dato12 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.10);//      "peruano"

       int peruano = dato1 + dato3 +dato5 + dato7 + dato9+ dato11;
       int  extranjero = dato2 +dato4 + dato6 + dato8 + dato10 + dato12 ;
       
       
      
         
       
            
        
       
       
       
       
       
             {switch (nacionalidad) { 
            case "peruano":{ modLista4.addElement("total procedencia: "+ peruano );
                 
       
            }   
                break;
            case "extranjero":{ modLista4.addElement("total procedencia: "+extranjero);
    
            
            
            
            }
                
                
                
                
            default:
                throw new AssertionError();
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_aplicar_5ActionPerformed

    private void btn_mayor_tallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayor_tallasActionPerformed
        

      int cantidad = Integer.parseInt(txt_precio.getText());
      int cantidadtallas= Integer.parseInt(spn_cantidad_talla.getValue().toString());
           
       int dato1 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.05);//'S'                         
       int dato2 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.04);// 'S'   
       int dato3 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.06);// 's'   
       int dato4 =(int) (cantidad*cantidadtallas-cantidad*cantidadtallas*0.05);// 's'   
       int dato5 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.07);// 'M' 
      int dato6 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.06);//'M'    
       int dato7 =(int) (cantidad*cantidadtallas-cantidad*cantidadtallas*0.09);//'M'    
       int dato8 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.08);//'M'   
       int dato9 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.10);//'L'    
       int dato10 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.09);//'L'    
       int dato11 = (int)(cantidad*cantidadtallas -cantidad*cantidadtallas *0.12);//'L'  
       int dato12 = (int)(cantidad*cantidadtallas-cantidad*cantidadtallas*0.10);//'L'    

       int tallas_S = dato1 + dato2 +dato3 + dato4 ;
       int  tallas_M = dato5 + dato6 +dato7 + dato8 ;
      int  tallas_L = dato9 + dato10 +dato11 + dato12 ;
         
      
      if(tallas_S>tallas_M && tallas_S > tallas_L ){
      modLista2.addElement("mayor talla S: " + tallas_S);
      }else if(tallas_M> tallas_L && tallas_M> tallas_S){ modLista2.addElement("mayor talla M: "+ tallas_M);}
      else { modLista2.addElement("mayor talla L: "+ tallas_L);}
                
                
    }//GEN-LAST:event_btn_mayor_tallasActionPerformed

    private void btn_mayor_procedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayor_procedenciaActionPerformed
         int cantidad = Integer.parseInt(txt_precio.getText());
       int cantidadnacionalidad = Integer.parseInt(spn_cantidad_nacionalidad.getValue().toString());
        String nacionalidad = txt_nacionalidad.getText();
          
       int dato1 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.05);//"extranjero"                      
       int dato2 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.04);//  "peruano"
       int dato3 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.06);//  "extrajero"
       int dato4 =(int) (cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.05);//  "peruano"
       int dato5 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.07);//  "extranjero"
      int dato6 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.06);//  "peruano"
       int dato7 =(int) (cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.09);//    "extrajero"
       int dato8 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.08);//   "peruano"
       int dato9 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.10);//    "extranjero"
       int dato10 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.09);//    "peruano"
       int dato11 = (int)(cantidad*cantidadnacionalidad -cantidad*cantidadnacionalidad*0.12);//    "extranjero"
       int dato12 = (int)(cantidad*cantidadnacionalidad-cantidad*cantidadnacionalidad*0.10);//      "peruano"

       int extranjero = dato1 + dato3 +dato5 + dato7 + dato9+ dato11;
       int  peruano = dato2 +dato4 + dato6 + dato8 + dato10 + dato12 ;
       
       if(peruano > extranjero ){ modLista4.addElement("mayor peruanos:"+ peruano  );}
       else{ modLista4.addElement("mayor extranjeros:" + extranjero);}
       
       
    }//GEN-LAST:event_btn_mayor_procedenciaActionPerformed

    private void btn_mayor_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mayor_generoActionPerformed
        int cantidad = Integer.parseInt(txt_precio.getText());
        
        
        int cantidadgenero = Integer.parseInt(spn_cantidad_genero.getValue().toString());
        String genero = txt_genero.getText();     
       int dato1 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.05);//  "hombre"                          
       int dato2 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.04);//  "hombre"     
       int dato3 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.06);//   "mujer"    
       int dato4 =(int) (cantidad*cantidadgenero-cantidad*cantidadgenero*0.05);//   "mujer"     
       int dato5 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.07);//  "hombre"    
      int dato6 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.06);//   "hombre"     
       int dato7 =(int) (cantidad*cantidadgenero-cantidad*cantidadgenero*0.09);//  "mujer"     
       int dato8 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.08);//  "mujer"       
       int dato9 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.10);//  "hombre"    
       int dato10 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.09);//  "hombre"    
       int dato11 = (int)(cantidad*cantidadgenero -cantidad *cantidadgenero*0.12);//"mujer"      
       int dato12 = (int)(cantidad*cantidadgenero-cantidad*cantidadgenero*0.10);//  "mujer"    

       int hombres = dato1 + dato2 +dato5 + dato6 + dato9 + dato10 ;
       int mujeres = dato3 + dato4 +dato7 + dato8 +dato11 + dato12 ;
       
       if(hombres>mujeres){modLista3.addElement("El mayor: "+hombres);}else{
       modLista3.addElement("El mayor"+mujeres);
       }
       
    }//GEN-LAST:event_btn_mayor_generoActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
       txt_genero.setText("");
       txt_nacionalidad.setText("");
       txt_precio.setText("");
       txt_talla.setText("");
      
     
        
        
        
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Jframe_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aplicar_1;
    private javax.swing.JButton btn_aplicar_2;
    private javax.swing.JButton btn_aplicar_3;
    private javax.swing.JButton btn_aplicar_4;
    private javax.swing.JButton btn_aplicar_5;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mayor_genero;
    private javax.swing.JButton btn_mayor_procedencia;
    private javax.swing.JButton btn_mayor_tallas;
    private javax.swing.JEditorPane jEditorPane1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> lst_ventas;
    private javax.swing.JList<String> lst_ventas1;
    private javax.swing.JList<String> lst_ventas2;
    private javax.swing.JList<String> lst_ventas3;
    private javax.swing.JSpinner spn_cantidad;
    private javax.swing.JSpinner spn_cantidad_genero;
    private javax.swing.JSpinner spn_cantidad_nacionalidad;
    private javax.swing.JSpinner spn_cantidad_talla;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextField txt_talla;
    // End of variables declaration//GEN-END:variables
}
