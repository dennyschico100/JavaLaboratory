/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelos.usuario_roles;
import java.util.List;

/**
 *
 * @author Franciso
 */
public interface Crud_usuarios_roles {
    public List listar();
    public List getOne(int id);
    
    
    public boolean add(usuario_roles users_roles );
    public boolean add2(int rol, int id_user);
    
    
    public boolean edit(int id );
    public boolean delete(int id );
    
}
