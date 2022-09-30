package versione1;

public class BloccoNote {
	
	Nota[] elenco = new Nota[10];
	
	public void addNota(String descrizione, int posizione) {
		
		Nota n = new Nota();//creo un oggetto di tipo nota
		n.descrizione = descrizione;//assegno alla proprietà descrizione il valore di tipo string passato in argomento
		elenco[posizione] = n;//aggiungo la nota creata all'elenco in posizione
	}
	
	public void stampa() {
		for (int i = 0; i < elenco.length; i++) {
			if(elenco[i] != null) {
				System.out.println(elenco[i].stampa());
			}
		}
	}

}
