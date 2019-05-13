<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Paciente</title>
</head>
<body>
	<h1>Cadastro de Paciente</h1>
	${msg }
	<c:url value="/paciente/cadastrar" var="action" />
	<form:form action="${action }" method="post"
		commandName="paciente">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" />
		</div>
		<div class="form-group">
			<form:label path="email">Email</form:label>
			<form:input path="email" />
		</div>
		<div class="form-group">
			<form:label path="dataNasc">Data de Nascimento</form:label>
			<form:input path="dataNasc"/>
		</div>
		<div class="form-group">
			<form:label path="genero">Gênero</form:label>
			<form:input path="genero" />
		</div>
		<input type="submit" value="Salvar">
	</form:form>
</body>
</html>