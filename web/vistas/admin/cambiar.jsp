
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
         <jsp:include page="../nav3.html" />
         <div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<form class="my-5 p-4 card shadow-lg p-1 mb-5 bg-white rounded"  action="">
						<div class="form-group">
							<label for="">Contraseña actual</label>
							<input name="oldpass" type="password" class="form-control" >
						</div>
						<div class="form-group">
							<label for="">Nueva Contraseña </label>
							<input name="pass1" type="password" class="form-control" >
						</div>
						<div class="form-group">
							<label for="">Repita contraeñs</label>
							<input name="pass2" type="password" class="form-control" >
						</div>
						<input type="submit" class="btn btn-primary" name="">


					</form>
				</div>
			</div>
		</div>
    
    </body>
</html>
