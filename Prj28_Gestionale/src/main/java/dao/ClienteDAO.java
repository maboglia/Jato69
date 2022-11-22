package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO implements ClienteInterface {

	Connessione c = new Connessione();
	Connection conn = c.getConn();
	PreparedStatement ps;

	public ClienteDAO() {

	}

	@Override
	public boolean addCliente(Cliente c) {
		try {
			ps = conn.prepareStatement(ADD_CLIENTE);
			ps.setString(1, c.getNome());
			ps.setString(2, c.getCognome());
			ps.setString(3, c.getEmail());
			ps.setString(4, c.getTelefono());
			ps.setString(5, c.getIndirizzo());
			ps.setString(6, c.getCittà());
			ps.setString(7, c.getProvincia());
			ps.setString(8, c.getRegione());
			ps.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean deleteCliente(int id) {
		try {
			ps = conn.prepareStatement(DELETE_CLIENTE);
			ps.setInt(1, id);
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public  boolean updateClienteEmail( String value, int id) {
		try {
			ps = conn.prepareStatement(UPDATE_CLIENTE_EMAIL);
			ps.setString(1, value);
			ps.setInt(2, id);
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public  boolean updateClienteLive(String value1,String value2, int id) {
		try {
			ps = conn.prepareStatement(UPDATE_CLIENTE_LIVE);
			ps.setString(1, value1);
			ps.setString(2, value2);
			ps.setInt(3, id);
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Cliente getCliente(int id) {
		try {

			ps = conn.prepareStatement(GET_CLIENTE_BYID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				String telefono = rs.getString("telefono");
				String indirizzo = rs.getString("indirizzo");
				String citta = rs.getString("citta");
				String regione = rs.getString("regione");
				String provincia = rs.getString("provincia");
				int credito = rs.getInt("credito");

				return new Cliente(nome, cognome, telefono, email, indirizzo, citta, provincia, regione, credito);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> readCliente() {
		List<Cliente> clienti = new ArrayList<Cliente>();

		try {

			ps = conn.prepareStatement(READ_CLIENTE);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				String telefono = rs.getString("telefono");
				String indirizzo = rs.getString("indirizzo");
				String citta = rs.getString("citta");
				String regione = rs.getString("regione");
				String provincia = rs.getString("provincia");
				int credito = rs.getInt("credito");
				clienti.add(new Cliente(nome, cognome, telefono, email, indirizzo, citta, provincia, regione, credito));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clienti;

	}

}
