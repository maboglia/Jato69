package ereditarieta;

public class BollettaGas extends Bolletta {
	
	double metriCubi;

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
