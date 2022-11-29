package interfacce;

public class Libro implements Comparable<Libro>{

	int id;
	String titolo;
	double prezzo;
	int idEditore;

	public Libro(int id, String titolo) {
		super();
		this.id = id;
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", idEditore=" + idEditore + "]";
	}

	@Override
	public int compareTo(Libro unAltroLibro) {
		return this.id  - unAltroLibro.id;
	}
	
}
