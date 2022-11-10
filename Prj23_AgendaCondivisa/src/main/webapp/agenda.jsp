
<%@page import="model.Appuntamento"%>
<%@page import="java.util.ArrayList"%>
<h1>agenda</h1>

<%

	ArrayList<Appuntamento> appuntamenti = 
							(ArrayList<Appuntamento>) request.getAttribute("elencoAppuntamenti");

%>

<% for (Appuntamento a : appuntamenti ){ %>

	<p>  <%= a.getDescrizione() %>   </p>

<% } %>