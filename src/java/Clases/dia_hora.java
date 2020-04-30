
package Clases;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
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


public class dia_hora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String getOne="vistas/reservaciones/index.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso="";
        //String accion=request.getParameter("fecha");
        
       /* if(accion.equalsIgnoreCase("2019-05-05")){
                String f = request.getParameter("fecha");
            PrintWriter writer = response.getWriter();
         
        // build HTML code
         response.setContentType("text/html");

            String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: "+f;      
        
        htmlRespone += "</html>";
         
        
        writer.println(htmlRespone);
            
        }else{
                String f = request.getParameter("fecha");
            PrintWriter writer = response.getWriter();
         
        // build HTML code
         response.setContentType("text/html");

            String htmlRespone = "<html>";
        htmlRespone += "<h2> NO ES ACCION me is: "+f;      
        
        htmlRespone += "</html>";
         
        
        writer.println(htmlRespone);
        }
        */
        
		PrintWriter out = response.getWriter();
out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
			out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal ( 'Fecha disponible' ,  'successfull !' ,  'success' );");
			out.println("});");
			out.println("</script>");
			
                        
        acceso=getOne;
            //acceso+="?fecha="+accion;
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        //vista.include(request, response);
        //response.sendRedirect(acceso);
                
                
    }

    @Override
    public String getServletInfo() {
        return "Short description";
        
                
    }// </editor-fold>

}
