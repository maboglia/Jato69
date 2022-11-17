
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="model.Appuntamento"%>
<%@page import="java.util.ArrayList"%>

<% 
	if (session.getAttribute("loggato")!=null && session.getAttribute("loggato").equals("okkkei")  ){
		out.println("sei loggato");
	} else {
		out.println("NON sei loggato");
	}

	ArrayList<Appuntamento> appuntamenti = 
	 (ArrayList<Appuntamento>) request.getAttribute("elencoAppuntamenti");
	
%>
<div class="col-6 center">
<table class="table table-striped">
<caption class="tableTitle" >Elenco degli Appuntamenti</caption>
 <thead>
  <tr>
    <th>Ora</th>
    <th>Descrizione </th>
  </tr>
  </thead>
	<tbody>
	<% 
		for (Appuntamento a:appuntamenti){%>
		<tr>
	    <td><%= a.getOra()  %></td>
	    <td><%= a.getDescrizione()  %></td>
		<% }
	%>
	</tbody>
</table>
</div>