package topic.Multithreading.DeadLock;

public class DeadLockExample {

	private static final Resource resource1 = new Resource("Resource1");

	private static final Resource resource2 = new Resource("Resource2");

	public static void main(String[] args) {
		//
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println(Thread.currentThread().getName() + "locked" + resource1.getName());

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						System.out.println(Thread.currentThread().getName() + "trying to lock" + resource2.getName());
					}
					synchronized (resource2) {
						System.out.println(Thread.currentThread().getName() + "locked" + resource2.getName());
					}
				}
			}

		}, "Thread-1");

		//
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName() + "locked" + resource2.getName());

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						System.out.println(Thread.currentThread().getName() + "trying to lock" + resource1.getName());
					}
					synchronized (resource1) {
						System.out.println(Thread.currentThread().getName() + "locked" + resource1.getName());
					}
				}
			}

		}, "Thread-2");

		thread1.start();
		thread2.start();

	}

}
