<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template title="Lista Cl�nicas+">
	<h1>Lista de Cl�nicas+</h1>
	<table class="table">
		<tr>
			<th>Nome</th>
			<th>Especialidade</th>
			<th>Endere�o</th>
			<th>Telefone</th>
		</tr>
		
		<c:forEach items="${lista}">
			<tr>
				<td>${e.nome}</td>
				<td>${e.especialidade}</td>
				<td>${e.endereco}</td>
				<td>${e.telefone}</td>
			</tr>
		</c:forEach>
	</table>
</tags:template>