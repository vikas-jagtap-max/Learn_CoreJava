package topic.MarkerInterface.Cloneable;

public class Test {

	public static void main(String[] args) {
		try {
			Person person1 = new Person("John", 30);

			// Marker interfaces such as Cloneable, Serializable can be used to indicate
			// that a class belongs to a particular type. This type can be checked at
			// runtime using the instanceof operator.
			if (person1 instanceof Cloneable) {
				System.out.println("Object can be cloned");
			}

			Person person2 = (Person) person1.clone();

			System.out.println("Original Object: " + person1);
			System.out.println("Cloned Object: " + person2);

			// Changing the clone's data to show that the original and clone are separate
			// objects.
			person2.name = "Jane";
			System.out.println("After modifying clone:");
			// This is how person2 is a shallow copy as original object remains the same
			// after modification.
			System.out.println("Original Object: " + person1);
			System.out.println("Clone Object: " + person2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
