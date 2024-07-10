package topic.ObjectCloning.DeepCopy;

//So for the deep copy, we need to ensure all the member class also implement the Cloneable interface and override the clone() method of the Object class.
public class Person implements Cloneable {

	String name;
	Address address;

	public Person(String name, Address address) {

		this.name = name;
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {

		// implement deep copying in the Person class to ensure that when a Person
		// object is cloned, the Address object it references is also cloned.
		Person cloned = (Person) super.clone();

		cloned.address = (Address) this.address.clone();
		return cloned;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	

}
