<%@page import="model.Libro"%>
<%@page import="controller.LibroCtrl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/style.css" rel="stylesheet">
</head>
<body>

	<h1>Hello web</h1>

	<%
		
		LibroCtrl.libreria.add(new Libro("Zanna bianca"));
		LibroCtrl.libreria.add(new Libro("Io robot"));
		
		for (Libro l: LibroCtrl.libreria){
			out.print("<p>" + l + "</p>");
		}
		
	%>	

	<ul>
		<li>
			<a href="pagina2.jsp">Pagina 2</a>
		</li>
	</ul>	

<script type="text/javascript">
	console.log('funziona!!');

</script>	
</body>
</html>