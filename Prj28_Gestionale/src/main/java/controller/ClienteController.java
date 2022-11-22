package controller;

import java.util.List;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteController {
	ClienteDAO dao = new ClienteDAO();
	
	public ClienteController() {
	}
	
	public void createClient(Cliente c) {
		if(dao.addCliente(c)) {
			System.out.println("cliente aggiunto con successo");
		}else
		System.out.println("ci sono stati problemi");
	}
	
	public void deleteClient(int id) {
		if(dao.deleteCliente(id)) {
			System.out.println("ammazzato con successo");
		}else
			System.out.println("non è morto nessuno");
	}
	
	public void updateCliente1(String value, int id) {
		if(dao.updateClienteEmail(value, id)) {
			System.out.println("update avvenuto con successo");
		}else
			System.out.println("ci sono stati errori");
	}
	
	public void updateCliente2(String value1, String value2, int id) {
		if(dao.updateClienteLive(value1,value2, id)) {
			System.out.println("update avvenuto con successo");
		}else
			System.out.println("ci sono stati errori");
	}
	
	public Cliente getClient(int id) {
		return dao.getCliente(id);
	}
	
	public List<Cliente> getClienti(){
		
		return dao.readCliente();
	}
}
