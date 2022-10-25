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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BollettaLuce [kWh=");
		builder.append(kWh);
		builder.append(", importo=");
		builder.append(this.importo);
		builder.append("\n");
//		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
