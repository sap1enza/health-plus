<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:template title="Health+">

<br/>
<h3>Clinicas disponíveis</h3>
	${msg}
	<table class="table">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Especialidade</th>
			<th>Endereço</th>
			<th>CEP</th>
		</tr>
		<c:forEach items="${clinicas}" var="e">
			<tr>
				<td>${e.nome}</td>
				<td>${e.email}</td>
				<td>${e.telefone}</td>
				<td>${e.especialidade}</td>
				<td>${e.endereco}</td>
				<td>${e.cep}</td>
			</tr>
		</c:forEach>
	</table>
	
</tags:template>