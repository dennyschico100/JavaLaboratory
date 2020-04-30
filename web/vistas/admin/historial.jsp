
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelos.usuario_roles"%>
<%@page import="java.util.List"%>
<%@page import="Modelos.reservaciones"%>
<%@page import="Controladores.reservaciones_Con"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Historial reservaciones</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

    </head>
    <body>
        <jsp:include page="../nav3.html" />

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
                                <th>Usuario</th>
                                <th>Aula</th>
                                <th>Fecha</th>
                                <th >Hora</th>
                                <th >Equipo</th>
                                <th width="270px">Accion</th>
                            </tr>
                        </thead>
<%
Connection cn;
ResultSet resultado;
Statement sentencia;
  reservaciones_Con reser= new reservaciones_Con();
  reservaciones reserDatos =null;
  
            List<reservaciones> list2 = reser.listar();
            Iterator<reservaciones> iter2 = list2.iterator();
            int contador=0;
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
            //Date fechaDate1 = formateador.parse("");
            //Date fechaDate2 = formateador.parse("");
   
            
            while(iter2.hasNext()){
            reserDatos=iter2.next();
            


%>                        
                        <tbody>
                            <tr><td><%=reserDatos.getId_usuario()%></td>
                            <td><%=reserDatos.getId_aula() %></td>
                            <td><%=reserDatos.getFecha()%></td>
                            <td><%=reserDatos.getHora()%></td>
                            <td><%=reserDatos.getEquipo() %></td>
                            <td><a href=""  class="btn btn-primary">Detalle</a>
                             <%if(contador<=4) {}else{%>       
                            <% continue; }%>
                                <a href=""  class="btn btn-danger">Cancelar</a>
                            
                            </td>
                            
                            
                            </tr>
                                

                        </tbody>
<%
     contador++;           }
%>
                    </table>


                </div>
            </div>
        </div>
    </body>
</html>
