package dao;

import java.util.List;

import model.Articolo;

public interface ArticoloDAO {
	
	//Le proprieta' sono implicitamente public e final
	String TROVA_TUTTI="SELECT * from articolo";
	String TROVA_UNO="SELECT * from articolo where id = ?";
	String ELIMINA_UNO="DELETE from articolo where id = ?";
	String ADD_ARTICOLO="INSERT into articolo(descrizione, prezzo, categoria, rimanenza) values(?,?,?,?)";
	String UPD_ARTICOLO="UPDATE articolo set descrizione=?, prezzo=?, categoria=?, rimanenza=? where id = ?";
	
	//CRUD su appuntamenti
	
	void addArticolo(Articolo a);
	void updateArticolo(Articolo a);
	void deleteArticoloById(int id);
	
	Articolo getArticoloById(int id);
	List<Articolo> getArticoli();
}
