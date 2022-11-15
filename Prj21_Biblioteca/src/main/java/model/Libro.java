package model;

public class Libro implements Comparable<Libro>{

	private int id;
	private String titolo;
	
	
	public Libro(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}

	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTitolo() {
		return titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + "]";
	}




	@Override
	public int compareTo(Libro altro) {
		// TODO Auto-generated method stub
//		return altro.titolo.compareTo(this.titolo);
		return altro.id - this.id;
	}
	
	
}
