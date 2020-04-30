/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Franciso
 */
public class dia {

    
int id_dia;
String fecha_entrada;
String fecha_salida;

public dia(){
 
}

    public dia(int id_dia, String fecha_entrada, String fecha_salida) {
        this.id_dia = id_dia;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }




    public int getId_dia() {
        return id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
    

}
