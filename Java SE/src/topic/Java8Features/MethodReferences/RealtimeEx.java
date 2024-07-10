package topic.Java8Features.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class RealtimeEx {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("Mobile", "Laptop", "Tablet");

		// Sort the list
		// Using Lambda Expression
		productList.sort((String s1, String s2) -> s1.compareTo(s2));

		productList.forEach(s -> System.out.println(s)); // To print list

		// using Method Reference
		productList.sort(String::compareTo);
 
		productList.forEach(System.out::println); // To print list
	}

}
