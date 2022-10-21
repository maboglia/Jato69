package model;

public class BollettaLuce extends Bolletta {
	
	private double kWh;

	public BollettaLuce(double importo, double kWh) {
		super(importo);//costruisco generica bolletta
		this.kWh = kWh;
	}

	public double getkWh() {
		return kWh;
	}

	public void setkWh(double kWh) {
		this.kWh = kWh;
	}
	
	

}
