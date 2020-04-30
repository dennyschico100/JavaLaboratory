/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelos.equipo;
import java.util.List;

/**
 *
 * @author Franciso
 */
public interface Crud_equipo {
    
    public List listar();
    public equipo getOne(int id);
    public boolean add(equipo Equoipo);
    public boolean edit(int id );
    public boolean delete(int id );
    
}
