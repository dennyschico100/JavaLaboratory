/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
 
  private Connection con=null;
    
    private String url;
    private  String usuario;
   private  String contraseña;
    Connection cn;
    Statement ejecutar;
    
    public Conexion() {
       
        
    }
    
   
   
    
   public Connection abrir(){
        
        try {
               
            url="";
            usuario="root";
            contraseña="Francisco100";
            //Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      
            cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=aulas2;user=sa11;password=12345;");
            
            //cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/notas" ,"root","Francisco100");
            ejecutar=(Statement)cn.createStatement();
            
        } catch (Exception e) {
            cn=null;
            System.out.println("ERRRO CONEXION"+e.getMessage()+"---1");
        }
        return  cn;
    }
    public void cerrar(){
        
        try {
            
            if (cn!=null) {
                cn.close();
            }
        } catch (Exception e) {
            cn=null;
            System.out.println(""+e.getMessage()+"---2");
        }
}
    
    public boolean ejecutar(String c){
        boolean estado=false;
        try {
            abrir();
            ejecutar.execute(c);
            
            estado=true;
        } catch (Exception e) {
            cn=null;
            System.out.println(""+e.getMessage()+"---EN EJECUTAR ERRO");
        }
        return  estado;
}
        
        
    public ResultSet consultar(String c){
        boolean estado=false;
        ResultSet rs=null;
        try {
            abrir();
            rs=ejecutar.executeQuery(c);
            
            return rs;
        } catch (Exception e) {
            cn=null;
            System.out.println(""+e.getMessage()+"---METODO CONSULTAR");
        }
        
        return  null;
}
      
    public ResultSet consultar2(String c){
        boolean estado=false;
        ResultSet rs=null;
        try {
            abrir();
            rs=ejecutar.executeQuery(c);
            
            return rs;
        } catch (Exception e) {
            cn=null;
            System.out.println(""+e.getMessage()+"---METODO CONSULTAR");
        }
        
        return  null;
}


    

    


   
}
