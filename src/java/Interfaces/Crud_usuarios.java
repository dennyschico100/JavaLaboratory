/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelos.reservaciones;
import Modelos.usuarios_;
import java.util.List;

/**
 *
 * @author Franciso
 */
public interface Crud_usuarios {
    public List listar(String email, String password);
    public List listar2(String email);
    
    public usuarios_ getOne(int id);
    public boolean getEmail(String email,String password);
    public boolean add(usuarios_ usuario );
    public boolean edit(int id );
    public boolean delete(int id );
    
}
