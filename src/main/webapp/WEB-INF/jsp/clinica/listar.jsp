<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:template title="Lista de Estacionamento">

	<h1>Clinicas cadastradas</h1>
	${msg}
	<table class="table">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Especialidade</th>
			<th>Endereço</th>
			<th>CEP</th>
			<th></th>
		</tr>
		<c:forEach items="${clinicas}" var="e">
			<tr>
				<td>${e.nome}</td>
				<td>${e.email}</td>
				<td>${e.telefone}</td>
				<td>${e.especialidade}</td>
				<td>${e.endereco}</td>
				<td>${e.cep}</td>
				<td>
					<c:url value="/clinica/editar/${e.id}" var="link"/>
					<a href="${link}" class="btn btn-primary btn-sm">Editar</a>
					<button type="button" onclick="codigo.value = ${e.id}" class="btn btn-danger btn-sm" data-toggle="modal" data-target="#excluirModal">
	 					Excluir
					</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- Modal -->
	<div class="modal fade" id="excluirModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	        Realmente deseja excluir a clínica?
	      </div>
	      <div class="modal-footer">
	      	<c:url value="/clinica/excluir" var="action"/>
	      	<form action="${action}" method="post">
	      		<input type="hidden" name="id" id="codigo">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
		        <button type="submit" class="btn btn-danger">Excluir</button>
	        </form>
	      </div>
	    </div>
	  </div>
	</div>
	<!--  Modal -->

</tags:template>

