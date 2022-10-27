package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificaTeatro {
	
	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection riccardo = c.getConn();
		//CRUD su database(create, read, update, delete) update:operazioni di modifica della tabella
		//C,U,D queste operazioni ritornano un numero intero positivo
		String query = "insert into teatri(nome) values('gioiello')";//C
		//query="update teatri set nome = 'smeraldo' where id=1";//U
		//query="delete from teatri where id=1";//D
		try {
			Statement contenitorePerLaQuery = riccardo.createStatement();
			contenitorePerLaQuery.execute(query);
		} catch (SQLException e) {
			System.err.println("si e' verificato un errore " + e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		c.disconnetti();
		
	}
	

}
