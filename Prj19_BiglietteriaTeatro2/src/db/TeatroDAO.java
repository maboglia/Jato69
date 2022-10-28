package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Teatro;

public class TeatroDAO {

	private Connessione c = new Connessione();
	private Connection conn = c.getConn();
	private Statement stat = null;
	private ResultSet rs = null;
	
	// 1. Create

	public void addTeatro(Teatro t) {
		
		String query = "insert into teatri(nome) values ('" + t.getNome() + "')";
		
		try {
			stat = conn.createStatement();
			stat.execute(query);
			System.out.println("Record aggiunto.");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
	}
	
	
	
	// 2. Read
	
	public ArrayList<Teatro> getTeatri() {
		
		String query = "select * from teatri";
		ArrayList<Teatro> temp = new ArrayList<>();
		
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(query);
			while (rs.next()) {	// muove il cursore avanti di una posizione ed esce alla fine dei record
				String nomeTeatro = rs.getString("nome");
				int idTeatro = rs.getInt("id");
				temp.add(new Teatro(nomeTeatro, idTeatro));
				System.out.println(nomeTeatro);
			}
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
		return temp;
		
	}
	
	// 3. Update
	
	public void updateTeatro(Teatro t) {
		
		String query = "update teatri set nome = '" + t.getNome() + "'"
				+ " where id = " + t.getId();
		
		try {
			stat = conn.createStatement();
			stat.execute(query);
			System.out.println("Record modificato.");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
	}
	
	// 4. Delete
	
	public void deleteTeatro(Teatro t) {
		
		String query = "delete from teatri where id = " + t.getId();
		
		try {
			stat = conn.createStatement();
			stat.execute(query);
			System.out.println("Record eliminato.");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore: " + e);
			// e.printStackTrace();
		}
		
	}
	
}
