package topic.Multithreading.ThreadCreation;

//All Java programs have at least one thread, known as the main thread, which is created by the Java Virtual Machine (JVM) at the program’s start, when the main() method is invoked with the main thread. 
//When the JVM starts, it creates a thread called “Main”. Your program will run on this thread, unless you create additional threads yourself. The first thing the “Main” thread does is to look for your static void main (String args[]) method and invoke it. That is the entry-point to your program. If you create additional threads in the main method those threads would be the child threads of main thread.

public class ParentThreadOfAllThreads {

	public static void main(String[] args) {
		System.out.println("Welcome to Multithreading");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getThreadGroup());

		// Default priority of main method is 5
		System.out.println(Thread.currentThread().getPriority());

	}

}
