/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_reservaciones;
import Modelos.aulas;
import Modelos.reservaciones;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class reservaciones_Con  implements Crud_reservaciones {

     Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    PreparedStatement ps;
    reservaciones re = new reservaciones();
    
    @Override
    public List listar() {
         
         ArrayList<reservaciones> list = new ArrayList<>(); 
         String sql="Select *from reservaciones  ORDER BY fecha DESC ";
         int id=0;   
         try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                 reservaciones reser=new reservaciones();
                 reser.setId_usuario(resultado.getInt("id_usuario"));
                 reser.setId_aula(resultado.getInt("id_aula"));
                 reser.setHora(resultado.getString("hora"));
                 
                 reser.setFecha(resultado.getString("fecha"));
                 
                 reser.setEquipo(resultado.getString("equipo"));
                 list.add(reser);
                    
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA"+e);
        }
            
         return list;
        
    }
    

    @Override
    public reservaciones getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(reservaciones re ) {
        boolean res=false;
        //reservaciones re = new Reservaciones();
        
        String sql="insert into reservaciones(id_usuario,id_aula,id_hora,fecha,hora,equipo,estado) "
+ "VALUES("+re.getId_usuario()+","+re.getId_aula()+","+re.getId_hora()+" ,'"+re.getFecha()+"','"+re.getHora()+"','"+re.getEquipo()+"',"+re.getEstado()+" )";
            
        try{
        
        
        cn=conexion.abrir();
        res=conexion.ejecutar(sql);
        
            System.out.println("CONSULTA"+sql+re.getEquipo());
                
        return res=true;
    }catch(Exception e){
        System.out.println("ERORR RESREVACOINES"+e);
    }
    
        return res;
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
