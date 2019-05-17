<%
	session.invalidate();
	response.sendRedirect("/health");
%>