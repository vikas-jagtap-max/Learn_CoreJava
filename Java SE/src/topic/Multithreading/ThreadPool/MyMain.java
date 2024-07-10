package topic.Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyMain {

	public static void main(String[] args) {
		// Thread Pool:
		ExecutorService executor = Executors.newFixedThreadPool(3); // This will create 3 threads when you execute the
																	// program.
	}

}
