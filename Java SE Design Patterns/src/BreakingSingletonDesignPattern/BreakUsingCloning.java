package BreakingSingletonDesignPattern;

public class BreakUsingCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonClass o1 = SingletonClass.getInstance();
		SingletonClass o2 = (SingletonClass) o1.clone();

		// To verify
		System.out.println("Hashcode of o1: " + o1.hashCode());
		System.out.println("Hashcode of o2: " + o2.hashCode());
	}

}
