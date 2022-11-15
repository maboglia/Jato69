package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
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
		// TODO Auto-generated method stub

	}

	@Override
	public Appuntamento getAppuntamentoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appuntamento> getAppuntamenti() {
		// TODO Auto-generated method stub
		return null;
	}

}
