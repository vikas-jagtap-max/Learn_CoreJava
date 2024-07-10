package topic.Packages;

import java.util.Vector; //Non-static imports

public class NonStaticImports {

	public void ImportDemo() {

		// Approach 1:
		// Imported using keyword, hence able to access directly in the code without
		// package qualification.
		Vector v = new Vector();
		v.add("Tutorials");
		v.add("Point");
		v.add("India");
		System.out.println("Vector values are: " + v);

		// Approach 2:
		// Respective package not imported, hence referring to it using its fully
		// qualified name.
		java.util.ArrayList list = new java.util.ArrayList();
		list.add("Tutorix");
		list.add("India");
		System.out.println("Array List values are: " + list);
	}

	public static void main(String[] args) {

	}

}
