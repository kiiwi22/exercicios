<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="Model.CarroBeans"%>
<%@page import="java.util.ArrayList"%>

<%
ArrayList<CarroBeans> lista = (ArrayList<CarroBeans>) request.getAttribute("carros");
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
	<a href="novaPessoa.html">Adicionar Pessoa</a>
	<a href="listaPessoas">Listar Pessoas</a>

	<table>
		<thead>
			<tr>
				<th>Id Carro</th>
				<th>Nome do Proprietário</th>
				<th>Placa</th>
				<th>Renavam</th>
				<th>Marca</th>
				<th>Modelo</th>
				<th>Ano</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getId()%></td>
				<td><%=lista.get(i).getPessoa().getNome()%></td>
				<td><%=lista.get(i).getPlaca()%></td>
				<td><%=lista.get(i).getRenavam()%></td>
				<td><%=lista.get(i).getModelo().getMarca().getDescricao()%></td>
				<td><%=lista.get(i).getModelo().getDescricao()%></td>
				<td><%=lista.get(i).getAno()%></td>

				<td><a href="select?idcarro=<%=lista.get(i).getId()%>">Editar</a>
					<a href="deleteCarro?idcarro=<%=lista.get(i).getId()%>">Excluir</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>
