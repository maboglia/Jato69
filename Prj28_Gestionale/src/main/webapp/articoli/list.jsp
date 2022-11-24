<%@page import="model.Articolo"%>
<%@page import="java.util.List"%>
<h1>Elenco</h1>

<% List<Articolo> elenco = (List<Articolo>) request.getAttribute("elenco"); %>

<table>
  <tr>
    <th>Descrizione</th>
    <th>Prezzo</th>
  </tr>

<% for (Articolo a : elenco){ %>  
  
  <tr>
    <td><%= a.getDescrizione() %></td>
	<td><%= a.getPrezzo() %></td>    

  </tr>
  
<% } %>  
</table>
