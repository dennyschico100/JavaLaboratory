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
public class aulas {
    public aulas(){
        
    }

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
int id_aula; 
String tipo;
int capacidad;
String descripcion;

    public aulas(int id_aula, String tipo, int capacidad, String descripcion) {
        this.id_aula = id_aula;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
    }
    

    
}
