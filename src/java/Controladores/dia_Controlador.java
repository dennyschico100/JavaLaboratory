/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaces.Crud_dia;
import Modelos.dia;
import Modelos.dia_hora;
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
public class dia_Controlador implements Crud_dia {

    dia Dia = new dia();
    dia_hora dh = new dia_hora();

    Connection cn;
    Conexion conexion = new Conexion();
    ResultSet resultado;
    Statement sentencai;
    ResultSet resultado2;
    Statement sentenci2;
    public static int valor1 = 0;
    public static int valor2 = 0;

    @Override
    public List listar(String fecha) {
        
        ArrayList<dia> list = new ArrayList<>();
        String sql = "Select *from hora";
        String sql2 = "Select *from dia_hora_lab where fecha='" + fecha + "'";

        int[] vector = new int[10];
        ArrayList<Integer> arr = new ArrayList<Integer>();    
        
        int i=0;
        
        try {

            cn = conexion.abrir();

            resultado = conexion.consultar(sql);
            cn = null;
            cn = conexion.abrir();
            resultado2 = conexion.consultar2(sql2);
            //dia d2 = new dia();
            while (resultado2.next()) {
                //vector[i]=;
                arr.add(resultado2.getInt("id_hora"));
                System.out.println("EL VECTOR ES"+vector[i]);
            i++;
                        }
            i=0;
            int j=0;
            while (resultado.next()) {
                //j=vector[i];
                
                //System.out.println("COINCIDENCIA ES:"+vector[i]+" Y "+resultado.getInt("id_hora"));
                
                if(arr.contains(resultado.getInt("id_hora")) ){
                    
                }else{
                dia d = new dia();
                    
                d.setId_dia(resultado.getInt("id_hora"));
                d.setFecha_entrada(resultado.getString("hora_entrada"));
                d.setFecha_salida(resultado.getString("hora_salida"));
                list.add(d);
                }
                i++;
            }

        } catch (Exception e) {
            System.err.println("aqui en diaContro OCNSULTA DE DIA" + e);
        }

        return list;

    }

    @Override
    public dia getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public void ad() {

        ArrayList<dia> cars = new ArrayList<>();

    }

    @Override
    public boolean add(dia Dia) {
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
