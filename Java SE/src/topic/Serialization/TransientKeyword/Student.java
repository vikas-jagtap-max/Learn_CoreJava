package topic.Serialization.TransientKeyword;

import java.io.Serializable;

public class Student implements Serializable {

	private int id;
	private String name;

	// The transient keyword can be used with the data members of a class in order
	// to avoid their serialization.
	private transient String email; // Now it will not be serialized

	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
