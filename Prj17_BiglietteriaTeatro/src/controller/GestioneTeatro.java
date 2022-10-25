package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import model.Posto;
import model.Replica;
import model.Spettacolo;
import model.Teatro;

public class GestioneTeatro {

	private static ArrayList<Teatro> teatri = new ArrayList<>();
	private static ArrayList<Spettacolo> spettacoli = new ArrayList<>();
	private static ArrayList<Replica> repliche = new ArrayList<>();
	
	public static void init() {
		
		Teatro t1 = new Teatro("smeraldo");
		Teatro t2 = new Teatro("rubino");
		
		t1.setPosti(creaPosti(3, 3, "platea"));
		t2.setPosti(creaPosti(4, 5, "galleria"));
		
		teatri.add(t1);
		teatri.add(t2);
		
			
		spettacoli.add(new Spettacolo("cats", "pippo", new String[]{"gino", "pino"}));
		spettacoli.add(new Spettacolo("Avatar", "spielberg", new String[]{"carlo", "mario"}));
		
		repliche.add(new Replica(spettacoli.get(0), LocalDate.of(2022, 10, 25), LocalTime.of(21, 0), t1));
		repliche.add(new Replica(spettacoli.get(0), LocalDate.of(2022, 10, 26), LocalTime.of(21, 0), t1));
		repliche.add(new Replica(spettacoli.get(0), LocalDate.of(2022, 10, 27), LocalTime.of(21, 0), t1));
		repliche.add(new Replica(spettacoli.get(0), LocalDate.of(2022, 10, 28), LocalTime.of(21, 0), t1));
		repliche.add(new Replica(spettacoli.get(1), LocalDate.of(2022, 10, 25), LocalTime.of(21, 0), t2));
		repliche.add(new Replica(spettacoli.get(1), LocalDate.of(2022, 10, 26), LocalTime.of(21, 0), t2));
		repliche.add(new Replica(spettacoli.get(1), LocalDate.of(2022, 10, 27), LocalTime.of(21, 0), t2));
	}
	
	private static ArrayList<Posto> creaPosti(int file, int posizioni, String tipo){
		ArrayList<Posto> temp = new ArrayList<>();
		
		for (int i = 1; i <= file; i++) {
			
			for (int j = 1; j <= posizioni; j++) {
				temp.add(  new Posto(i, j, tipo)  );
			}
			
		}
		
		return temp;
	}
	
	
	public static ArrayList<Teatro> elencoTeatri() {
		return teatri;
	}

	public static ArrayList<Spettacolo> elencoSpettacoli() {
		return spettacoli;
	}

	public static ArrayList<Replica> elencoRepliche() {
		return repliche;
	}

}
