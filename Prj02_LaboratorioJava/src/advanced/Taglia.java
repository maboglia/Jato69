package advanced;

public enum Taglia {
	SMALL(42, "it"), MEDIUM(44, "it"), LARGE(46, "it");
	
	int misura;
	String lingua;
	
	private Taglia(int misura, String lingua) {
		this.misura = misura;
		this.lingua = lingua;
	}

	public int getMisura() {
		return misura;
	}

	
	
	
}
