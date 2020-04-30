<%-- 
    Document   : Consultar
    Created on : 07-nov-2019, 23:34:55
    Author     : Franciso
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelos.aulas"%>
<%@page import="java.util.List"%>
<%@page import="Controladores.aulas_Controlador"%>
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

        <title>JSP Page</title>

    </head>
    <body>
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
        <jsp:include page="../nav2.html" />

        <div class="container">
            <div class="row ">
                <div class="col-md-4">

                </div>
                <div class="col-md-4 text-center my-5" >
                    <h3>SELECCIONA UNA FECHA PARA CONSULTAR SI ESTA DISPONIBLE!</h3> 
                    <form method="GET" action="../../dia_hora" style="border: 1px solid blue;" class="card shadow-lg p-2 mb-5 bg-white rounded "    >

                        <div class="form-group">
                            <input onchange="abrir()" id="fe"  class="form-control" name="fecha" type="date"  value="2019-11-16">


                        </div>
                        <div id="div1" class="form-group">
                            <label for="inputPassword3"><strong>Aula a reservar  </strong></label>
                            <select name="aula" style="text-align-last: center;" class=" form-control text-center " >

                                <%                                                    aulas_Controlador aControlador = new aulas_Controlador();
                                    List<aulas> list = aControlador.listar();
                                    Iterator<aulas> iter = list.iterator();

                                    aulas aulaModelo = null;
                                    //diaModelo=(dia) dC.listar();
                                    while (iter.hasNext()) {
                                        aulaModelo = iter.next();

                                %>

                                <option name="aula"  value="<%=aulaModelo.getId_aula()%>"> <%=aulaModelo.getTipo() + "" + aulaModelo.getCapacidad()%>  Alumnos</option>
                                <%

                                    }%>

                            </select>                


                        </div>

                        <div class="form-group">

                            <input id="datos" onclick="abrir()"  class=" btn btn-success form-control" type="submit" vales="ENVIAR" >
                        </div>
                    </form>
                    <a  href="../reservaciones/index.jsp?fecha=2019-07-10" class="btn btn-primay" >ir</a>

                </div>
            </div>
        </div>
        <script type="text/javascript" >
                    var hoy = new Date();
                    function abrir(){
                    let x = document.getElementById("fe").value;
                            var hoy = new Date();
                            var fechaFormulario = new Date(x);
                            if (fechaFormulario == 0){
                    x.setCustomValidity(fechaFormulario + 'Domingos no disponibles, por favor seleccione otro día');
                    } else if (fechaFormulario == 6){
                    alert(fechaFormulario + 'Sabado no disponibles, por favor seleccione otro');
                    }

                    // Comparamos solo las fechas => no las horas!!
                    hoy.setHours(0, 0, 0, 0); // Lo iniciamos a 00:00 horas

                            if (hoy <= fechaFormulario) {

                    console.log("Fecha a partir de hoy");
                            let boton = document.getElementById("datos");
                            boton.disabled = false;
                    }
                    else {
                    console.log("Fecha pasado");
                            alert("Esa fecha ya ha pasado");
                            let boton = document.getElementById("datos");
                            boton.disabled = true;
                    }
                    fechaFormulario = new Date(x).getUTCDay(); ;
                            if (fechaFormulario == 0){
                    alert(fechaFormulario + 'DOmindo no disponibles, por favor seleccione otro');
                    } else if (fechaFormulario == 6){
                    alert(fechaFormulario + 'Sabado no disponibles, por favor seleccione otro');
                    }

                    }
        </script> 
    </body>
</html>
