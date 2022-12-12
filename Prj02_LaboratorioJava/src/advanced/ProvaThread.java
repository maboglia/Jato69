package advanced;

public class ProvaThread {

	public static void main(String[] args) {
		
		Thread t = new MioThread();
		
		t.start();
		
		int iterazioni = 5;
		
		for (int i = 0; i < iterazioni; i++) {
			try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("sono il main thread " + i);
		}
		
		

	}

}
