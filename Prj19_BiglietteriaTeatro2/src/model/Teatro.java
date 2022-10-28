package model;
 
import java.util.ArrayList;
 
public class Teatro {
		
	private String nome;
	private ArrayList<Posto>posti;
	private int id; 
	
	public Teatro(String nome, ArrayList<Posto> posti) {
		super();
		this.nome = nome;
		this.posti = posti;
	}
	
	public Teatro(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
		this.posti = new ArrayList<Posto>();
	}
	 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Posto> getPosti() {
		return posti;
	}
	
	public void setPosti(ArrayList<Posto> posti) {
		this.posti = posti;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teatro [Nome: ");
		builder.append(nome);
		builder.append(", numero di posti: ");
		builder.append(posti.size());
		builder.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
  
}