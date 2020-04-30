<%-- 
    Document   : result
    Created on : 06-nov-2019, 21:51:49
    Author     : Franciso
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL forEach Example</h1>
 
    <b>Your Country Selected :-</b>
    <c:out value="${param.country}" />
 
    <br />
    <b>Your Language Preference is :-</b>
 
    <c:forEach var="value" items="${paramValues.language}">
        <c:out value="${value}" />
    </c:forEach>
    <br />
 
 
    <small><a href="index.jsp">Back to Home</a></small> 
    </body>
</html>
