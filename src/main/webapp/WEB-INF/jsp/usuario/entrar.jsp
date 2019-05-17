<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:template title="Cadastro de Usuario">
	
	<h1>Entrar</h1>
	${msg}
	<c:url value="/usuario/autenticar" var="action" />
	<form:form action="${action}" method="post" commandName="usuario">
		<div class="form-group">
			<form:label path="email">Email</form:label>
			<form:input path="email" required="required" cssClass="form-control"/>
			
			<form:label path="senha">Senha</form:label>
			<form:password path="senha" required="required" cssClass="form-control"/>
		</div>
		
		<input type="submit" value="Entrar" class="btn btn-primary">
	</form:form>

</tags:template>
