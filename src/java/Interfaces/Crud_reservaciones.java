/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelos.reservaciones;
import java.util.List;

/**
 *
 * @author Franciso
 */
public interface Crud_reservaciones {
    public List listar();
    public reservaciones getOne(int id);
    public boolean add(reservaciones Reservaciones );
    public boolean edit(int id );
    public boolean delete(int id );
    
}
