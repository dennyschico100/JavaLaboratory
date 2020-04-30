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
public class reservaciones {
  
int id_usuario;
int id_aula;  
int id_hora;
String fecha;
String hora; 
String equipo;
int estado;  
public reservaciones(){
    
}

    public reservaciones(int id_usuario, int id_aula, int id_hora, String fecha, String hora, String equipo, int estado) {
        this.id_usuario = id_usuario;
        this.id_aula = id_aula;
        this.id_hora = id_hora;
        this.fecha = fecha;
        this.hora = hora;
        this.equipo = equipo;
        this.estado = estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public int getId_hora() {
        return id_hora;
    }

    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


}
