package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Appuntamento;

public class AppuntamentiDAOImpl implements AppuntamentiDAO {

	Connessione c = new Connessione();
	
	Connection conn = c.getConn();
	
	PreparedStatement ps = null;
	
	@Override
	public void addAppuntamento(Appuntamento a) {
		try {
			ps = conn.prepareStatement(ADD_APPTO);
			
			ps.setString(1, a.getDescrizione());
			
			Time time = Time.valueOf( a.getOra() );
			
			ps.setTime(2, time);
			
			ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateAppuntamento(Appuntamento a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAppuntamentoById(int id) {
		
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
	public Appuntamento getAppuntamentoById(int id) {
		try {
			ps = conn.prepareStatement(TROVA_UNO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String descrizione = rs.getString("descrizione");
				LocalTime ora =  rs.getTime("ora").toLocalTime();
				Appuntamento temp = new Appuntamento(descrizione, ora);
				return temp;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Appuntamento> getAppuntamenti() {
		
		List<Appuntamento> appuntamenti = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(TROVA_TUTTI);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String descrizione = rs.getString("descrizione");
				LocalTime ora =  rs.getTime("ora").toLocalTime();
				Appuntamento temp = new Appuntamento(descrizione, ora);
				appuntamenti.add(temp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appuntamenti;
	}

}
