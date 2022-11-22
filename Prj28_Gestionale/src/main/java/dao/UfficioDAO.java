package dao;

import java.util.List;

import model.Ufficio;

public interface UfficioDAO {
 
	//proprietà
 
	String TROVAUNO = "SELECT * FROM ufficio where id = ?";
	String TROVATUTTI = "SELECT * FROM ufficio";
	String ELIMINAUNO ="DELETE * FROM ufficio WHERE id = ?";
	String AGGIUNGIUNO =  "INSERT INTO ufficio (nome, telefono, indirizzo, citta, regione) VALUES (?,?,?,?,?);";
	String AGGIORNA = "UPDATE ufficio set nome=?, telefono=?, indirizzo=?, citta=?, regione=? WHERE id = ?";
 
 
	void addUfficio(Ufficio u);
	void updateUfficio(Ufficio u);
	void deleteUfficioById(int id);
	
	Ufficio getUfficioById(int id);
	List<Ufficio> getUffici();	
 
}