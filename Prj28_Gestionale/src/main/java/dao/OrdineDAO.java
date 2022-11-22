package dao;

import java.util.List;

import model.Ordine;


public interface OrdineDAO {
	/**
	 * Serve a trovare tutti gli ordini. 
	 */
	String TROVA_TUTTI_ORDINI="select * from ordine";
	/**
	 * Serve a trovare un ordine tramite 
	 * un id int.
	 */
	String TROVA_UNO_ORDINE="select * from ordine where id = ?";
	/**
	 * Serve ad eliminare un ordine tramite 
	 * un id int.
	 */
	String ELIMINA_UNO_ORDINE="delete from ordine where id = ?";
	/**
	 * Serve ad aggiungere un ordine tramite 
	 * parametri necessari:
	 * cliente_id, impiegato_id, data, statoConsegna.
	 */
	String ADD_ORDINE="insert into ordine (cliente_id, impiegato_id, data, consegna) values(?,?,?,?)";
	/**
	 * Serve a modificare un ordine tramite 
	 * parametri necessari:
	 * cliente_id, impiegato_id, data, statoConsegna + utente.id da modificare.
	 */
	String UPDATE_ORDINE="update ordine set cliente_id= ?, impiegato_id =? , data=? , consegna=? where id= ?";

	//crud su tabella appuntamenti
			/**
			 * serve ad inizializzare un nuovo utente nel database
			 * @param o (cliente_id, impiegato_id, data, statoConsegna)OBBLIGATORI
			 */
			void addOrdine(Ordine o);
			/**
			 * serve ad aggiornare un ordine già esistente nel database tramite id
			 * @param o (cliente_id, impiegato_id, data, statoConsegna) non obbligatori;
			 * ID OBBLIGATORIO
			 */
			void updateOrdine(Ordine o);
			/**
			 *serve ad eliminare un ordine già esistente nel database tramite id
			 * @param id  OBBLIGATORIO
			 */
			void deleteOrdine(int id);
			/**
			 *serve ad ottenere un ordine già esistente nel database tramite id
			 * @param id  OBBLIGATORIO
			 */
			Ordine getOrdine(int id);
			/**
			 *serve ad ottenere una lista di ordini presenti nel database
			 */
			List<Ordine> getOrdini();
}
