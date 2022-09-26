package libreria;

public class Libreria {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro();
		libro1.titolo = "Io, robot";
		
		Libro libro2 = new Libro();
		libro2.titolo = "Guerra e pace";
		
		System.out.println(libro1.titolo);
		System.out.println(libro2.titolo);
	}

}
