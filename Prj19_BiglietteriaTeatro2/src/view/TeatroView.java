package view;

import java.util.ArrayList;

import controller.TeatroController;
import model.Teatro;

public class TeatroView {

	public static void main(String[] args) {
		
		TeatroController ctrl = new TeatroController();
		ctrl.addTeatro("Intervallo");
		ArrayList<Teatro> elencoTeatri = ctrl.elencoTeatri();
		
		for (Teatro teatro : elencoTeatri) {
			System.out.println(teatro);
		}
		
	}
	
}
