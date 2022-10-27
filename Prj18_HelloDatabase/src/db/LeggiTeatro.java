package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LeggiTeatro {
	
	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection riccardo = c.getConn();
		//CRUD su database(create, read, update, delete) update:operazioni di modifica della tabella
		//C,U,D queste operazioni ritornano un numero intero positivo
		String query = "select * from teatri";//C
		
		try {
			Statement contenitorePerLaQuery = riccardo.createStatement();
			ResultSet rs = contenitorePerLaQuery.executeQuery(query);
			while (rs.next()) {
				String nomeTeatro = rs.getString("nome");
				System.out.println(nomeTeatro);
			}
		} catch (SQLException e) {
			System.err.println("si e' verificato un errore " + e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		c.disconnetti();
		
	}
	

}
