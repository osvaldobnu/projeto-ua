<%@page import="model.Conta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="service.ContaService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Contas a Pagar</h1>
	
	<%
		ContaService contaService = new ContaService();
				List<Conta> listaContas = contaService.getContas();
		%>
	
	<table>
		<thead>
			<tr>
				<th> Descrição </th>
				<th> Data Recebida </th>
				<th> Data Vencimento </th>
				<th> Data Pagamento </th>
				<th> Ações </th>
			</tr>
			<tbody>
			<%
			for(Conta c : listaContas){
			%>
				<tr>
					<td> <%= c.getDescricao() %></td>
					<td> <%= c.getDataRecebida()  %></td>
					<td> <%= c.getDataVencimento()  %></td>
					<td> <%= c.getDataPagamento() %></td>
					<td>
						<button class="btn-baixar">Baixar</button>
					</td>
				</tr>
			<% } %>
			</tbody>
		</thead>
	</table>
</body>
</html>