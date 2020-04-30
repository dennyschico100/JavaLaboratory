/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelos.dia;
import java.util.List;

/**
 *
 * @author Franciso
 */
public interface Crud_dia {
    public List listar(String fecha);
    public dia getOne(int id);
    public boolean add(dia Dia );
    public boolean edit(int id );
    public boolean delete(int id );
    
}
