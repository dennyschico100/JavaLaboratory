/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_usuarios;
import Modelos.dia_hora;
import Modelos.usuarios_;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franciso
 */
public class usuarios_Controlador  implements  Crud_usuarios{

    Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    PreparedStatement ps;
    usuarios_ users = new usuarios_();
    @Override
    public List listar(String email, String password) {
        
        ArrayList<usuarios_> list = new ArrayList<>(); 
        String query="SELECT *FROM usuarios where email='"+email+"' AND  contraseña='"+password+"'";
         
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(query);
                while(resultado.next()){
                usuarios_ users_ = new usuarios_();
                users_.setId_usuario(resultado.getInt("id_usuario"));
                users_.setNombres(resultado.getString("nombres"));
                users_.setGapellidos(resultado.getString("apellidos"));
                users_.setEmail(resultado.getString("email"));
                users_.setContraseña(resultado.getString("contraseña"));
                users_.setTelefono(resultado.getString("telefono"));
                users_.setEstado(resultado.getInt("estado"));
              
                    list.add(users_);
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA HORAA"+e);
        }
            
         return list;
        
    }
    
     public List listar2(String email) {
        
        ArrayList<usuarios_> list = new ArrayList<>(); 
        String query="SELECT *FROM usuarios where email='"+email+"'";
         
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(query);
                while(resultado.next()){
                usuarios_ users_ = new usuarios_();
                users_.setId_usuario(resultado.getInt("id_usuario"));
                users_.setNombres(resultado.getString("nombres"));
                users_.setGapellidos(resultado.getString("apellidos"));
                users_.setEmail(resultado.getString("email"));
                users_.setContraseña(resultado.getString("contraseña"));
                users_.setTelefono(resultado.getString("telefono"));
                users_.setEstado(resultado.getInt("estado"));
              
                    list.add(users_);
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA HORAA"+e);
        }
            
         return list;
        
    }
       
    @Override
    public usuarios_ getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }
    

    @Override
    public boolean add(usuarios_ usuario) {
          boolean res=false;
        //reservaciones re = new Reservaciones();
        
        String sql="insert into usuarios(nombres,apellidos,email,contraseña,telefono,estado) "
+ "VALUES('"+usuario.getNombres()+"','"+usuario.getGapellidos()+"','"+usuario.getEmail()+"','"+usuario.getContraseña()+"','"+usuario.getTelefono()+"',"+usuario.getEstado()+")";
            
        try{
        
        
        cn=conexion.abrir();
        res=conexion.ejecutar(sql);
        
            System.out.println("CONSULTA"+sql);
            System.out.println("contra"+usuario.getContraseña());
                
        return res=true;
    }catch(Exception e){
        System.out.println("ERORR RESREVACOINES"+e);
    }
    
        return res;
    }
    

    @Override
    public boolean edit(int id) {
        boolean res=false;
        String sql="update usuarios set estado=2 where id_usuario= '"+id+"'";
    Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    PreparedStatement ps;
    
        try {
            
        cn=conexion.abrir();
        res=conexion.ejecutar(sql);
            System.out.println("SEE CAMBIO DE ESTADO");
            res=true;
        } catch (Exception e) {
            System.out.println("erro d e estadp"+e);
        }
        
        return res;
    }
    

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEmail(String email, String password) {
    //String query="SELECT *FROM dia_hora where fecha='"+fecha+"'";
String query="SELECT *FROM usuarios where email='"+email+"' AND  contraseña='"+password+"'";

        boolean res=false;
        
        try {
            cn=conexion.abrir();
            System.out.println("VAMOS A A VESR UN "+query);
            
            resultado=conexion.consultar(query);
            usuarios_ users2 = new usuarios_();
                
            if(resultado.next()){
             
                users2.setId_usuario(resultado.getInt("id_usuario"));
                users2.setNombres(resultado.getString("nombres"));
                users2.setGapellidos(resultado.getString("apellidos"));
                users2.setEmail(resultado.getString("email"));
                users2.setContraseña(resultado.getString("contraseña"));
                users2.setTelefono(resultado.getString("telefono"));
                users2.setEstado(resultado.getInt("estado"));
                System.out.println("ID DE USUARIO----   "+resultado.getInt("id_usuario")+"---HAYYYYR RESULTADOSDE USUARIOO  tru........"
                        + ""+users2.getId_usuario());
                res=true;
               return res;
                //System.out.println("ID AFUERA DE LWHILE----   "+resultado.getInt("id_usuario")+"---HAYYYYR RESULTADOSDE USUARIOO ........"+res);
               
              
               
               
            }else{
                System.out.println("VPOS ES ELSE A A VESR UN "+res);
            
                return false;
            }
             
                
        } catch (Exception e) {
             System.out.println(query);
               
            System.out.println("ERROR CONSULTA DE GET"+e.getMessage());
        }
       
        //return dhora;
        return res;
    
    }
    

   
    
    
}
