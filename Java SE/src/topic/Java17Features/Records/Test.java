package topic.Java17Features.Records;

public class Test {

	public static void main(String[] args) {

		// Class
		StudentClass s1 = new StudentClass("Vikas", 25, 84.5);
		StudentClass s2 = new StudentClass("Akash", 26, 81.5);

		System.out.println(s1.getName());
		System.out.println(s2.getName());

		// Records
		StudentRecord s3 = new StudentRecord("Vikas", 25, 84.5);
		StudentRecord s4 = new StudentRecord("Akash", 26, 81.5);
		System.out.println(s3.name());
		System.out.println(s4.name());

	}

}
