<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:template title="Cadastro de Clínica">
	
	<h1>Cadastro de Clínica</h1>
	${msg}

	<c:url value="/clinica/cadastrar" var="action" />
	<form:form action="${action}" method="post" commandName="clinica">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" required="required" cssClass="form-control"/>
			
			<form:label path="email">Email</form:label>
			<form:input path="email" required="required" cssClass="form-control"/>
			
			<form:label path="telefone">Telefone</form:label>
			<form:input path="telefone" cssClass="form-control"/>
			
			<form:label path="especialidade">Especialidade</form:label>
			<form:input path="especialidade" required="required" cssClass="form-control"/>
			
			<form:label path="endereco">Endereço</form:label>
			<form:input path="endereco" cssClass="form-control"/>
			
			<form:label path="cep">CEP</form:label>
			<form:input path="cep" required="required" cssClass="form-control"/>

		</div>
		
		<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form:form>

</tags:template>
