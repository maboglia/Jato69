package model;

public class Posto {

	private int fila;
	private int numero;
	private String tipo;

	public Posto(int fila, int numero, String tipo) {
		
		this.fila = fila;
		this.numero = numero;
		this.tipo = tipo;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Posto [fila=");
		builder.append(fila);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
	 
	
}
