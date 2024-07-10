package topic.Variables.InstanceOrNonStaticVariables;

public class DefaultValuesofInstanceVariables {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Default value of int: " + s1.getStudenId());
		System.out.println("Default value of char:" + s1.getGender());
		System.out.println("Default value of double: " + s1.getPercent());
		System.out.println("Default value of long: " + s1.getMobileNumber());
		System.out.println("Default value of float: " + s1.getGPA());
		System.out.println("Default value of short: " + s1.getAge());
		System.out.println("Default value of byte: " + s1.getImage());

	}

}
