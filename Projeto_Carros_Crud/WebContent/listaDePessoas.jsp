<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="Model.PessoaBeans"%>
<%@page import="java.util.ArrayList"%>

<%
ArrayList<PessoaBeans> lista = (ArrayList<PessoaBeans>) request.getAttribute("pessoas");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Lista de Pessoas</title>
</head>
<body>
	<h1>Lista de Pessoas</h1>
	<a href="novoCarro.html">Adicionar Carro</a>
	<a href="novaPessoa.html">Adicionar Pessoa</a>

	<table>
		<thead>
			<tr>
				<th>Id Pessoa</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>Data de Nascimento</th>
				<th>Sexo</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getId()%></td>
				<td><%=lista.get(i).getNome()%></td>
				<td><%=lista.get(i).getCpf()%></td>
				<td><%=lista.get(i).getData()%></td>
				<td><%=lista.get(i).getSexo()%></td>

				<td><a href="selectPessoa?idPessoa=<%=lista.get(i).getId()%>">Editar</a>
					<a href="">Excluir</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>
