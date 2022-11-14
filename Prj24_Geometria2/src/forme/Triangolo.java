package forme;

public class Triangolo extends Figura {

	public Punto a,b,c;
	public Segmento ab, ac, bc;
	
	public Triangolo(Punto a, Punto b, Punto c) {//new Triangolo(x, y, z)
		
		this.nome = "Triangolo";
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		
	}
	
	public double getPerimetro() {
		return this.ab.lunghezza() +
				this.ac.lunghezza() +
				this.bc.lunghezza();
	}
	
	public double getArea() {
		
		double sp = getPerimetro() / 2;
		//Erone:  Math.sqrt(   sp  * ( sp - ab.lunghezza()  ) * ( sp - ac.lunghezza()  * ( sp - bc.lunghezza()  ) )                                )
		double area =  Math.sqrt( sp *
									( sp - ab.lunghezza() ) *
									( sp - ac.lunghezza() ) *
									( sp - bc.lunghezza() ) 
								);
		
		
		return area;
	}

	@Override
	public String toString() {
		return "Triangolo [ab=" + ab + ", ac=" + ac + ", bc=" + bc + ", getPerimetro()=" + getPerimetro()
				+ ", getArea()=" + getArea() + "]";
	}

	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
}
