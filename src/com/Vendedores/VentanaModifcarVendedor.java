/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vendedores;

import com.BaseDatos.AccionesBaseDeDatos;
import com.BaseDatos.MySqlConn;
import com.Instalador.*;
import com.Clientes.*;
import com.Utilidades.Validaciones;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Joako0z
 */
public class VentanaModifcarVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaNuevoCliente
     */
    
    MySqlConn objConn = new MySqlConn();
    Object[][] datos;
    String Estados[][];
    String Municipios[];
    String Colonias[];
    int idestado;
    int idmunicipio;
    int idcolonia;
    
    public VentanaModifcarVendedor() {
        initComponents();
        llenaEstados();
    }
    
    private void llenaEstados() {
        AccionesBaseDeDatos accion = new AccionesBaseDeDatos();
        Estados = accion.MatrizEstados();

        for (int i = 0; i < Estados.length; i++) {
            this.jComboBox1.addItem(Estados[i][1]);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(java.awt.Color.lightGray);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Vendedor");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel2.setText("Nombre");

        jTextField1.setEnabled(false);

        jLabel3.setText("Calle");

        jTextField2.setEnabled(false);

        jLabel4.setText("No.");

        jTextField3.setEnabled(false);

        jLabel5.setText("Estado");

        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Municipio");

        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DIRECCION:");

        jLabel7.setText("Colonia");

        jComboBox3.setEnabled(false);

        jLabel8.setText("Codigo postal");

        jTextField4.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("INFORMACION:");

        jLabel10.setText("Tel.Casa");

        jTextField5.setEnabled(false);

        jLabel11.setText("Tel.Celular.");

        jTextField6.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/save.png"))); // NOI18N
        jButton1.setText("Guardar Cambios");
        jButton1.setContentAreaFilled(false);
        jButton1.setEnabled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("ID");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Imagenes/search.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField8.setEnabled(false);

        jLabel12.setText("Total de Ventas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addComponent(jTextField1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextField5))))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel13)
                .addGap(51, 51, 51)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!Validaciones.CodigoPostal(this.jTextField4.getText())) {

            JOptionPane.showMessageDialog(this, "Condición explícita: Código postal sólo puede ser número", "error", 0);
            return;
        }

        if (Validaciones.Telefonos(this.jTextField5.getText()) && Validaciones.Telefonos(this.jTextField6.getText())) {

        } else {

            JOptionPane.showMessageDialog(this, "Condición explícita: Los campos de telefono solo pueden tener numeros y guiones", "error", 0);
            return;
        }

        if (this.jTextField1.getText().equals("") || this.jTextField2.equals("") || this.jTextField3.equals("") || this.jTextField4.equals("") || this.jTextField6.equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben de estar llenos", "error", 0);
            return;
        }
        
        String d = null;
        String query = "Select id from colonia where nombre='" + this.jComboBox3.getSelectedItem().toString() + "';";
        objConn.Consult(query);
        try {
            objConn.rs.first();
            System.out.println();
            d = objConn.rs.getString(1);
            idcolonia = Integer.valueOf(d);
            //System.out.println(d);
        } catch (Exception e) {
        }

///
        
         query = "update vendedor set "
                + "nomVend='" + this.jTextField1.getText()
                + "', calleVend='" + this.jTextField2.getText()
                + "', numVend='" + this.jTextField3.getText()
                + "', colVend='" + this.idcolonia
                + "', cpVend='" + this.jTextField4.getText()
                + "', munVend='" + this.idmunicipio
                + "', estadoVend='" + this.idestado
                + "', telcelVend='" + this.jTextField6.getText()
                + "', telVend='" + this.jTextField5.getText()
                + "', totVentas='" + this.jTextField8.getText() + "' where idVend="+this.jTextField7.getText();
         System.out.println("QUERY: "+query);
        objConn.Update(query);
        
        JOptionPane.showMessageDialog(this, "Vendedor modificado exitosamente", "Mensaje", 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        this.jComboBox2.removeAllItems();
        MySqlConn objConn = new MySqlConn();
        String d = null;
        String query = "Select Id from estado where Nombre='" + this.jComboBox1.getSelectedItem().toString() + "';";
        objConn.Consult(query);
        try {
            objConn.rs.first();
            System.out.println();
            d = objConn.rs.getString(1);
            this.idestado = Integer.valueOf(d);

        } catch (Exception e) {
        }

        String datos[];
        query = "Select nombre from municipio where estado_id=" + d + " order by nombre";
        objConn.Consult(query);
        int n = 0;
        int i;
        if (objConn.rs != null) {
            try {
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n = objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            } catch (Exception e) {
            }
            datos = new String[n];
            for (i = 0; i < n; i++) {
                try {
                    datos[i] = objConn.rs.getString(1);
                    this.jComboBox2.addItem(datos[i]);
                } catch (Exception e) {
                }

                try {
                    objConn.rs.next();
                } catch (Exception e) {
                }
            }
            objConn.closeRsStmt();;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        try {
            MySqlConn objConn = new MySqlConn();
            //System.out.println(CB2.getSelectedItem().toString());
            this.jComboBox3.removeAllItems();
            //System.out.println(CB2.getSelectedItem().toString());
            String d = null;
            String query = "Select id from municipio where Nombre='" + this.jComboBox2.getSelectedItem().toString() + "';";
            objConn.Consult(query);
            try {
                objConn.rs.first();
                System.out.println();
                d = objConn.rs.getString(1);
                idmunicipio = Integer.valueOf(d);
                //System.out.println(d);
            } catch (Exception e) {
            }

            String datos[];
            query = "Select nombre from colonia where municipio_id=" + d + " order by nombre";
            objConn.Consult(query);
            int n = 0;
            int i;
            if (objConn.rs != null) {
                try {
                    objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                    n = objConn.rs.getRow(); //regresa el numero actual del registro
                    objConn.rs.first();
                } catch (Exception e) {
                }
                datos = new String[n];
                for (i = 0; i < n; i++) {
                    try {
                        datos[i] = objConn.rs.getString(1);
                        this.jComboBox3.addItem(datos[i]);
                        //System.out.println(datos[i]);
                    } catch (Exception e) {
                    }

                    try {
                        objConn.rs.next();
                    } catch (Exception e) {
                    }
                }
                objConn.closeRsStmt();
                //objConn.closeConnection();
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String query = "Select * from vendedor where idVend="+this.jTextField7.getText();
        datos=control(query, 11);
        if(datos.length>0){
            this.jTextField1.setEnabled(true);
            this.jTextField2.setEnabled(true);
            this.jTextField3.setEnabled(true);
            this.jTextField4.setEnabled(true);
            this.jTextField5.setEnabled(true);
            this.jTextField6.setEnabled(true);
            this.jTextField8.setEnabled(true);
            this.jComboBox1.setEnabled(true);
            this.jComboBox2.setEnabled(true);
            this.jComboBox3.setEnabled(true);
            this.jButton1.setEnabled(true);
            this.jTextField1.setText((String)datos[0][1]);
            this.jTextField2.setText((String)datos[0][2]);
            this.jTextField3.setText((String)datos[0][3]);
            this.jTextField4.setText((String)datos[0][5]);
            this.jTextField5.setText((String)datos[0][8]);
            this.jTextField6.setText((String)datos[0][9]);
            this.jTextField8.setText((String)datos[0][10]);
            this.jComboBox3.setSelectedItem(datos[0][4]);
            this.jComboBox2.setSelectedItem(datos[0][6]);
            this.jComboBox1.setSelectedItem(datos[0][7]);
        }
        else{
            JOptionPane.showMessageDialog(this, "No se encontro el registro", "error", 0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public Object[][] control(String query,int tam) {
        String datos[][];
        Object matriz[][]=null;
        objConn.Consult(query);
        int n = 0;
        int i, j;
        if (objConn.rs != null) {
            try {
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n = objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            } catch (Exception e) {
            }

            datos = new String[n][tam];
            for (i = 0; i < n; i++) {
                for (j = 0; j < tam; j++) {
                    try {
                        datos[i][j] = objConn.rs.getString(j + 1);
                        System.out.print(datos[i][j] + " ");
                    } catch (Exception e) {
                    }
                }
                System.out.println();
                try {
                    objConn.rs.next();
                } catch (Exception e) {
                }
            }
            matriz = datos;
            objConn.closeRsStmt();
        }
        return matriz;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
