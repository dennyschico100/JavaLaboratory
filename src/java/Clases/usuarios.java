/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Controladores.usuarios_Controlador;
import Modelos.usuarios_;
import Controladores.usuarios_roles_Controlador;
import Modelos.usuario_roles;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Franciso
 */
@WebServlet(name = "usuarios", urlPatterns = {"/usuarios"})
public class usuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean res = false;
        usuarios_Controlador userControlador = new usuarios_Controlador();

        //CREANDO EL MODELO solo de usuairos
        
        res = userControlador.getEmail(email, password);

        //id_usuario
        int rol = 0;
        /*if (usuario.equals("juan")&& pass.equals("123") ) {
         HttpSession acceso = request.getSession(true);
         acceso.setAttribute("acceso", "utec");
         response.sendRedirect("menu.jsp");
                         
         }*/
        int id_usuario = 0;

        if (res) {
            //ESTE ES EL MODELO D ELOS USUARIOS
            usuarios_ users = null;
            List<usuarios_> list = userControlador.listar(email, password);
            Iterator<usuarios_> iter = list.iterator();

            //TENGO QUE INICIALIZAR EL MODEL OCN UN ITERATOR
            while (iter.hasNext()) {
                users = iter.next();

            }
                
            id_usuario = users.getId_usuario();

            //PREPRANDO LA OCNSULTA DEL IDROL
            usuarios_roles_Controlador u_roles = new usuarios_roles_Controlador();

            usuario_roles usuario_roles_Modelo = null;
            List<usuario_roles> list2 = u_roles.getOne(id_usuario);
            Iterator<usuario_roles> iter2 = list2.iterator();
            
            //TENGO QUE INICIALIZAR EL MODEL OCN UN ITERATOR
            while (iter2.hasNext()) {
                usuario_roles_Modelo = iter2.next();
                out.print("wn roles"+usuario_roles_Modelo.getId());
            }
            String co = users.getContraseña();
            out.print("id:" + co);
            
            ;

            //usuario_roles user_rolesModelo = new usuario_roles();
            int id_rol=0;
            id_rol=usuario_roles_Modelo.getId_rol();
            //id_rol = usuario_roles_Modelo.getId_rol();
            //out.print(usuario_roles_Modelo.getId_usuario());
            if (id_rol == 2) {
                HttpSession acceso = request.getSession(true);

                acceso.setAttribute("acceso", "admin");
                acceso.setAttribute("id", users.getId_usuario());
                acceso.setAttribute("nombre", users.getNombres());
                
                acceso.setAttribute("apellido", users.getGapellidos());
                acceso.setAttribute("email", users.getEmail());
                acceso.setAttribute("pass", users.getContraseña()) ;
                
                acceso.setAttribute("tel", users.getTelefono());
                
                
                
                
                
                
                //response.sendRedirect("menu.jsp");
                

               /* out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal ( 'BIENVENIDO' ,  'successfull !' ,  'success' );");
                out.println("});");
                out.println("</script>");*/
                String getOne = "vistas/admin/inicioAdmin.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(getOne);
                
                response.sendRedirect(getOne);
                 
                        
                rd.include(request, response);

                //out.print("es veerdadro");
            } else {
                HttpSession acceso = request.getSession(true);
                acceso.setAttribute("acceso", "user");
                //out.print("NO HAY USUARIO...." + id_usuario);
                String getOne = "vistas/MenuUser/inicio.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(getOne);
                acceso.setAttribute("acceso", "admin");
                acceso.setAttribute("id", users.getId_usuario());
                acceso.setAttribute("nombre", users.getNombres());
                
                acceso.setAttribute("apellido", users.getGapellidos());
                acceso.setAttribute("email", users.getEmail());
                acceso.setAttribute("pass", users.getContraseña()) ;
                
                acceso.setAttribute("tel", users.getTelefono());
                
                response.sendRedirect(getOne);
                rd.include(request, response);

                
            }

        } else {

            request.setAttribute("error", "login");

            String log = "http://localhost:22050/Aulas2/vistas/login/login.jsp?error=err";
            RequestDispatcher rd = request.getRequestDispatcher(log);
            //rd.include(request, response);

            response.sendRedirect(log);
            response.setHeader("error", "err");

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
