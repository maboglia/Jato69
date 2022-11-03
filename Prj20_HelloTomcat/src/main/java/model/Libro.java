package model;

public class Libro {

	private String titolo;

	public Libro(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + "]";
	}

	
	
	
}
