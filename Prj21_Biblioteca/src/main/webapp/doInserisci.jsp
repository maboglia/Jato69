<%@page import="dao.LibroDAO"%>
<%@page import="model.Libro"%>
<%

	String titolo = request.getParameter("titoloLibro");

	Libro l = new Libro(0,titolo);
	LibroDAO dao = new LibroDAO();
	dao.addLibro(l);


	//redirigo la chiamata a un'altra vista
	response.sendRedirect("inserisci.jsp?insert=success");
%>

<h1><%= titolo %></h1> 