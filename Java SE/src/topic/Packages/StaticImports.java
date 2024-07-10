package topic.Packages;

import static java.lang.System.*; //Using Static Import

public class StaticImports {

	public static void main(String[] args) {

		// Approach 1:
		// Class name "System" is used explicitly
		System.out.println("Welcome to Tutorials Point");

		// Approach 2:
		// Class name "System" is not used as it is imported using the keyword static.
		out.println("Welcome to Tutorials Point");
	}

}
