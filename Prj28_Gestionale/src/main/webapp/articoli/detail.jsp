<%@page import="model.Articolo"%>
<h1>Dettaglio</h1>

<% Articolo a = (Articolo) request.getAttribute("dettaglio");  %>

<div id="dettaglio">

    <h2><%= a.getDescrizione() %></h2>
    <p>Cat.: <%= a.getCategoria() %></p>
    <p>&euro;: <%= a.getPrezzo() %></p>
    <p>Rim.: <%= a.getRimanenza() %></p>
    
</div>