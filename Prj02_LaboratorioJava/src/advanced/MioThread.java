package advanced;

public class MioThread extends Thread{

	@Override
	public void run() {
		
		int iterazioni = 5;
		
		for (int i = 0; i < iterazioni; i++) {
			System.out.println("sono il thread mioThread " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
