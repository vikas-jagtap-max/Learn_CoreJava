package topic.ObjectCloning.ShallowCopy;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Pune", "Maharashtra", "India");
		Person person1 = new Person("Vikas", address);

		// Shallow Copy - Shallow copy copies only the top-level object and not objects
		// that are referenced by the original object.
		Person person2 = (Person) person1.clone();
		// OR
		// Person person2 = person1;

		System.out.println("Original Object: " + person1);
		System.out.println("Cloned Object: " + person2);

		// Changing the clone's data to show that the original and clone are separate
		// objects. Change the main field of cloned object
		person2.name = "Neha";

		// This is how person2 is a shallow copy as original object remains the same
		// after modification.
		System.out.println(person1.name);
		System.out.println(person2.name);

		// Change the field of copy object which contains reference of another object
		person2.address.city = "Mumbai";

		// The address object which is referenced by original person object gets
		// modified as its copy is not made as a part of Shallow copy.
		// This is the problem with Shallow Copy which is overcome by Deep Copy
		System.out.println(person1.address);
		System.out.println(person2.address);
	}

}
