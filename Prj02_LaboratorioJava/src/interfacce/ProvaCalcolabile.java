package interfacce;

public class ProvaCalcolabile {

	private static double calcolatrice(Calcolabile c, double a, double b) {
		return c.calcolo(a, b);
	}
	
	public static void main(String[] args) {
		double moltiplicazione = calcolatrice((a, b) -> a * b, 10, 15);
		double addizione = calcolatrice((a, b) -> a + b, 10, 15);
		double divisione = calcolatrice((a, b) -> a / b, 10, 15);
		double sottrazione = calcolatrice((a, b) -> a - b, 10, 15);
		
		
		System.out.println(moltiplicazione);
		System.out.println(addizione);

	}

}
