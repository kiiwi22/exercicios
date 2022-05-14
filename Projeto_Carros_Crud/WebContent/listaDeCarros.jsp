<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="Model.CarroBeans"%>
<%@page import="java.util.ArrayList"%>

<%
	ArrayList<CarroBeans> lista = (ArrayList<CarroBeans>)request.getAttribute("carros");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista de Carros</title>
</head>
<body>
	<h1>Lista de Carros</h1>
	<a href="novoCarro.html">Adicionar Carro</a>

	<table>
		<thead>
			<tr>
				<th>Nome do Proprietário</th>
				<th>Placa</th>
				<th>Renavam</th>
				<th>Marca</th>
				<th>Modelo</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i=0;i<lista.size();i++) {%>
			<tr>
				
				<td><%=lista.get(i).getPessoa().getNome()  %></td>
				<td><%=lista.get(i).getPlaca()%></td>
				<td><%=lista.get(i).getRenavam()%></td>
				<td><%=lista.get(i).getModelo().getMarca().getDescricao()%></td>
				<td><%=lista.get(i).getModelo().getDescricao()%></td>
				
				<td><a href="select?idcon=<%=lista.get(i).getId()%>"
					class="Botao1">Editar</a> <a href="">Excluir</a></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>
