package topic.Java8Features.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerFIExample {

	public static void main(String[] args) {

		//
		Consumer<String> consume = t -> System.out.println("consuming data but doesn't return anything");

		//
		consume.accept("Vikas");
	}

}
