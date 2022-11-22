package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Connessione;
import model.Articolo;

public class ArticoloDAOImpl implements ArticoloDAO {

	Connessione c = new Connessione();
	Connection conn = c.getConn();
			PreparedStatement ps = null; 
	
	@Override
	public void addArticolo(Articolo a) {
		try {
			ps = conn.prepareStatement(ADD_ARTICOLO);
			
			ps.setString(1, a.getDescrizione());
			
			ps.setDouble(2, a.getPrezzo());
			
			ps.setString(3, a.getCategoria());
			
			ps.setInt(4, a.getRimanenza());
			
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updateArticolo(Articolo a) {
		try {
			ps = conn.prepareStatement(UPD_ARTICOLO);
			
			ps.setString(1, a.getDescrizione());
			
			ps.setDouble(2, a.getPrezzo());
			
			ps.setString(3, a.getCategoria());
			
			ps.setInt(4, a.getRimanenza());

			ps.setInt(5, a.getId());
			
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteArticoloById(int id) {
		
		try {
			ps = conn.prepareStatement(ELIMINA_UNO);
			ps.setInt(1, id);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Articolo getArticoloById(int id) {
		
		try {
		
			ps = conn.prepareStatement(TROVA_UNO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String descrizione = rs.getString("descrizione");
				double prezzo = rs.getDouble("prezzo");
				String categoria = rs.getString("categoria");
				int rimanenza = rs.getInt("rimanenza");
				Articolo temp = new Articolo(id, descrizione, prezzo, categoria, rimanenza);
				return temp;		
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Articolo> getArticoli() {

		List<Articolo> articoli =  new ArrayList<>();
		
		try {
			
			ps = conn.prepareStatement(TROVA_TUTTI);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id =rs.getInt("id");
				String descrizione = rs.getString("descrizione");
				double prezzo = rs.getDouble("prezzo");
				String categoria = rs.getString("categoria");
				int rimanenza = rs.getInt("rimanenza");
				Articolo temp = new Articolo(id, descrizione, prezzo, categoria, rimanenza);
				articoli.add(temp);		
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return articoli;
	}

	
	
}
