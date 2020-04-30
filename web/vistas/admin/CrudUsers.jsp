

<%@page import="java.io.PrintWriter"%>
<%@page import="Controladores.usuarios_roles_Controlador"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Controladores.usuarios_Controlador"%>
<%@page import="Modelos.usuarios_"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

    </head>

    <body>
        <jsp:include page="../nav3.html" />

        <%
        try{

            PrintWriter out2 = response.getWriter();
            
                    String v="";
                    if (request.getParameter("res").isEmpty()) {
                        System.out.println("esta vaciooooooooo");
                    } else {
                        out2.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                        out2.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                        out2.println("<script>");
                        out2.println("$(document).ready(function(){");
                        out2.println("swal ( 'Usuario Guardado' ,  'Exito !' ,  'success' );");
                        out2.println("});");
                        out2.println("</script>");
                    }

	}catch(Exception e){
                        System.out.print("errro de tipo"+e);
}
        
        %>
        <%
        
            HttpSession acceso = request.getSession(true);
            if (session.getAttribute("acceso") != null) {
                if (!session.getAttribute("acceso").equals("user")) {

                } else if (!session.getAttribute("acceso").equals("admin")) {
                   
                }

            } else {
                response.sendRedirect("../login/login.jsp");

                //response.sendRedirect("");
            }


        %> 
        
        <div class="container">
            <div class="row">
                <div class="col-md-12 my-5">
                    <h1 class="text-center" >Historial de Reservaciones</h1>
                    <table class="table table-bordered">
                        <thead>

                            <tr>
                                <th>Nombre</th>
                                <th>Apellidos</th>
                                <th>Email</th>
                                <th >Contraeña</th>
                                <th >Telefono</th>
                                <th width="270px">Accion</th>
                            </tr>
                        </thead>
                        <%    Connection cn;
                            ResultSet resultado;
                            Statement sentencia;
                            usuarios_roles_Controlador uControlador = new usuarios_roles_Controlador();

                            usuarios_ users = null;

                            List<usuarios_> list2 = uControlador.listar();
                            Iterator<usuarios_> iter2 = list2.iterator();
                            int contador = 0;

                            PrintWriter writer = response.getWriter();

                            while (iter2.hasNext()) {
                                users = iter2.next();


                        %>
                        <tbody>
                            <tr>
                                <td><%=users.getNombres()%></td>
                                <td><%=users.getGapellidos()%></td>
                                <td><%=users.getEmail()%></td>
                                <td><%=users.getContraseña()%></td>
                                <td><%=users.getTelefono()%></td>
                                <td><form action="../../agregarUser" method="get" > 
                                        <input  name="eliminar" type="hidden" value="<%=users.getId_usuario()%>" >
                                        <input  value="Eliminar" type="submit" class="text-white btn btn-danger" >
                                </form></td>
                                
                            </tr>
                            <%  }%>
                        </tbody>



                    </table>


                </div>
            </div>
        </div>

    </body>
</html>
