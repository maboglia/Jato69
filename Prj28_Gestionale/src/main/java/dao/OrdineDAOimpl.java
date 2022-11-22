package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Ordine;


public class OrdineDAOimpl implements OrdineDAO {
	
	Connessione c= new Connessione();
	
	Connection conn= c.getConn();
	
	PreparedStatement ps=null;
	@Override
	public void addOrdine(Ordine o) {
		try {
			ps=conn.prepareStatement(ADD_ORDINE);
			ps.setInt(1, o.getCliente_id());
			ps.setInt(2, o.getImpiegato_id());
			ps.setDate(3, (Date) o.getData());
			ps.setString(4, o.getStatoConsegna());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateOrdine(Ordine o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrdine(int id) {
		try {
			ps = conn.prepareStatement(ELIMINA_UNO_ORDINE);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Ordine getOrdine(int id) {
		try {
			ps = conn.prepareStatement(TROVA_UNO_ORDINE);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int cliente_id= rs.getInt("cliente_id");
				int impiegato_id= rs.getInt("impiegato_id");
				java.util.Date data= rs.getDate("data");
				String statoConsegna= rs.getString("consegna");
				Ordine dummy= new Ordine(cliente_id, impiegato_id, data, statoConsegna);
				return dummy;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	@Override
	public List<Ordine> getOrdini() {
		List<Ordine> ordini= new ArrayList<>();
		try {
			ps = conn.prepareStatement(TROVA_TUTTI_ORDINI);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				int cliente_id= rs.getInt("cliente_id");
				int impiegato_id= rs.getInt("impiegato_id");
				java.util.Date data= rs.getDate("data");
				String statoConsegna= rs.getString("consegna");
				Ordine dummy= new Ordine(id,cliente_id, impiegato_id, data, statoConsegna);
				//System.out.println(dummy);
				ordini.add(dummy);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ordini;
	}

}
