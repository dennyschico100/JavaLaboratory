
<%@page import="Modelos.equipo"%>
<%@page import="Controladores.equipo_Controlador"%>
<%@page import="Modelos.aulas"%>
<%@page import="Controladores.aulas_Controlador"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelos.dia"%>
<%@page import="Controladores.dia_Controlador"%>
<%@page import="Controladores.dia_hora_Controlador"%>
<%@page import="Modelos.dia_hora"%>


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
        <jsp:include page="../navReservaciones.html" />

        <style>
            body{
                background:linear-gradient(120deg,#8360c3,#2ebf91);

            }
            .mostrar{
                height: 0px;
                display: none;

            }


        </style>
        <%
        HttpSession acceso = request.getSession(true);
         if (session.getAttribute("acceso")!=null) {
                 if (!session.getAttribute("acceso").equals("user")) {
                         
                    }else if(!session.getAttribute("acceso").equals("admin")){
                         
                     }
                 
             }else{
             response.sendRedirect("../login/login.jsp");
         }
  
        
        %> 
       
        <div class="container" >
            <div class="row">
                <div class="col-md-12 text-center " >

                    <h2 class="text-white" >RESERVACIONES</h2>
                    <table border="2" class="text-center" align="center" >
                        <!-- <thead>
                             <tr>
                                 <th>ID</th>
                                 <th>FECHA</th>
                                 <th>ID HORA</th>
                             </tr>-->
                        </thead>
                        <%

                            dia_hora_Controlador diaHControlador = new dia_hora_Controlador();
                            String fecha = (String) request.getParameter("fecha");
                            int aula =Integer.parseInt(request.getParameter("aula"));
                            
                            if (request.getParameter("fecha").isEmpty()) {
                                response.sendRedirect("vistas/login/login.jsp");

                            }
                            dia_hora dh = new dia_hora();
                            dh = (dia_hora) diaHControlador.getOne(fecha,aula);
                            //CREANDO EL OTROOOOOOOOOOOOOOO
                            
                            
                            
                            
                            //List<dia_hora>list=diaHControlador.getOne(fecha)
                            //System.out.print(dh.getFecha().toString());
                            String mensaje = "";
                            int j = 0;
                            j = diaHControlador.espacio;
                            boolean validar = diaHControlador.EspacioHora;
                            if (validar) {
                                mensaje = "HAY ESPACIO PARA ESE DIA";
                                        
                            } else {
                                mensaje = "LOCIENTO NO  ESPACIO PARA ESE DIA";
                            }
                            

                        %>

                        <!-- <tbody>
                             <tr>
                                 <td>hola binevernido</td>   
                                 <td><%%></td>
                                 <td><%%></td>
 
                             </tr>
                         </tbody>-->
                    </table>

                    <h5 class="text-white text-center" ><%=mensaje%></h5>

                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                                      
                                        
                    <div class="row">
                        <div class="col-md-6 mx-auto">
                            <div class="card border-secondary">
                                <div class="card-header">
                                    <h5 class="mb-0 ">Bienvenido !</h5>
                                </div>
                                <div class="card-body">
                                    <form action="Server_Reser" method="post" class="form" role="form" autocomplete="off">
                                        <div class="form-group">
                                            <label for="inputName"> Fecha </label>
                                            <input name="hoy" id="fe"  value="<%=fecha%>" type="Date" class="form-control"  placeholder="full name">
                                        </div>

                                        <div class="form-group">
                                            <label for="inputEmail3">Selecciona la hora</label>
                                            <select name="hora" class="form-control" >

                                                <%
                                                int uno=0;
                                                        int dos=0;
                                                         String mostrar=null; 
                                                         String mostrar2=null;
                                                         int id=0;
                                                    if (validar) {

                                                        dia_Controlador dC = new dia_Controlador();
                                                        List<dia> list = dC.listar(fecha);
                                                        Iterator<dia> iter = list.iterator();
                                                        
                                                        dia_hora_Controlador dControlador = new dia_hora_Controlador();
                                                        List<dia_hora> list2 = dControlador.listar2(fecha);
                                                        //dControlador.getOne(fecha);
                                                                
                                                        Iterator<dia_hora> iter2 = list2.iterator();
                                                        dia_hora dia_hora_Modelo=null;
                                                                
                                                        int contadors2=0;
                                                        dia diaModelo = null;
                                                        //diaModelo=(dia) dC.listar();
                                                        int c=dia_Controlador.valor1;   
                                                        int k=dia_Controlador.valor2;
                                                        while (iter.hasNext()) {
                                                             diaModelo=iter.next();
                                                                   
                                                               //dia_hora_Modelo=iter2.next();
                                                          
                                                             
                                                           
                                                                

                                                %>

                                                <option value="<%=diaModelo.getId_dia() %>"> <%=diaModelo.getFecha_entrada()+"-"+diaModelo.getFecha_salida() %>  </option>
                                                <% 
                                                                  }
                                                    } else {
                                                        PrintWriter out2Writer = response.getWriter();

                                                        out2Writer.print("<input class='mostrar' id='campo' type=''text values='texto' >");
                                                    }%>

                                            </select>                

                                        </div>
                                        <div id="div1" class="form-group">
                                            <label for="inputPassword3">Aula a reservar  </label>
                                            <select name="aula" style="text-align-last: center;" class=" form-control text-center " >

                                                <%
                                                    int m=aula;
                                                    if (validar) {

                                                        aulas_Controlador aControlador = new aulas_Controlador();
                                                        List<aulas> list = aControlador.getOne(m);
                                                        Iterator<aulas> iter = list.iterator();

                                                        aulas aulaModelo = null;
                                                        //diaModelo=(dia) dC.listar();
                                                        while (iter.hasNext()) {
                                                            aulaModelo = iter.next();

                                                %>

                                                <option  value="<%=aulaModelo.getId_aula()%>"> <%=aulaModelo.getTipo() + "\tPara\t" + aulaModelo.getCapacidad() + " estudiantes"%>  </option>
                                                <% }
                                                    } else {
                                                        PrintWriter out2Writer = response.getWriter();

                                                    }%>

                                            </select>                


                                        </div>
                                                    
                                                <%
                                                    if (validar) {

                                                        equipo_Controlador eControlador= new equipo_Controlador();
                                                                
                                                        List<equipo> list = eControlador.listar();
                                                        Iterator<equipo> iter = list.iterator();

                                                        aulas aulaModelo = null;
                                                        equipo equipoModelo=null;
                                                        //diaModelo=(dia) dC.listar();
                                                        while (iter.hasNext()) {
                                                            equipoModelo = iter.next();
                                                            
                                                    %>
                                       
                                            <label class = "checkbox-inline">
                                                <input name="equipo" type = "checkbox" value = "<%=equipoModelo.getDescripcion()
                                                            %>"><%=equipoModelo.getTipo()%>
                                            
                                            </label>
                                                   <% }
                                                    } else {
                                                        PrintWriter out2Writer = response.getWriter();

                                                    }%>
                                                    
                                                    
                                           
                                        
                                                    
                                        <div id="div3" class="form-group">
                                            <button  id="guardar" type="submit" class="btn btn-success btn-lg ">Hacer Reservacoin</button>
                                        </div>
                                        <div  id="back" >

                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--/row-->

                </div>
                <!--/col-->
            </div>
            <!--/row-->
        </div>


        <script type="text/javascript" >

                    var hoy = new Date();
                    function abrir(){
                    let x = document.getElementById("fe").value;
                            var hoy = new Date();
                            var fechaFormulario = new Date(x);
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
                            let boton = document.getElementById("guardar");
                            boton.disabled = true;
                    }

                    }
        </script>  


        <script type="text/javascript">
            $(document).ready(function () {
            let boton = document.getElementById("campo");
            let guardar=document.getElementById('guardar');
                    boton.style.display = "none";
                    let div1 = document.getElementById("div1");
                    let div2 = document.getElementById("div2");
                    let div3 = document.getElementById("div3");
                    boton.setAttribute('value', 'texto');
                    
                    let txt = boton.value;
                    alert(boton.value);
                    if (txt = "texto"){
                    
                    
                    document.getElementById("back").innerHTML = "<a href='../../index.jsp' class='text-white btn btn-warning' >Volver</a>";
                    boton.style.display = "none";
                    guardar.style.display = "none";
                   
                    div1.style.display = "none";
                    div2.style.display = "none";
                    div3.style.display = "none";
                    
            //guardar.setAttribute('value', 'texto');
                    
        }else{
                
            }


            $("#consulta").on("click", function () {

            var consulta1 = $("#consulta1").val(); //id of country select box of index.jsp page;
                    $.ajax({
                    url: "", //your servlet or jsp page name.
                            method: "GET", //HTTP method.
                            data: {consulta1: consulta1}, //sending request to DisplayText.java page.
                            success: function (data)
                            {
                            //$("#success").html(data);//output or response will display in success div.
                            //$("#form").trigger("reset");//this will reset the form.
                            }
                    });
                    // check if country select box have blank or null value.

            });
            });
        </script>

    </body>
</html>
