/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.BaseDatos;

/**
 *
 * @author gsalazar
 */
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
public class AccionesBaseDeDatos  extends JFrame{
    MySqlConn objConn=new  MySqlConn();

    public static void main(String ... args){
       AccionesBaseDeDatos bd = new AccionesBaseDeDatos();
      
       //bd.insertar();
      
       // bd.modificar("13"); //cuenta a cambiar
       
        //bd.borrar("67");
        bd.control();

       bd.setSize(400,400);
       bd.setVisible(true);

    }

public void borrar_cliente(String id){
String query= "delete from cliente where idCliente ="+id;
int j=objConn.Update(query);
}

public void borrar_vendedor(String id){
String query= "delete from vendedor where idVend ="+id;
int j=objConn.Update(query);
}

public void borrar_instalador(String id){
String query= "delete from instalador where idInstal ="+id;
int j=objConn.Update(query);
}

public void modificar(String id){
    String query = "Update usuario set usuario='rosy', password='pfkk' where id = "+id;
    int j=objConn.Update(query); //j numero de registros afectados por la accion
    System.out.println("Numero de registros afectados por la accion:"+j);
}

public void insertar(){
   String query = "Insert into usuario (id, usuario, password, privilegio)"
           + " values ('13','fer','tgh_34','2')";
   int j=objConn.Update(query);
   System.out.println("Numero de registros afectados por la accion:"+j);
}

public void control(){
    String datos[][];
    Object matriz[][];
    String query="Select * from cliente";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][4];
            for(i=0;i<n;i++){
                for(j=0;j<4;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idCliente","nomCliente","calleCliente","numCliente"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }


}
public void controlVendedor(){
    String datos[][];
    Object matriz[][];
    String query="Select * from vendedor";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idVend","nomVend","calleVend","numVend","colVend", "cpVend","delVend","munVend","estadoVend","paisVend","telcelVend","telVend","totVentas"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}


public void controlInstalador(){
    String datos[][];
    Object matriz[][];
    String query="Select * from instalador";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idInstal","nomInstal","calleInstal","numInstal","colInstal", "cpInstal","delInstal","munInstal","estadoInstal","paisInstal","telcelInstal","telInstal","totInstal"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}

public void controlCliente(){
    String datos[][];
    Object matriz[][];
    String query="Select * from cliente";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idCliente","nomCliente","calleCliente","numCliente","colCliente", "cpCliente","delCliente","munCliente","estadoCliente","paisCliente","telcelCliente","telCliente","fecregCliente"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}

public void controlVendedor_nombre(String nombre){
    String datos[][];
    Object matriz[][];
    String query="Select * from vendedor where nomVend like '%"+nombre+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idVend","nomVend","calleVend","numVend","colVend", "cpVend","delVend","munVend","estadoVend","paisVend","telcelVend","telVend","totVentas"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}

public void controlVendedor_colonia(String colonia){
    String datos[][];
    Object matriz[][];
    String query="Select * from vendedor where colVend like '%"+colonia+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idVend","nomVend","calleVend","numVend","colVend", "cpVend","delVend","munVend","estadoVend","paisVend","telcelVend","telVend","totVentas"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}
public void controlInstalador_nombre(String nombre){
    String datos[][];
    Object matriz[][];
    String query="Select * from instalador where nomInstal like '%"+nombre+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idInstal","nomInstal","calleInstal","numInstal","colInstal", "cpInstal","delInstal","munInstal","estadoInstal","paisInstal","telcelInstal","telInstal","totInstal"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}
public void controlInstalador_colonia(String colonia){
    String datos[][];
    Object matriz[][];
    String query="Select * from instalador where colInstal like '%"+colonia+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idInstal","nomInstal","calleInstal","numInstal","colInstal", "cpInstal","delInstal","munInstal","estadoInstal","paisInstal","telcelInstal","telInstal","totInstal"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }
        
}

public String[] seleccionar_cliente(String id){
        String datos[]=null;
        String query = "Select * from cliente where idCliente="+id;
        objConn.Consult(query);
        System.err.println("ENTRANDO A LEER EN EL VECTOR...");
        if(objConn.rs!=null){
            datos=new String[16];
            try {
                //System.err.println("ENTRANDO A ESCRIBIR EN EL VECTOR...");
                datos[0]=objConn.rs.getString(1);
                datos[1]=objConn.rs.getString(2);
                datos[2]=objConn.rs.getString(3);
                datos[3]=objConn.rs.getString(4);
                datos[4]=objConn.rs.getString(5);
                datos[5]=objConn.rs.getString(6);
                datos[6]=objConn.rs.getString(7);
                datos[7]=objConn.rs.getString(8);
                datos[8]=objConn.rs.getString(9);
                datos[9]=objConn.rs.getString(10);
                datos[10]=objConn.rs.getString(11);
                datos[11]=objConn.rs.getString(12);
                datos[12]=objConn.rs.getString(13);
                
            } catch (SQLException ex) {
                //Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No existe el ID, por favor, escriba un ID válido", "Error al leer", 0);
            }
        }
        return datos;
    }

public String[] seleccionar_vendedor(String id){
        String datos[]=null;
        String query = "Select * from vendedor where idVend="+id;
        objConn.Consult(query);
        System.err.println("ENTRANDO A LEER EN EL VECTOR...");
        if(objConn.rs!=null){
            datos=new String[16];
            try {
                //System.err.println("ENTRANDO A ESCRIBIR EN EL VECTOR...");
                datos[0]=objConn.rs.getString(1);
                datos[1]=objConn.rs.getString(2);
                datos[2]=objConn.rs.getString(3);
                datos[3]=objConn.rs.getString(4);
                datos[4]=objConn.rs.getString(5);
                datos[5]=objConn.rs.getString(6);
                datos[6]=objConn.rs.getString(7);
                datos[7]=objConn.rs.getString(8);
                datos[8]=objConn.rs.getString(9);
                datos[9]=objConn.rs.getString(10);
                datos[10]=objConn.rs.getString(11);
                datos[11]=objConn.rs.getString(12);
                datos[12]=objConn.rs.getString(13);
                
            } catch (SQLException ex) {
               // Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No existe el ID, por favor, escriba un ID válido", "Error al leer", 0);
            }
        }
        return datos;
    }

public String[] seleccionar_instalador(String id){
        String datos[]=null;
        String query = "Select * from instalador where idInstal="+id;
        objConn.Consult(query);
        System.err.println("ENTRANDO A LEER EN EL VECTOR...");
        if(objConn.rs!=null){
            datos=new String[16];
            try {
                //System.err.println("ENTRANDO A ESCRIBIR EN EL VECTOR...");
                datos[0]=objConn.rs.getString(1);
                datos[1]=objConn.rs.getString(2);
                datos[2]=objConn.rs.getString(3);
                datos[3]=objConn.rs.getString(4);
                datos[4]=objConn.rs.getString(5);
                datos[5]=objConn.rs.getString(6);
                datos[6]=objConn.rs.getString(7);
                datos[7]=objConn.rs.getString(8);
                datos[8]=objConn.rs.getString(9);
                datos[9]=objConn.rs.getString(10);
                datos[10]=objConn.rs.getString(11);
                datos[11]=objConn.rs.getString(12);
                datos[12]=objConn.rs.getString(13);
                
            } catch (SQLException ex) {
                //Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No existe el ID, por favor, escriba un ID válido", "Error al leer", 0);
            }
        }
        return datos;
    }


public void controlCliente_nombre(String nombre){
    String datos[][];
    Object matriz[][];
    String query="Select * from cliente where nomCliente like '%"+nombre+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idCliente","nomCliente","calleCliente","numCliente","colCliente", "cpCliente","delCliente","munCliente","estadoCliente","paisCliente","telcelCliente","telCliente","fecregCliente"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }

      
}


public void controlCliente_colonia(String colonia){
    String datos[][];
    Object matriz[][];
    String query="Select * from cliente where colCliente like '%"+colonia+"%'";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][13];
            for(i=0;i<n;i++){
                for(j=0;j<13;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
        
        Object titulos[] = {"idCliente","nomCliente","calleCliente","numCliente","colCliente", "cpCliente","delCliente","munCliente","estadoCliente","paisCliente","telcelCliente","telCliente","fecregCliente"};
        JTable tabla = new JTable(matriz,titulos);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        objConn.closeConnection();

    }
        
}

/////////////////////////////////////////////////////////////////////control nuevo sistema
public String[][] MatrizEstados(){
    String datos[][]=null;
    Object matriz[][];
    String query="Select id,nombre from estado";
//    String query= "Select * from usuario where privilegio = '1'";
    //String query= "Select id, usuario from usuario where privilegio = '2' order by usuario";
    objConn.Consult(query);
    int n=0;
        int i,j;
        if(objConn.rs!=null){
            try{
                objConn.rs.last(); //se posiciona en el ultimo registros de la tabla
                n=objConn.rs.getRow(); //regresa el numero actual del registro
                objConn.rs.first();
            }catch(Exception e){}
            
            datos=new String[n][2];
            for(i=0;i<n;i++){
                for(j=0;j<2;j++){
                    try{
                        datos[i][j]=objConn.rs.getString(j+1);
                        System.out.print(datos[i][j]+" ");
                    }catch(Exception e){ }
                }
                System.out.println();
                try{
                    objConn.rs.next();
                }catch(Exception e){}
            }
            matriz = datos;
         
        objConn.closeRsStmt();
 
        objConn.closeConnection();

    }
        return datos;
}




}

//http://docs.oracle.com/javase/1.4.2/docs/api/java/sql/ResultSet.html
