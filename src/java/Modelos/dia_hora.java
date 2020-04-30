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
public class dia_hora {
    public dia_hora(){
        
    }
    


int id_dia_hora_lab;
String fecha;
int id_hora;
int id_aula;

    public dia_hora(int id_dia_hora_lab, String fecha, int id_hora, int id_aula) {
        this.id_dia_hora_lab = id_dia_hora_lab;
        this.fecha = fecha;
        this.id_hora = id_hora;
        this.id_aula = id_aula;
    }

    public int getId_dia_hora_lab() {
        return id_dia_hora_lab;
    }

    public void setId_dia_hora_lab(int id_dia_hora_lab) {
        this.id_dia_hora_lab = id_dia_hora_lab;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_hora() {
        return id_hora;
    }

    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }


}
