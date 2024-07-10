package topic.Java8Features.MethodReferences;

public class Implementation {

	Implementation() {

	}
	// 1)Referring static method
	public static void say() {
		System.out.println("Hello, this is static method.");
	}

	// 2)Reference to an Instance Method
	public void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	//3)Reference to a Constructor
	Implementation(String msg) {
		System.out.print(msg);
	}

}
