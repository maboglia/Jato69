package versione1;

public class ContoCorrente {

	private int numeroConto;
	private String titolare;
	
	private double saldo;

	public ContoCorrente(int numeroConto, String titolare) {
		
		this.numeroConto = numeroConto;
		this.titolare = titolare;
		this.saldo = 0.0;
	}
	
	public void versamento(double amount) {
		System.out.println("hai versato " + amount);
		this.saldo += amount;
	}

	public double prelievo(double amount) {
		
		if (this.saldo >= amount) {
			this.saldo -= amount;
			System.out.println("hai prelevato " + amount);
			return amount;
		}
		
		System.out.println("disponibilità insufficiente!");
		return 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String stampa() {
		
		return "Il conto corrente nr." + numeroConto
				+ "\nappartiene a " + titolare
				+ "\nil saldo attuale è di euro " + saldo
				+"\n************************************";
		
	}
	
}
