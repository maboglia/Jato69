package dao;

import java.util.List;

import model.Impiegato;

public interface ImpiegatoDAO {

	String TROVA_TUTTI = "SELECT * FROM impiegato";
	String TROVA_UNO = "SELECT * FROM impiegato WHERE id = ?";
	String ELIMINA_UNO = "DELETE FROM impiegato WHERE id = ?";
	String ADD_IMPTO = "INSERT INTO impiegato (id, nome, cognome, ruolo, rif_to, stipendio, ufficio_id) VALUES (?,?,?,?,?,?,?)";
	String UPD_IMPTO = "UPDATE impiegato set nome = ?, cognome = ?, ruolo = ?, rif_to = ?, stipendio = ?, ufficio_id = ? WHERE id = ?";

	void addImpiegato(Impiegato i);
	void updateImpiegato(Impiegato i);
	void deleteImpiegatoById(int id);
	Impiegato getImpiegatoById(int id);
	List<Impiegato> getImpiegati();
	
}