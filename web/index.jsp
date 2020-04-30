
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <style>
            body{
                background:linear-gradient(120deg,#8360c3,#2ebf91);

            }


        </style>
      
          <%
            HttpSession acceso = request.getSession(true);
            if (session.getAttribute("acceso") != null) {
                if (!session.getAttribute("acceso").equals("user")) {
                    response.sendRedirect("vistas/MenuUser/inicio.jsp");
                
                } else if (!session.getAttribute("acceso").equals("admin")) {

                }

            } else {
                //CUANDO ESTOYU DESDE ANTES DEPROCESA RESRVACIONE
                response.sendRedirect("vistas/login/login.jsp");
                

       //response.sendRedirect("");
            }       

        %>

        <jsp:include page="vistas/nav.html" />



        <div class="container">
            <div class="row ">
               s <div class="col-md-4">
                </div>
                
            </div>
        </div>                  
                <!--
                <button onclick="myFunction()">Try it</button>
                
                
                <p id="demo"></p>
                
                <script>
                function myFunction() {
                  var x = document.getElementById("myDate").value;
                  document.getElementById("demo").innerHTML = x;
                }
                </script>
                var date = new Date();
                switch(date.getDay()){
                    case 0: alert("sunday!"); break;
                    case 6: alert("saturday!"); break;
                    default: alert("any other week day");
                }
                -->
                </body>
                </html>
