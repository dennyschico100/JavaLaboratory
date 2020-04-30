/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Controladores.dia_hora_Controlador;
import Controladores.reservaciones_Con;
import Modelos.reservaciones;
import Modelos.dia_hora;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Server_Reser", urlPatterns = {"/Server_Reser"})
public class Server_Reser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
        reservaciones reser = new reservaciones();
        boolean valor;
        int id_usuario = 1;
        int id_aula = 0;
        int id_hora;
        String fecha;
        String hora = "";
        String equipo;
        int estado = 1;
        id_aula = Integer.parseInt(request.getParameter("aula"));
        id_hora = Integer.parseInt(request.getParameter("hora"));
        
        switch (id_hora) {
            case 1:
                hora = "6:00 am - 8:00 am";
                break;
            case 2:
                hora = "8:00 am - 10:00 am";
                break;
            case 3:
                hora = "10:00 am - 12:00 pm";
                break;
            case 4:
                hora = "1:00 pm - 3:00 pm";
                break;
            case 5:
                hora = "3:00 pm - 5:00 pm";
                break;

            default:

                break;
        }
        
        fecha = request.getParameter("hoy");
        equipo = request.getParameter("equipo");
        reservaciones_Con rCon = new reservaciones_Con();
       
        reser.setId_usuario(id_usuario);
        reser.setId_aula(id_aula);
        reser.setId_hora(id_hora);
        reser.setFecha(fecha);
        reser.setHora(hora);
        reser.setEquipo(equipo);
        reser.setEstado(estado);
        valor = rCon.add(reser);
         //GUARDANCO UN VALIDACOIN DE HOTAS 
        //CONTROLADORE  YLUEG OMDELO
        dia_hora_Controlador dControlador= new dia_hora_Controlador();
        dia_hora dhModelo = new dia_hora();
        dhModelo.setFecha(fecha);
        dhModelo.setId_hora(id_hora);
        dControlador.add(dhModelo);
        
        PrintWriter out = response.getWriter();
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
        out.println("<script>");
        out.println("$(document).ready(function(){");
        out.println("swal ( 'Reservacion Guardadada' ,  'successfull !' ,  'success' );");
        out.println("});");
        out.println("</script>");
        

        if (valor) {
            out.print("SOY VERDADERO"+reser.getId_usuario()+"  "+reser.getId_aula()+" "+reser.getId_hora()+" "+reser.getFecha()+" "+reser.getHora()+" "+reser.getEquipo()+" "+reser.getEstado());

        } else {
            out.print(reser.getId_aula());

        }
        String getOne = "vistas/MenuUser/inicio.jsp";
        
        RequestDispatcher rd = request.getRequestDispatcher(getOne);
        rd.include(request, response);

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
