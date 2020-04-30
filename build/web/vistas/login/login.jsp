
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" type="text/css" href="login.css">
    </head>
    <body>

        <%
           /* String e = request.getParameter("error");

            PrintWriter out2 = response.getWriter();

            if (e.equals("err")) {

                out2.println("<script src='Sweet_JS/sweetalert2.js'></script>");
                out2.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out2.println("<script>");
                out2.println("$(document).ready(function(){");
                out2.println("swal ( 'incorrect id or password !' ,  ' ' ,  'error' );");
                out2.println("});");
                out2.println("</script>");

            } else {

                out2.print("FALSOOOOOOOOOO");

            }
            out2.print("FOOOO");

            out2.println("<script src='Sweet_JS/sweetalert2.js'></script>");
            out2.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out2.println("<script>");
            out2.println("$(document).ready(function(){");
            out2.println("swal ( 'incorrect id or password !' ,  ' ' ,  'error' );");
            out2.println("});");
            out2.println("</script>");*/
        %>

        <h1 class="margin-arriba text-center">PARA ACCEDER PRIMERO INICIA SESION</h1>

        <div class="margin-arriba  wrapper fadeInDown">

            <div id="formContent">
                <!-- Tabs Titles -->

                <!-- Icon -->
                <div class="fadeIn first">

                </div>
                
                <style>
    .class2{
        height: 200px;
        width: 150px;
    }
</style>

                <!-- Login Form -->
                <form action="../../usuarios" method="post" >
                    <img class="class2 card-img-top" src="2.png">
                    <input type="text" id="login" class="fadeIn second" name="email" placeholder="Tu usuario">
                    <input type="password" id="password" class="pass fadeIn third" name="password" placeholder="Tu contraseña">
                    <input type="submit" class="fadeIn fourth" value="Log In">
                </form>

                <!-- Remind Passowrd -->


            </div>
        </div>

    </body>
</html>
