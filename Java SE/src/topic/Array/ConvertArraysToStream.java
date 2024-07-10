package topic.Array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArraysToStream {

	public static void main(String[] args) {

		// 1)Primitive Array
		int[] arr1 = { 1, 2, 3, 4 };

		final IntStream primitiveArrayStream = Arrays.stream(arr1); //
		// for printing it we have used method references
		primitiveArrayStream.forEach(System.out::println);

		// 2)Object Array
		Integer[] arr2 = { 1, 2, 3, 4 };

		final Stream<Integer> objectArrayStream = Stream.of(arr2); //
		// for printing it we have used method references
		objectArrayStream.forEach(System.out::println);
	}

}
