<%-- 
    Document   : inicio
    Created on : 07-nov-2019, 2:11:38
    Author     : Franciso
--%>

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

    </head>
    <body>
    <style typet="text/css" >
        
          
    </style>
    
        <jsp:include page="../nav2.html" />
        
          <%
        HttpSession acceso = request.getSession(true);
         if (session.getAttribute("acceso")!=null) {
                 if (!session.getAttribute("acceso").equals("user")) {
                         
                    }else if(!session.getAttribute("acceso").equals("admin")){
                         
                     }
                 
             }else{
                    response.sendRedirect("../login/login.jsp");

   //response.sendRedirect("");

         }
         
            String nombre= String.valueOf(acceso.getAttribute("nombre"));
            String apellido= String.valueOf(acceso.getAttribute("apellido"));
            String email= String.valueOf(acceso.getAttribute("email"));
            
            String pass= String.valueOf(acceso.getAttribute("pass"));
            String tel= String.valueOf(acceso.getAttribute("tel"));
            
          
          %>
     
        
	<div class="container my-5">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center" >Bienvenido! Usuario    <%=nombre%> </h1>
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
