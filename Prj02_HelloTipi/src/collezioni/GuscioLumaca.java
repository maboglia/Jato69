package collezioni;

public class GuscioLumaca {

	private double viscido;

	public GuscioLumaca(double viscido) {
		this.viscido = viscido;
	}

	public double getViscido() {
		return viscido;
	}

	public void setViscido(double viscido) {
		this.viscido = viscido;
	}

	@Override
	public String toString() {
		return "GuscioLumaca [viscido=" + viscido + "]";
	}

	
	
	
}
