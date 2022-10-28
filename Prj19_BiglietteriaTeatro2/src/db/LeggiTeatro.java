package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeggiTeatro {

	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection conn = c.getConn();
		
		String query = "select * from teatri";
		
		try {
			Statement contenitoreQuery = conn.createStatement();
			ResultSet rs = contenitoreQuery.executeQuery(query);
			while (rs.next()) {	// muove il cursore avanti di una posizione ed esce alla fine dei record
				String nomeTeatro = rs.getString("nome");
				System.out.println(nomeTeatro);
			}
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
		c.disconnetti();
		
	}
	
}
