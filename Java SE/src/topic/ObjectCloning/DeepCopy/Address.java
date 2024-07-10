package topic.ObjectCloning.DeepCopy;

//So for the deep copy, we need to ensure all the member class also implement the Cloneable interface and override the clone() method of the Object class.
public class Address implements Cloneable {
	String city;
	String state;
	String country;

	public Address(String city, String state, String country) {

		this.city = city;
		this.state = state;
		this.country = country;
	}

	//
	public Object clone() throws CloneNotSupportedException {
		//
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
