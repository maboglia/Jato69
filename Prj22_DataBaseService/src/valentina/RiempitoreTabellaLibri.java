package valentina;

import java.sql.Statement;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.Connessione;

public class RiempitoreTabellaLibri {

	public static void main(String[] args) {
		
		Connessione c = new Connessione();
		Connection conn = c.getConn();
		
		//svuotaBiblioteca(conn);
		
		File f = new File("files/Biblioteca.csv");
		
		
		
		String queryRiempimento = "insert into biblioteca (codice, titolo) values (?,?)";
		

		try {
			//leggo il file: lancia eccezione FileNotFoundException
			Scanner scanner = new Scanner(f);

			//scrivo sul database: lancia eccezione SQLException
			PreparedStatement ps = conn.prepareStatement(queryRiempimento);
			
			while(scanner.hasNextLine()) {
				
				String riga = scanner.nextLine();
				
				String[] splitRow = riga.split(",");
				
				String codice = splitRow[0];
				String titolo = splitRow[2];
				
				System.out.println(titolo);
				
				ps.setString(1, codice);
				ps.setString(2, titolo);
				ps.execute();
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}	
			
	
		
	}

	private static void svuotaBiblioteca(Connection conn) {
		String queryTruncate = "truncate table biblioteca";
		
		try {
			Statement portaIstruzioneSql = conn.createStatement();
			
			portaIstruzioneSql.execute(queryTruncate);
			
			System.out.println("fatto");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
