package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificaTeatro {

	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection conn = c.getConn();
		
		// CRUD su database (Create Read Update Delete)
		// C U D queste operazioni ritornano un numero intero positivo
		String query = "insert into teatri(nome) values ('Gioiello')";	// C
		// query = "update teatri set nome = 'Smeraldo' where id=1";	// U
		// query = "delete from teatri where id=1";						// D
		
		try {
			Statement contenitoreQuery = conn.createStatement();
			contenitoreQuery.execute(query);
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
		c.disconnetti();
		
	}
	
}
