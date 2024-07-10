package topic.Multithreading.ThreadGroup;

public class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {

			System.out.println(Thread.currentThread().getId() + " : " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

}
