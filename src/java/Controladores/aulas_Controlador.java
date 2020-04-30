/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_aulas;
import Modelos.aulas;
import Modelos.dia;
import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franciso
 */
public class aulas_Controlador implements Crud_aulas {

     aulas Aulas = new aulas();
    //dia_hora dh= new dia_hora();
    
     Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    @Override
    public List listar() {
           
         ArrayList<aulas> list = new ArrayList<>(); 
         String sql="Select *from aulas";
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                    aulas a = new aulas();
                    a.setId_aula(resultado.getInt("id_aula"));
                    a.setTipo(resultado.getString("tipo"));
                    a.setCapacidad(resultado.getInt("capacidad"));
                    a.setDescripcion(resultado.getString("descripcion"));
                    
                    list.add(a);
                    
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA"+e);
        }
            
         return list;
        
    
    
    }
    

    @Override
    public List getOne(int id) {
             ArrayList<aulas> list = new ArrayList<>(); 
         String sql="Select *from aulas where id_aula= "+id+"";
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                    aulas a = new aulas();
                    a.setId_aula(resultado.getInt("id_aula"));
                    a.setTipo(resultado.getString("tipo"));
                    a.setCapacidad(resultado.getInt("capacidad"));
                    a.setDescripcion(resultado.getString("descripcion"));
                    
                    list.add(a);
                    
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA"+e);
        }
            
         return list;
        
    
    }
    

    @Override
    public boolean add(aulas Aulas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
