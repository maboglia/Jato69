package palcoscenico;


import strumenti.*;

public class OrchestraDemo {

	public static void main(String[] args) {
		
		Flauto f1 = new Flauto();
		Flauto f2 = new Flauto();
		
		Violino v1 = new Violino();
		
		Violoncello v2 = new Violoncello();
		
		System.out.println(f1.suona(3));
		System.out.println(v1.suona());
		System.out.println(f2.suona());
		System.out.println(v1.suona());
		System.out.println(v2.suona());
		System.out.println(v1.suona());
		System.out.println(v2.suona());
		System.out.println(v1.suona());
		System.out.println(v2.suona());
		

	}

}
