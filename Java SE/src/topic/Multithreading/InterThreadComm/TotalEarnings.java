package topic.Multithreading.InterThreadComm;

public class TotalEarnings extends Thread {
	public float total = 0;

	@Override
	public void run() {

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				total = total + 100;

			}

			this.notify();
		}
	}

}
