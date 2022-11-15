package dal;

import java.util.List;

import model.Appuntamento;

public interface AppuntamentiDAO {

	//le proprietà sono implicitamente public e final
	String TROVA_TUTTI = "SELECT * FROM appuntamenti";
	String TROVA_UNO = "SELECT * FROM appuntamenti WHERE id = ?";
	String ELIMINA_UNO = "DELETE FROM appuntamenti WHERE id = ?";
	String ADD_APPTO = "INSERT INTO appuntamenti (descrizione, ora) VALUES (?,?)";
	String UPD_APPTO = "UPDATE appuntamenti set descrizione=?, ora=?  WHERE id = ?";

	
	//CRUD su tabella appuntamenti
	//i metodi sono implicitamente public e abstract
	void addAppuntamento(Appuntamento a);
	void updateAppuntamento(Appuntamento a);
	void deleteAppuntamentoById(int id);
	
	Appuntamento getAppuntamentoById(int id);
	List<Appuntamento> getAppuntamenti();
	
	
}
