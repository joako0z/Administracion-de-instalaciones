/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Vendedores;

import com.Clientes.*;
import com.BaseDatos.MySqlConn;
import java.util.Date;
import com.Utilidades.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joako0z
 */
public class VentanaConsultaVendedor extends javax.swing.JInternalFrame {
    /**
     * Creates new form VentanaNuevoCliente
     */
    
    JTable tabla1;
    JTextField[] campos;
    JLabel[] etiquetas;
    Object[][] datos;
    Object titulos[];
    JPanel p;
    JScrollPane scrollPane;
    MySqlConn objConn;
    
    public VentanaConsultaVendedor() {
        //initComponents();
        this.objConn = new MySqlConn();
        String query = "Select * from vendedor";
        Object titulos[] = {"ID del Vendedor", "Nombre del Vendedor","Calle del Vendedor","Numero del Vendedor"
            ,"Colonia del Vendedor","Codigo Postal del Vendedor","Municipio del Vendedor","Estado del Vendedor"
            , "Telefono Celular del Vendedor","Telefono del Vendedor","Total de Ventas"};
        datos=control(query, 11);
        creaTabla(titulos, datos);
    }
    
    public void creaTabla(Object[] titulos, Object[][] datosa) {
        datos = datosa;
        this.titulos=titulos;
        tabla1=new JTable(datosa, titulos);
        
        int tam = titulos.length;
        campos = new JTextField[tam];
        etiquetas = new JLabel[tam];

        p = new JPanel();

        for (int i = 0; i < tam; i++) {
            etiquetas[i] = new JLabel((String) titulos[i]);
            campos[i] = new JTextField(20);
            campos[i].setName("" + i);
            campos[i].addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextField jt=(JTextField)evt.getSource();
                System.out.println(jt.getName()+" "+jt.getText());  
                filtra(jt);
            }
        });
                
            p.add(etiquetas[i]);
            p.add(campos[i]);
        }
        Color color = new Color(0,153,102);
        p.setBackground(color);
        
        tabla1.setPreferredScrollableViewportSize(new Dimension(1000, 100));
        scrollPane = new JScrollPane(tabla1);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        tabla1.setVisible(true);
        p.add(scrollPane);
        //scrollPane.add(p);

        this.add(p);
        this.setPreferredSize(new Dimension(1070, 445));
        this.setVisible(true);
        this.pack();
        this.dispose();
    }
    
    public void filtra(JTextField jt) {
        if(jt.getText().equals("")){
            //aÃ±adir todo
            System.out.println("Copiando todos los datos");            
            for (int i = 0; i < datos.length; i++) {
                
                //aÃ±adir todos los campos                
                for (int j = 0; j < datos[i].length; j++) {
                    System.out.print(datos[i][j]+" ");                    
                }
                System.out.println("");                                
            }            
            tabla1.setModel(new DefaultTableModel(datos, titulos));
            //tabla1=new JTable(datos, titulos);
            return;
        }
                
        
        System.out.println("Entrando a filtra...");
        
        int col=Integer.parseInt(jt.getName());
        String dato=jt.getText();
        int contadorRenglones=0;
                        
        for (int i = 0; i < datos.length; i++) {
            //String aux=(String)datos[i][col];
            String aux=String.valueOf(datos[i][col]);
            //modelo.removeRow(0);
            System.out.println("Comparando "+dato+" con "+aux);
            if(aux.contains(dato)){
                System.out.println("Encontrado igual...");
                contadorRenglones++;
            }            
        }                                
        
        Object [][]datosNuevos=new Object[contadorRenglones][datos[0].length];
        int iDatosNuevos=0;
        
        //pasar datos
        for (int i = 0; i < datos.length; i++) {
            //String aux=(String)datos[i][col];
            String aux=String.valueOf(datos[i][col]);
            if(aux.contains(dato)){                     
                System.out.println("copiando datos nuevos");
                for (int j = 0; j < datos[i].length; j++) {
                    System.out.print("Copiando: "+datos[i][j]+" ");                    
                    datosNuevos[iDatosNuevos][j]=datos[i][j];                                                            
                }        
                iDatosNuevos++;
            }            
        }   
        tabla1.setModel(new DefaultTableModel(datosNuevos, titulos));
        //tabla1=new JTable(datosNuevos, titulos);
    }
    
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setForeground(java.awt.Color.lightGray);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
