package model;

public class BollettaGas extends Bolletta {
	
	private double metriCubi;

	public BollettaGas(double importo, double metriCubi) {
		super(importo);
		this.metriCubi = metriCubi;
		
	}
	
	public double getMetriCubi() {
		return metriCubi;
	}

	public void setMetriCubi(double metriCubi) {
		this.metriCubi = metriCubi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BollettaGas [metriCubi=");
		builder.append(metriCubi);
		builder.append(", importo=");
		builder.append(importo);
		//builder.append(", toString()=");
		//builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
