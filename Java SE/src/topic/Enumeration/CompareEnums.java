package topic.Enumeration;

public class CompareEnums {

	public static void main(String[] args) {

		DayOfWeek enum1 = DayOfWeek.MONDAY;
		DayOfWeek enum2 = DayOfWeek.MONDAY;

		if (enum1.equals(enum2)) {
			System.out.println("Both enums are same");

		}

		if (enum1 == enum2) {
			System.out.println("Both enums are same");
		}

		System.out.println("Note: In case of enumeration, .equals() method and == operator does the same thing");
	}

}
