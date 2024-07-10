package topic.Multithreading.ThreadClass;

//Can we Overload run() method
public class HisThread extends Thread {

	public void run(int j) {

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
