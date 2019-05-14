<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template title="Cadastro Paciente+">
	<h1>Cadastro de Paciente</h1>
	${msg}
	<c:url value="/paciente/cadastro" var="action" />
	<form:form action="${action}" method="post" commandName="paciente">
		<div class="form-group">
			<form:label path="name">Nome</form:label>
			<form:input path="name" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="email">Email</form:label>
			<form:input path="email" cssClass="form-control"  />
		</div>
		<div class="form-group">
			<form:label path="password">Senha</form:label>
			<form:password path="password" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="gender">Gênero</form:label>
			<form:input path="gender" cssClass="form-control" />
		</div>
		<input type="submit" value="Salvar" class="btn btn-primary">
	</form:form>
</tags:template>