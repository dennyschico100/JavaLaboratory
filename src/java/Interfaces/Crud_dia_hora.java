/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Modelos.dia_hora;
import java.util.List;
/**
 *
 * @author Franciso
 */
public interface Crud_dia_hora {
    public List listar();
    public List listar2(String fecha);
    public dia_hora getOne(String fecha,int aula);
    public boolean add(dia_hora dhora );
    public boolean edit(int id );
    public boolean delete(int id );
    
    
}
