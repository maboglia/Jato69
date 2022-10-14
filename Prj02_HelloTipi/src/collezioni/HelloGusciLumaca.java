package collezioni;

import java.util.ArrayList;

public class HelloGusciLumaca {

	public static void main(String[] args) {
		
		ArrayList<GuscioLumaca> gusci = new ArrayList<GuscioLumaca>();
		
		gusci.add(new GuscioLumaca(0));
		gusci.add(new GuscioLumaca(1.0));
		gusci.add(new GuscioLumaca(0.5));
		gusci.add(new GuscioLumaca(0.6));
		gusci.add(new GuscioLumaca(1));
		gusci.add(new GuscioLumaca(1.5));
		gusci.add(new GuscioLumaca(0.4));
		

		double totale = 0;
		
		for (GuscioLumaca guscioLumaca : gusci) {
			totale += guscioLumaca.getViscido();
		}
		System.out.println("totale viscidità " + totale);
		
	}

}
