package ereditarieta;

public class Bolletta {

	double importo;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bolletta [importo=");
		builder.append(importo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
