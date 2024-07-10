package topic.Multithreading.ThreadGroup;

import java.util.concurrent.ExecutorService; //
import java.util.concurrent.Executors;

public class MyMain {

	public static void main(String[] args) {

		MyThread threadObj = new MyThread();

		Thread t1 = new Thread(threadObj);
		Thread t2 = new Thread(threadObj);
		Thread t3 = new Thread(threadObj);

		System.out.println("Starting Thread t1");
		t1.start();

		System.out.println("Starting Thread t2");
		t2.start();

		System.out.println("Starting Thread t3");
		t3.start();

		// Thread Group:

		

	}

}
