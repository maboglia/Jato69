package interfacce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CastelloOrrori {

	public static void main(String[] args) {
		
		Mostruoso drakula = new Vampiro();
		Mostruoso tutankamen = new Mummia();
		Licantropo lupo = new Licantropo();
		Zombie creeper = new Zombie();
		
		
		List<Mostruoso> listaMostri = Arrays
				.asList(new Mostruoso[]{drakula, tutankamen, lupo, creeper});
		
		List<Mostruoso> mostruosi = new ArrayList<>(listaMostri);//JCF - Java Collection Framework
		List<CreaturaSpaventosa> creatureSpaventose = new Vector<>();
		List<Distruttivo> distruttivi = new ArrayList<>();

		mostruosi.add(drakula);
		mostruosi.add(creeper);
		
		creatureSpaventose.add(lupo);
		
	}

}
