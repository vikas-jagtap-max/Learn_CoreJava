package topic.Java8Features.FunctionalInterface;

import java.util.function.Function;

public class FunctionFIExample {

	public static void main(String[] args) {

		// Function< , > =
		Function<Integer, Integer> fun = t -> t * t;
		System.out.println(fun.apply(4));

	}

}
