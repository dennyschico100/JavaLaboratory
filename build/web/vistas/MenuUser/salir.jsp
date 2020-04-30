<%-- 
    Document   : salir
    Created on : 08-nov-2019, 16:39:07
    Author     : Franciso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HttpSession macceSession = request.getSession();
        macceSession.removeAttribute("acceso");
        response.sendRedirect("inicio.jsp");
        out.print("<h2>SESION ABANDONADA</h2>");
        %>
        
    </body>
</html>
