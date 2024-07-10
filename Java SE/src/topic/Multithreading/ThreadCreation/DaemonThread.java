package topic.Multithreading.ThreadCreation;

//As JVM does not care whether daemon thread is running or not. When all the user threads(non-daemon threads) finishes their execution, even if JVM finds running daemon thread it terminates the daemon thread and shutdown itself.
public class DaemonThread {

	public static void main(String[] args) {

		System.out.println("Main thread has started...");

		UserThreadUsingThreadClass t1 = new UserThreadUsingThreadClass();
		// setDaemon(true): It marks the thread as daemon thread from user thread.
		t1.setDaemon(true);
		// isDaemon(): It tests if the thread is a daemon thread.
		System.out.println(t1.isDaemon());

		System.out.println("Starting Daemon Thread t1");
		t1.start();

		// setDaemon(true) method can only be called before starting the thread. This
		// method would throw IllegalThreadStateException if you call this method after
		// thread has started
		// t1.setDaemon(true);

		System.out.println("Main thread has ended...");
	}

}
