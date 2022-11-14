package forme;

public class Punto {

	public int x , y;

	
	public Punto() {//new Punto()
		this.x = 0;
		this.y = 0;
	}


	public Punto(int x, int y) {//new Punto(3,2)
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Punto (" + x + ", " + y + ")";
	}
	
	
	
}
