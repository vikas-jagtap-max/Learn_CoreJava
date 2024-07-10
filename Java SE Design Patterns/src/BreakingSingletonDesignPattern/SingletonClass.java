package BreakingSingletonDesignPattern;

public class SingletonClass {
	private static SingletonClass instance = null;

	private SingletonClass() {
		// Initialization code here
	}

	// Global access point to get the Singleton instance
	public static synchronized SingletonClass getInstance() {
		if (instance == null) {

			instance = new SingletonClass();
		}
		return instance;
	}

	//
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
