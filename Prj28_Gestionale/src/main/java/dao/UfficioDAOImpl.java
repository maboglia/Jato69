package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Ufficio;

public class UfficioDAOImpl implements UfficioDAO {

	Connessione c = new Connessione();
	Connection conn = c.getConn();
	PreparedStatement ps = null;

	public void addUfficio(Ufficio a) {

		try {
			ps = conn.prepareStatement(AGGIUNGIUNO);

			ps.setString(1, a.getNome());
			ps.setString(2, a.getTelefono());
			ps.setString(3, a.getIndirizzo());
			ps.setString(4, a.getCitta());
			ps.setString(5, a.getRegione());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteUfficioById(int id) {

		try {
			ps = conn.prepareStatement(ELIMINAUNO);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Ufficio getUfficioById(int id) {

		try {
			ps = conn.prepareStatement(TROVAUNO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String nome = rs.getString("nome");
				String telefono = rs.getString("telefono");
				String indirizzo = rs.getString("indirizzo");
				String citta = rs.getString("citta");
				String regione = rs.getString("regione");
				Ufficio temp = new Ufficio(nome, telefono, indirizzo, citta, regione);
				return temp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	@Override
	public void updateUfficio(Ufficio a) {
		
		try {
			ps=conn.prepareStatement(AGGIORNA);
			ps.setString(1, a.getNome());
			ps.setString(2, a.getTelefono());
			ps.setString(3, a.getIndirizzo());
			ps.setString(4, a.getCitta());
			ps.setString(5, a.getRegione());
			ps.setInt(6, a.getId());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Ufficio> getUffici() {

		List<Ufficio> uffici = new ArrayList<>();

		try {
			ps = conn.prepareStatement(TROVATUTTI);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String nome = rs.getString("nome");
				String telefono = rs.getString("telefono");
				String indirizzo = rs.getString("indirizzo");
				String citta = rs.getString("citta");
				String regione = rs.getString("regione");
				Ufficio temp = new Ufficio(nome, telefono, indirizzo, citta, regione);
				uffici.add(temp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return uffici;

	}
}
