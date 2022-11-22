package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Impiegato;

public class ImpiegatoDAOImpl implements ImpiegatoDAO {
	
	Connessione c = new Connessione();
	Connection conn = c.getConn();
	PreparedStatement ps = null;
	
	@Override
	public void addImpiegato(Impiegato i) {
		
		try {			
			ps = conn.prepareStatement(ADD_IMPTO);
			ps.setInt(1, i.getId());			
			ps.setString(2, i.getNome());			
			ps.setString(3, i.getCognome());			
			ps.setString(4, i.getRuolo());
			ps.setInt(5, i.getRif_to().getId());
			ps.setDouble(6, i.getStipendio());
			ps.setInt(7, i.getUfficio_id());
			ps.execute();	
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void deleteImpiegatoById(int id) {
		
		try {
			ps = conn.prepareStatement(ELIMINA_UNO);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public Impiegato getImpiegatoById(int trovaId) {
		
		try {
			ps = conn.prepareStatement(TROVA_UNO);
			ps.setInt(1, trovaId);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String ruolo = rs.getString("ruolo");
				int rif_to = rs.getInt("rif_to");
				double stipendio = rs.getDouble("stipendio");
				int ufficio_id = rs.getInt("ufficio_id");
				
				Impiegato temp;
				
				if (rif_to == 0) {
					temp = new Impiegato(id, nome, cognome, ruolo, null, stipendio, ufficio_id);
				} else {
					temp = new Impiegato(id, nome, cognome, ruolo, getImpiegatoById(rif_to), stipendio, ufficio_id);
				}
				
				return temp;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public void updateImpiegato(Impiegato i) {
		
		try {			
			ps = conn.prepareStatement(UPD_IMPTO);
			ps.setString(1, i.getNome());			
			ps.setString(2, i.getCognome());			
			ps.setString(3, i.getRuolo());
			ps.setInt(4, i.getRif_to().getId());
			ps.setDouble(5, i.getStipendio());
			ps.setInt(6, i.getUfficio_id());
			ps.setInt(7, i.getId());			
			ps.execute();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Impiegato> getImpiegati() {
		
		List<Impiegato> impiegati = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(TROVA_TUTTI);
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String ruolo = rs.getString("ruolo");
				int rif_to = rs.getInt("rif_to");
				double stipendio = rs.getDouble("stipendio");
				int ufficio_id = rs.getInt("ufficio_id");
				
				Impiegato temp;
				
				if (rif_to == 0) {
					temp = new Impiegato(id, nome, cognome, ruolo, null, stipendio, ufficio_id);
				} else {
					temp = new Impiegato(id, nome, cognome, ruolo, getImpiegatoById(rif_to), stipendio, ufficio_id);
				}
				
				impiegati.add(temp);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return impiegati;
		
	}

}
