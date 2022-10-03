package programma;

public class GeneratoreOutfit {
	
	//1) procurarsi vestiti, questo metodo ci serve per procurare i vestiti
	
	
	
	
	//2) metodo genera outfit casuale
	public String genera(String oggetto) {
		
		DatabaseVestiti.init();
		
		int casuale = 1;
		String risposta = null;
		
		
		
		switch (oggetto) {
		case "borse":
			risposta = DatabaseVestiti.borse[(int)(Math.random()*5)].etichetta();
			break;
		case "cappelli":
			risposta = DatabaseVestiti.cappelli[(int)(Math.random()*5)].etichetta();
			break;
		case "scarpe":
			risposta = DatabaseVestiti.scarpe[(int)(Math.random()*5)].etichetta();
			break;
		case "pantaloni":
			risposta = DatabaseVestiti.pantaloni[(int)(Math.random()*5)].etichetta();
			break;
		case "maglie":
			risposta = DatabaseVestiti.maglie[(int)(Math.random()*5)].etichetta();
			break;

		default:
			risposta = "Scelta errata";
			break;
		}
		
		return risposta;
		
	}
	//3) ritornare outfit casuale
	
	public String outfit() {
		
		String borsa = genera("borse");
		String cappello = genera("cappelli");
		String scarpa = genera("scarpe");
		String pantalone = genera("pantaloni");
		String maglia = genera("maglie");
		
		return cappello + "\n" + maglia + "\n" + pantalone + "\n" + scarpa + "\n" + borsa;
		
	}
	

}
