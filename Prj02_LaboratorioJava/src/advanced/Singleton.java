package advanced;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		System.out.println("oggetto costruito");
	}

	public static Singleton getSingleton() {
		
		if (singleton == null)
			new Singleton();
		
		return singleton;
	}
	
	
	
	
}
