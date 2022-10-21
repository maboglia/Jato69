package model;

public class Bolletta {

	protected double importo;

	
	
	public Bolletta(double importo) {
		
		this.importo = importo;
	}

	//getters -setters

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bolletta [importo=");
		builder.append(importo);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
