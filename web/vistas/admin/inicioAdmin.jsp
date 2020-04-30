<%-- 
    Document   : inicioAdmin
    Created on : 07-nov-2019, 23:30:07
    Author     : Franciso
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>


        <title>Administrador</title>

    </head>
    <body>
        <jsp:include page="../nav3.html" />


        <%
            /*
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
             */
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

            //String name= String.valueOf(acceso.getAttribute("id"));
            
            String nombre= String.valueOf(acceso.getAttribute("nombre"));
            String apellido= String.valueOf(acceso.getAttribute("apellido"));
            String email= String.valueOf(acceso.getAttribute("email"));
            
            String pass= String.valueOf(acceso.getAttribute("pass"));
            String tel= String.valueOf(acceso.getAttribute("tel"));
            
            
        %> 
            
        <div class="container">
            <div class="row">
                <div class="col-md-12 my-5">
                    <h1  class="text-center" >BIENVENIDO ! <%=nombre%></h1>>
                
                </div>

            </div>

            <div class="row">
                <div class="col-md-12">
                    <h2>Informacion personal</h2>
                </div>
                <div class="col-md-8">

                </div>

            </div>
            <div class="row">
                <div class="col-md-12">
                    <table  class="table table-bordered">
                        <thead>
                            <tr>
                                <th  width="320px">Nombres</th>
                                <td  ><%=nombre%></td>
                            </tr>
                            
                            <tr>
                                <th>Apellidos</th>
                                <td><%=apellido%></td>
                            </tr>
                        
                        <tr>
                            <th>email</th>
                            <td><%=email%></td>
                        </tr>
                        <tr>
                            <th>Telefono</th>
                            <td><%=tel%></td>
                        </tr>
                        


                        </thead>
                        <tr>
                            <td><a class="text-white btn btn-success">Editar info</a></td>
                        </tr>

                    </table>

                </div>
            </div>
        </div>

    </body>
</html>
