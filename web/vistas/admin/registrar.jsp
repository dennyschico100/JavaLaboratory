
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

    </head>
    <body>
        <jsp:include page="../nav3.html" />
        
                <%
        PrintWriter out2 = response.getWriter();
            
        HttpSession acceso = request.getSession(true);
         if (session.getAttribute("acceso")!=null) {
                 if (!session.getAttribute("acceso").equals("user")) {
                         
                    }else if(!session.getAttribute("acceso").equals("admin")){
                         
                         String p=session.getAttribute("pass").toString();
                         out2.print(p);
                         
                     }
                 
             }else{
                    response.sendRedirect("../login/login.jsp");

   //response.sendRedirect("");

         }
  
        
        %> 
        
    <div class="container ">
    <div class="row mb-5 ">
        <div class="col-md-12">
            <h2 class="text-center mb-5">Completa todos los campos</h2>
            <div class="row">
                <div class="col-md-6 mx-auto">
                    <div class="card border-secondary">
                        <div class="card-header">
                            <h3 class="mb-0">Agregar usuario</h3>
                        </div>
                        <div class="card-body">
                            <form method="post"  action="../../agregarUser"  class="form"  role="form" autocomplete="off">
                                <div class="form-group">
                                    <label for="inputName">Nombres</label>
                                    <input name="nombres" type="text" class="form-control" id="inputName" placeholder="Tu nombre">
                                </div>
                                   <div class="form-group">
                                    <label for="inputName">Apellidos</label>
                                    <input name="apellidos" type="text" class="form-control" id="inputName" placeholder="Tu apelloo">
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3">Email</label>
                                    <input name="email" type="email" class="form-control" id="inputEmail3" placeholder="perez@gmail.com" >
                                </div>
                                <div class="form-group">
                                    <label >  Password</label>
                                    <input class="form-control"  name="contra" type="password" >
                                </div>
                                
                                <div class="form-group">
                                    <label for="inputVerify3">Telefono</label>
                                    <input name="telefono" min="1"  type="number" class="form-control" id="inputVerify3" placeholder="" required="">
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-lg float-left">Registrar</button>
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
    </body>
</html>
