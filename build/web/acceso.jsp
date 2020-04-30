<%-- 
    Document   : acceso
    Created on : 08-nov-2019, 4:34:07
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
        HttpSession acceso = request.getSession(true);
         if (session.getAttribute("acceso")!=null) {
                 if (!session.getAttribute("acceso").equals("user")) {
                         
                    }else if(!session.getAttribute("acceso").equals("admin")){
                         
                     }
                 
             }else{
             response.sendRedirect("vistas/login/login.jsp");
         }
  
        
        %>
    </body>
</html>
