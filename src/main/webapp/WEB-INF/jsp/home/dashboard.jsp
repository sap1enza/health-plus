<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String usuario = (String) session.getAttribute("usuario");
		if(usuario == null) {
			response.sendRedirect("/health");
		} else {
			out.print("Bem vindo, "+usuario+" <br/>");
		}
	%>
	
	<a href="deslogar">Sair</a>
	<h1>Listagem de algumas clinicas</h1>


</body>
</html>