<%@page import="model.Articolo"%>
<% Articolo a = (Articolo) request.getAttribute("dettaglio");  %>


<form action="articoli" class="center col-6"  method="post">

<!-- 

    private String descrizione;
	private double prezzo;
	private String categoria;
	private int rimanenza;


 -->
 <input type="hidden" name="id" value="<%= a.getId() %>">
 
<div class="form-group">
    <label for="descrizione" >descrizione</label>
    <input value="<%= a.getDescrizione() %>" class="form-control" type="text" name="descrizione" id="descrizione" placeholder="descrizione">
</div>

<div class="form-group">
    <label for="prezzo" >prezzo</label>
    <input value="<%= a.getPrezzo() %>" class="form-control" type="decimal(6,2)" name="prezzo" id="prezzo" placeholder="prezzo">
</div>

<div class="form-group">
    <label for="categoria" >categoria</label>
    <input value="<%= a.getCategoria() %>" class="form-control" type="text" name="categoria" id="categoria" placeholder="categoria">
</div>

<div class="form-group">
    <label for="rimanenza" >rimanenza</label>
    <input value="<%= a.getRimanenza() %>" class="form-control" type="number" name="rimanenza" id="rimanenza" placeholder="rimanenza">
</div>


<input type="submit" class="btn btn-primary mt-3" value="Update">

</form>