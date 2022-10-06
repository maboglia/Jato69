package giochi;

public class Dado {
	//stato interno
	private int facce;
	private int faccia;
	//------------------------------------------------------>
	
	public Dado() { //new Dado();
		facce=6;
		faccia=1;
		//System.out.println("ho costruito un dado standard");
	}
	public Dado(int facce) { //new Dado(8);
		this.facce=facce;
		faccia=1;
		//System.out.println("ho costruito un dado custom");
	}
	//metodi 
	
	public void  lancia() {
		
		int risultato = (int)(Math.random()*facce)+1;
		
		faccia = risultato;
		
	}
	
	public int getFaccia(){
		return faccia;
		
	}

}
