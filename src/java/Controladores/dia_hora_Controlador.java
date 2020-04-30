/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Interfaces.Crud_dia_hora;


import Modelos.dia_hora;
import config.Conexion;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Franciso
 */
public class dia_hora_Controlador  implements  Crud_dia_hora {
    Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai; 
    //INSTANCIANDO UN MODELO !!!
    dia_hora dhora;
    public boolean  EspacioDIa=false;
     public boolean  EspacioHora=false;
    public int espacio=0;
    @Override
    public List listar() {
    
         ArrayList<dia_hora> list = new ArrayList<>(); 
         String sql="Select *from dia_hora_lab";
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                    dia_hora dh= new dia_hora();
                    //dh.setId_dia_hora_lab(resultado.getInt(""));
                    dh.setFecha(resultado.getString("fecha"));
                    dh.setId_hora(resultado.getInt("id_hora"));
                    dh.setId_aula(resultado.getInt("id_aula"));
                    
                    list.add(dh);
                }
                
                
        } catch (Exception e) {
                System.err.println("pos OCNSULTA DE DIA HORAA"+e);
        }
            
         return list;
        
    
    }
    
    
    @Override
    public dia_hora getOne(String fecha, int aula) {
        String query="SELECT *FROM dia_hora_lab where fecha='"+fecha+"' AND id_aula="+aula;
        try {
            
            cn=conexion.abrir();
            System.out.println("abirneod");
            
            resultado=conexion.consultar(query);
            
            if(resultado.next()){
                while(resultado.next()){
                dhora= new dia_hora();
                dhora.setId_dia_hora_lab(resultado.getInt(""));
                dhora.setFecha(resultado.getString("fecha"));
                dhora.setId_aula(resultado.getInt("id_aula"));
                dhora.setId_hora(resultado.getInt("id_hora"));
                
                 System.out.println("HAYYYYYYYYYYYYYYR RESULTADOS........");
                espacio++;
                }
               
            }else{
                    EspacioDIa=true;
                    dhora = new dia_hora();
                    dhora.setId_hora(100);
                    //dhora.setId_dia_hora(22);
                    
                    dhora.setFecha("addadd");
                    
        System.out.println("NOOOOOOOOOOO...........");
            }
             if(espacio > 5){
                    EspacioHora=false;
                }else{
                    EspacioHora=true;
                }
       
        System.out.println("CERRANDO...........");
                
        } catch (Exception e) {
            System.out.println(query);
            System.out.println(espacio+"ERROR CONSULTA DE GET ONE DIAHORA CONTROLADOR"+e.getMessage());
        }
       
        return dhora;
    }

    @Override
    public boolean add(dia_hora dhora) {
      boolean res=false;
        //reservaciones re = new Reservaciones();
      String sql ="INSERT INTO dia_hora_lab (fecha,id_aula,id_hora) VALUES('"+dhora.getFecha()+"',"+dhora.getId_aula()+","+dhora.getId_hora()+") "; 
      try{
        
        
        cn=conexion.abrir();
        res=conexion.ejecutar(sql);
        
            System.out.println("CONSULTA de guardae la hora el la validacion");
                
        return res=true;
    }catch(Exception e){
        System.out.println("ERORR VALIDACION HRASS"+e);
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

    @Override
    public List listar2(String fecha) {
    
         ArrayList<dia_hora> list = new ArrayList<>(); 
         String sql="Select *from dia_hora_lab where fecha=' "+fecha+"'";
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                    dia_hora dh= new dia_hora();
                    dh.setId_dia_hora_lab(resultado.getInt("id_dia_hora_lab"));
                    dh.setFecha(resultado.getString("fecha"));
                    dh.setId_aula(resultado.getInt("id_aula"));
                    dh.setId_hora(resultado.getInt("id_hora"));
                    
                    list.add(dh);
                }
                
                
        } catch (Exception e) {
                System.err.println("posible erro OCNSULTA DE DIA HORAA"+e);
        }
            
         return list;
    
    }
    
            
   
}
