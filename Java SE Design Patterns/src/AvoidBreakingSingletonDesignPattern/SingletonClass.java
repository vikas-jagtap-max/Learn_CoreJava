package AvoidBreakingSingletonDesignPattern;

public class SingletonClass {
	private static volatile SingletonClass instance = null;

	private SingletonClass() {

		// 2)To avoid breaking singleton class using Reflection
		if (instance != null) {
			// Throw runtime exception
			throw new RuntimeException();
		}
	}

	// Global access point to get the Singleton class's instance
	public static SingletonClass getInstance() {
		if (instance == null) {
			// 1)To make this thread safe, use double check locking as below and make
			// instance of singleton class as vlatile
			synchronized (SingletonClass.class) {
				if (instance == null) {
					System.out.println("Creating first instance of Singleton Class");
					instance = new SingletonClass();
				}

			}

		}

		return instance;
	}

	// 1)To avoid Breaking singleton class using Cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	// 3)To avoid breaking Breaking singleton class using Serialization
	protected Object readResolve() {
		return getInstance();
	}

}
