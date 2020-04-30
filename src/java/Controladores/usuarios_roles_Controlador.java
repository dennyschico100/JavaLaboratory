/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_usuarios_roles;
import Modelos.dia_hora;
import Modelos.usuario_roles;
import Modelos.usuarios_;
import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franciso
 */
public class usuarios_roles_Controlador implements Crud_usuarios_roles {

   
    Connection cn;

    ResultSet resultado;
    ResultSet resultado2;

    Statement sentencai;

    @Override
    public List listar() {

        ArrayList<usuarios_> list = new ArrayList<>();
        String sql = "Select *from usuarios_roles where id_rol=1";
        Conexion conexion = new Conexion();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        try {

            cn = conexion.abrir();

            resultado = conexion.consultar(sql);
            cn = null;
            cn = conexion.abrir();
            //dia d2 = new dia();
            int i=0;
                
                
                while (resultado.next()){
                arr.add(resultado.getInt("id_usuario"));
                
                } 
                //vector[i]=;
                i++;
                
            
             
            

            int j = 0;
            String sql2 = "Select *from usuarios where estado=1";
            Conexion conexion1= new Conexion();
            cn=null;
            cn=conexion.abrir();
            resultado2 = conexion1.consultar2(sql2);

            while (resultado2.next()) {
                //j=vector[i];

                //System.out.println("COINCIDENCIA ES:"+vector[i]+" Y "+resultado.getInt("id_hora"));
                if (arr.contains(resultado2.getInt("id_usuario"))) {
                    usuarios_ users_ = new usuarios_();
                    users_.setId_usuario(resultado2.getInt("id_usuario"));
                    users_.setNombres(resultado2.getString("nombres"));
                    users_.setGapellidos(resultado2.getString("apellidos"));
                    users_.setEmail(resultado2.getString("email"));
                    users_.setContraseña(resultado2.getString("contraseña"));
                    users_.setTelefono(resultado2.getString("telefono"));
                    users_.setEstado(resultado2.getInt("estado"));

                    list.add(users_);
                    
        
                }else{
                    System.out.println(sql2 );
                    
                }
                System.out.println("dentro del while");
            }

        } catch (Exception e) {
            System.err.println("posible erro OCNSULTA DE DIA roles de crud" + e);
        }
        

        return list;

    }

    @Override
    public List getOne(int id) {
        String query = "SELECT *FROM usuarios_roles where id_usuario=" + id + "";

        ArrayList<usuario_roles> list = new ArrayList<>();

        try {
            Conexion conexion = new Conexion();

            cn = conexion.abrir();
            System.out.println("ABRIENDO ROLE");

            resultado = conexion.consultar(query);

            if (resultado.next()) {
                usuario_roles u = new usuario_roles();
                u.setId(resultado.getInt("id"));
                u.setId_rol(resultado.getInt("id_rol"));
                u.setId_usuario(resultado.getInt("id_usuario"));
                System.out.println("HAYYYY  ROLES........" + u.getId_rol());

                list.add(u);

            } else {

                //dhora = new dia_hora();
                System.out.println("NOOOOOOO ROLESO  ..........." + query);
            }

            System.out.println("CERRANDO...........");

        } catch (Exception e) {
            System.out.println("ERROR CONSULTA DE GET" + e.getMessage());
        }

        return list;

    }

    @Override
    public boolean add(usuario_roles users_roles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean  add2(int rol, int id_user){
        boolean res=false;
        
        //reservaciones re = new Reservaciones();
        
        String sql="insert into usuarios_roles(id_rol,id_usuario) "
        + "VALUES("+rol+", "+id_user+" )";
            
        try{
        
        Conexion conexion = new Conexion();
        cn=conexion.abrir();
        res=conexion.ejecutar(sql);
        
        System.out.println("CONSULTA"+sql);
                
        return res=true;
    }catch(Exception e){
        System.out.println("ERROR ROLES ASIGNAR ROLESA UN USER"+e);
    
    }
        
    
        return  res;
    
    }
    
    
    @Override
    public boolean edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
