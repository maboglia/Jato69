package dao;

import java.util.List;

import model.Cliente;

public interface ClienteInterface {
	
	String ADD_CLIENTE="insert into cliente(nome,cognome,email,telefono,indirizzo,citta,regione,provincia) "
			+ "values(?,?,?,?,?,?,?,?)";
	
	String DELETE_CLIENTE="delete from cliente where id = ?";
	
	String UPDATE_CLIENTE_EMAIL="update cliente set email = ? where id = ?";
	
	String UPDATE_CLIENTE_LIVE="update cliente set indirizzo = ?, provincia= ? where id = ?";
	
	String GET_CLIENTE_BYID="select * from cliente where id = ?";
	
	String READ_CLIENTE="select * from cliente";
	
	boolean addCliente(Cliente c);
	
	boolean deleteCliente(int id);
	
	boolean updateClienteEmail(String value,int id);
	
	boolean updateClienteLive(String value1,String value2,int id);
	
	Cliente getCliente(int id);
	
	List<Cliente> readCliente();
	
	
}
