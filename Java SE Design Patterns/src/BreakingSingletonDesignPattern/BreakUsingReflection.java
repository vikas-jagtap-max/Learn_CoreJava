package BreakingSingletonDesignPattern;

import java.lang.reflect.Constructor;

public class BreakUsingReflection {

	public static void main(String[] args) {

		SingletonClass o1 = SingletonClass.getInstance();
		SingletonClass o2 = null;

		try {
			Constructor<?> constructor = SingletonClass.class.getDeclaredConstructor();

			constructor.setAccessible(true);
			o2 = (SingletonClass) constructor.newInstance();
		} catch (Exception ex) {
			System.out.println(ex);

		}

		// To verify
		System.out.println("Hashcode of o1: " + o1.hashCode());
		System.out.println("Hashcode of o2: " + o2.hashCode());
	}

}
