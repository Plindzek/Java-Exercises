package testThreads;

public class Klass implements Runnable {

	@Override
	public void run() {
System.out.println("run główne");
	}
	
	public static void main(String[] args) {

		Klass task = new Klass();
		Thread runner = new Thread(task);
		runner.start();
	
		
		Thread runner1 = new Thread(new Runnable() {
			public void run() {System.out.println("run anonimowe");
			}
		});

			runner1.start();
			
			System.out.println("pierwszy");


	
	}
}
