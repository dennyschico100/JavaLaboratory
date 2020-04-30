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
public class usuarios_ {
        


int id_usuario; 

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

String nombres;
String gapellidos;
String email;
String contraseña;
String telefono;

int estado;

    public usuarios_(int id_usuario, String nombres, String gapellidos, String email, String contraseña, String telefono, int estado) {
        this.id_usuario=id_usuario;
        this.nombres = nombres;
        this.gapellidos = gapellidos;
        this.email = email;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.estado = estado;
    }
    
    public usuarios_(){
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getGapellidos() {
        return gapellidos;
    }

    public void setGapellidos(String gapellidos) {
        this.gapellidos = gapellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
