
package Clases;

import Controladores.usuarios_Controlador;
import Controladores.usuarios_roles_Controlador;
import Modelos.usuario_roles;
import Modelos.usuarios_;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Franciso
 */
@WebServlet(name = "agregarUser", urlPatterns = {"/agregarUser"})
public class agregarUser extends HttpServlet {

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
        
        
        int rol=Integer.parseInt(request.getParameter("eliminar"));
        
        usuarios_Controlador uControlador= new usuarios_Controlador();
        boolean res=false;
        res=uControlador.edit(rol);
        if(res){
            response.sendRedirect("vistas/admin/CrudUsers.jsp?eli=true");
            
        }else{
            
        }
        
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

        String getOne = "vistas/admin/CrudUsers.jsp?res=existe";
        String getOne2 = "../../vistas/reservaciones/index.jsp";

        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String email = request.getParameter("email");
        String contra = request.getParameter("contra");
        String telefono = request.getParameter("telefono");
        int estado = 1;
        usuarios_ usersModelo = new usuarios_();

        usuarios_Controlador uControlador = new usuarios_Controlador();
        //AHORA CON ROLES
        usuario_roles rolesModelo = new usuario_roles();
        usuarios_roles_Controlador urolesControlador = new usuarios_roles_Controlador();

        //
        usersModelo.setNombres(nombres);
        usersModelo.setGapellidos(apellidos);
        usersModelo.setEmail(email);
        usersModelo.setContraseña(contra);

        usersModelo.setTelefono(telefono);
        usersModelo.setEstado(estado);
        PrintWriter out = response.getWriter();
        
        boolean dato = false;
        try {
            dato = uControlador.add(usersModelo);

        } catch (Exception e) {
            System.out.println("errro agregar" + e);
        }
        if (dato) {
            List<usuarios_> list2 = uControlador.listar2(email);
            Iterator<usuarios_> iter2 = list2.iterator();
            //MODELO PARA EL ROLES
            int iduser = 0;
            usuarios_ usersModelo2 = new usuarios_();

            if (iter2.hasNext()) {

                usersModelo2 = iter2.next();

            }
            iduser = usersModelo2.getId_usuario();
            int rol = 1;
            boolean res = false;
            if (iduser != 0) {
                res = urolesControlador.add2(rol, iduser);
                if (res) {
                    System.out.println("ASIGNAMOS ROLES ");
                    out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                    out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                    out.println("<script>");
                    out.println("$(document).ready(function(){");
                    out.println("swal ( 'Usuario Guardado' ,  'Exito !' ,  'success' );");
                    out.println("});");
                    out.println("</script>");

                } else {
                    System.err.println("nooo pude siganr roles");
                }
            } else {

            }

            System.out.println("GUARDADAOS");

        } else {
            System.out.println("falso");

        }

        //RequestDispatcher rd = request.getRequestDispatcher(getOne);
        
        //rd.include(request, response);
        
        response.sendRedirect(getOne);
        
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
