package test;

import java.time.LocalDateTime;

import controller.GestioneAppuntamenti;
import model.Appuntamento;
import model.Paziente;
import model.Stanza;

public class TestGestioneAppuntamenti {

	public static void main(String[] args) {
		//Costruzione di persona 
		Paziente p1 = new Paziente("giovanni", "verga", "gvnvrg123");
		Paziente p2 = new Paziente("marie", "curie", "marcur123");
		Paziente p3 = new Paziente("leonardo", "da vinci", "lnddvn456");
		Paziente p4 = new Paziente("giuseppe", "garibaldi", "giugar345");
		
		Paziente[] pazienti = {p1, p2, p3, p4};
		
		//Costruzione di stanza
		Stanza s1 = new Stanza("rossa");
		Stanza s2 = new Stanza("verde");
		Stanza s3 = new Stanza("blu");
		
		//Costruzione di appuntamento
		//Riferimento a persona e stanza
		Appuntamento a1 = new Appuntamento(p1, s1, LocalDateTime.of(2022,10, 16,12,0), "otturazione");
		Appuntamento a2 = new Appuntamento(p2, s2, LocalDateTime.of(2022,10, 16,13,0), "pulizia");
		Appuntamento a3 = new Appuntamento(p3, s3, LocalDateTime.of(2022,10, 16,11,0), "estrazione");
		Appuntamento a4 = new Appuntamento(p4, s2, LocalDateTime.of(2022,10, 16,14,0), "estrazione");
		Appuntamento a5 = new Appuntamento(p1, s3, LocalDateTime.of(2022,10, 17,10,0), "pulizia");
		Appuntamento a6 = new Appuntamento(p1, s2, LocalDateTime.of(2022,10, 18,11,0), "pagare fattura");
		
		GestioneAppuntamenti gestione = new GestioneAppuntamenti();
		gestione.addAppuntamento(a1);
		gestione.addAppuntamento(a2);
		gestione.addAppuntamento(a3);
		gestione.addAppuntamento(a4);
		gestione.addAppuntamento(a5);
		gestione.addAppuntamento(a6);
		
		listaCompleta(gestione);
		
		appuntamentiPerPaziente(p1, gestione);
		
		appuntamentiPerStanza(s2, gestione);
		
		trovaPazienteByCF(pazienti);
		
		
	}

	private static void trovaPazienteByCF(Paziente[] pazienti) {
		//Costruzione di appuntamenti a partire dal CF di una persona
		String codiceFiscale = "marcur123";
		
		for (Paziente paziente : pazienti) {
			if (paziente.getCodFiscale().equals(codiceFiscale)) {
				System.out.println("il paziente che cerchi è");
				System.out.println(paziente);
			} 
		}
	}

	private static void appuntamentiPerStanza(Stanza s2, GestioneAppuntamenti gestione) {
		System.out.println("Elenco appuntamenti per una stanza");
		//Elenco appuntamenti per una stanza
		for(Appuntamento a : gestione.getAppuntamentiByStanza(s2)) {
			System.out.println(a); 
		}
	}

	private static void appuntamentiPerPaziente(Paziente p1, GestioneAppuntamenti gestione) {
		System.out.println("Appuntamenti del paziente p1");
		//Elenco appuntamenti per una persona
		for(Appuntamento a : gestione.getAppuntamentiByPaziente(p1)) {
			System.out.println(a); 
		}
	}

	private static void listaCompleta(GestioneAppuntamenti gestione) {
		System.out.println("Lista completa appuntamenti");
		for (Appuntamento a :  gestione.getLista()) {
			System.out.println(a);
		}
	}

}
