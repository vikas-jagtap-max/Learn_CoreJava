package topic.Multithreading.ThreadClass;

public class MethodsOfThreadClass {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();

		// setDaemon(): It marks the thread as daemon or user thread.
		t1.setDaemon(true);

		// isDaemon(): It tests if the thread is a daemon thread.
		System.out.println(t1.isDaemon());

		// No thread will be created and run() method will be executed just like a
		// normal method.
		t1.run();

		// A thread will be created which is responsible for the execution of run()
		// method.
		System.out.println("Starting Thread t1");
		t1.start();

		//
		// t1.start();

		//

		// Every thread in java has some priority from 1 to 10
		// Child thread inherit the priority of parent thread. As here main parent
		// thread has default priority as 5, hence,....
		System.out.println(t1.getPriority());

		// setPriority(): It changes the priority of the thread.
		t1.setPriority(7);
		System.out.println(t1.getPriority());

		// If you set the priority of thread above 10, it will throw an
		// IllegalArgumentException.
		// t1.setPriority(11);

		//
		HerThread thread1 = new HerThread();
		thread1.start();

		HisThread thread2 = new HisThread();
		thread2.start();

	}

}
