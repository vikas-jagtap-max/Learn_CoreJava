package topic.Java8Features.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateFIExample {

	public static void main(String[] args) {

		// Predicate = It is functional interface introduced in java 8 version. Its has
		// only one abstract method which is test()
		Predicate<String> checkLength = t -> t.length() > 5;
		System.out.println(checkLength.test("Sameer"));
		System.out.println(checkLength.test("Jay"));
	}

}
