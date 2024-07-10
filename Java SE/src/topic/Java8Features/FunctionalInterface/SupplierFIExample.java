package topic.Java8Features.FunctionalInterface;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierFIExample {

	public static void main(String[] args) {

		//
		Supplier<LocalTime> supplier = () -> LocalTime.now();

		System.out.println(supplier.get());
	}

}
