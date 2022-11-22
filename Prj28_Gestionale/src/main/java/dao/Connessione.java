package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	// si inizializzazano url , user , password per accedere al database 
	private final String URL ="jdbc:mysql://localhost:3306/gestionale";
	private final String USER ="app_java";
	private final String PASS ="Java_2022!";
	
	// si inizializza una connection  
	private Connection conn= null;
	
	public Connection getConn(){
		
		if (conn== null) {
			connetti();
		}
		return conn;
	}
	
	private void connetti() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			// alla connection si possono passare i valori inizializzazione per accedere al database
			// apertura del servizio
			conn = DriverManager.getConnection(URL, USER, PASS);
			
			System.out.println("Connection on");
			
		} catch (SQLException e) {
			System.err.println("si è verificato un errore "+ e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
	
	public void disconnetti() {
		if (conn!= null) {
			try {
				// chiusura del servizio
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connection off");
		}else {
			System.out.println("Connection off");
		}
		
	}

	
}