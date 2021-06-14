<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
</head>
<body class="p-3 mb-2 bg-info text-dark">
	<!--  <div class="container" style="max-width: 500px">
		<h1>Registrar Rol</h1>
		<hr />
		<div class="form-group">
			<input type="text" class="form-control" name="nomrol" id="nomrol" />
			<input type="hidden" name="id" id="id" value="0"/>
		</div>
		<div class="form-group">
			<button class="btn btn-primary" onclick="add()">Enviar</button>
		</div>
	</div>
	<div class="container" id="resultado" style="max-width: 500px"></div> -->
	
	<header class="conteiner">Pagina de registro</header>
	<div class="container-sm $ cian-600">
 <div class="mb-3 ">
  <label for="formGroupExampleInput" class="form-label">NOMBRE</label>
  <input type="text" class="form-control" id="nombre" placeholder="NOMBRES">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">APELLIDO PATERNO</label>
  <input type="text" class="form-control" id="ap" placeholder="APELLIDO PATERNO">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">APELLIDO MATERNO</label>
  <input type="text" class="form-control" id="am" placeholder="APELLIDO MATERNO">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">CODIGO DE ALUMNO</label>
  <input type="text" class="form-control" id="codigo" placeholder="CODIGO DE ALUMNO">
</div>
<div class="form-group">
			<button class="btn btn-primary" onclick="registrar()">CREAR</button>
		</div>
		<div class="container max p-3 mb-2 bg-warning text-dark">
            <h1>REGISTRO DE PERSONAS</h1>
            <table id="table" class="table">
                <thead>
                    <tr>
            			<th>#</th>
                        <th>CODIGO</th>
                        <th>NOMBRES</th>
                        <th>APELLIDO PATERNO</th>
                        <th>APELLIDO MATERNO</th>
                        
                    </tr>
                </thead>
                <tbody id="tbd"></tbody>
            </table>
        </div>
 </div>
 
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script src="recursos/js/script.js"></script>
</body>
</html>