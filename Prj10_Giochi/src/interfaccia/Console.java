package interfaccia;

import giochi.Dice;
import giochi.RightDecision;

public class Console {

	public static void main(String[] args) {
		boolean gira = true;
		while(gira) {
			System.out.println(Domande.MENU);
			String risposta = MioScanner.leggiStringa(Domande.SCEGLI_GIOCO);
			
			switch (risposta) {
			case "1":
				System.out.println(RightDecision.play());
				break;
			case "2":
				System.out.println("Non ancora disponibile");
				break;
			case "3":
				System.out.println(Dice.play());
				break;
			case "0":
				System.out.println("Game Over");
				gira = false;
				break;
			default:
				System.out.println("Opzione non disponibile");
				break;
			}
		}
			System.out.println("Arrivederci");
			
		//fare scegliere un gioco 
		//sceltagiusta,farlo o non farlo
		//rock,scissors,paper
		//dice,n volte dadi uguali
		//oppure esci dal gioco

	}

}
