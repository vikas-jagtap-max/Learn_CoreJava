package topic.Multithreading.InterThreadComm;

public class MovieApplication {

	public static void main(String[] args) throws InterruptedException {

		TotalEarnings totalEarningsthread = new TotalEarnings();
		totalEarningsthread.start();

		// System.out.println("Total Earning is: " + totalEarningsthread.total);

		//
		synchronized (totalEarningsthread) {
			totalEarningsthread.wait();

			System.out.println("Toatl Earning is: " + totalEarningsthread.total);

		}
	}

}
