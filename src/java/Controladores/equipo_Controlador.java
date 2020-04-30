/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_equipo;
import Modelos.aulas;
import Modelos.equipo;
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
public class equipo_Controlador  implements Crud_equipo{

    equipo Eq = new equipo();
    Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    @Override
    public List listar() {
         
         ArrayList<equipo> list = new ArrayList<>(); 
         String sql="Select *from equipo";
            try {
            
                cn=conexion.abrir();

                resultado=conexion.consultar(sql);
                while(resultado.next()){
                    equipo E = new equipo();
                    E.setId_equipo(resultado.getInt("id_equipo"));
                    E.setTipo(resultado.getString("tipo"));
                    
                    E.setDescripcion(resultado.getString("descripcion"));
                    
                    list.add(E);
                    
                }
                
                
        } catch (Exception e) {
                System.err.println("errro OCNSULTA DE DIA"+e);
        }
            
         return list;
        
    }
    
    
    @Override
    public equipo getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(equipo Equoipo) {
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
