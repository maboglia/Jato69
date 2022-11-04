package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Libro;

public class LibroDAO {

	private Connessione connessione = new Connessione();
	private Connection conn;
	
	private Statement statement;
	private ResultSet rs;
	
	public void addLibro(Libro l) {
		String titolo = l.getTitolo();
		String query = "insert into libri (titolo) values ('" + titolo + "')";
		System.out.println(query);
		try {
			this.conn = connessione.getConn();
			this.statement = this.conn.createStatement();
			this.statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
