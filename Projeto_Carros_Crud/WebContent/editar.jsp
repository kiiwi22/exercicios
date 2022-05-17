<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Agenda de Contatos</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Carro</h1>
	<form action="update" method="post">
		<table>
		<tr>
			<td><input type="text" name="idCarro" readonly value="<% out.print(request.getAttribute("idCarro"));%>"> Id Carro</td>
		</tr>
		<tr>
			<td><input type="text" name="chassi" value="<% out.print(request.getAttribute("chassi"));%>"> Chassi</td>
		</tr>
			
		<tr>
			<td><input type="text" name="ano" value="<% out.print(request.getAttribute("ano"));%>"> Ano</td>
		</tr>
		
		<tr>
			<td><input type="text" name="placa" value="<% out.print(request.getAttribute("placa"));%>"> Placa</td>
		</tr>
		
		<tr>
			<td><input type="text" name="renavam" value="<% out.print(request.getAttribute("renavam"));%>">Renavam</td>
		</tr>
		
		<tr>
			<td><input type="text" name="marca" readonly value="<% out.print(request.getAttribute("marca"));%>">Marca</td>
		</tr>
		
		<tr>
			<td><input type="text" name="modelo" readonly value="<% out.print(request.getAttribute("modelo"));%>">Modelo</td>
		</tr>
		</table>
		
		<input type="submit" value="Salvar">
	
	</form>

</body>
</html>