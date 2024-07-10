package topic.Multithreading.ThreadCreation;

public class MyMain {

	public static void main(String[] args) {

		System.out.println("Main thread has started...");

		//Way1
		// As UserThreadUsingThreadClass class directly extends Thread class, so
		// instance of that class directly becomes thread hence no need to create object
		// of Thread class to create User Thread.
		UserThreadUsingThreadClass t1 = new UserThreadUsingThreadClass();
		UserThreadUsingThreadClass t2 = new UserThreadUsingThreadClass();

		System.out.println("Starting Thread t1");
		t1.start();

		System.out.println("Starting Thread t2");
		t2.start();

		
		
		//Way2
		// As UserThreadUsingRunnableClass class does not directly extends Thread class,
		// so instance of that class cannot directly becomes a thread hence need to create
		// object of Thread class to create User Thread.
		UserThreadUsingRunnableInterface ot = new UserThreadUsingRunnableInterface();

		Thread t11 = new Thread(ot); // ot is an instance of a class that implements the Runnable interface.
		Thread t21 = new Thread(ot);

		System.out.println("Starting Thread t11");
		t11.start();

		System.out.println("Starting Thread t21");
		t21.start();

		System.out.println("Main thread has ended...");
	}

}
