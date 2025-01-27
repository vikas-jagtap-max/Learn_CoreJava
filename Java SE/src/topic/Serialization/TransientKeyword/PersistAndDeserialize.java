package topic.Serialization.TransientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistAndDeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// creating object
		Student s1 = new Student(211, "Vikas", "vikasjagtap969@gmail.com");

		// writing serialized object into file
		FileOutputStream student = new FileOutputStream(
				"C:\\Users\\Vikas Jagtap\\Desktop\\Backend\\Java\\Core Java\\student.txt");
		ObjectOutputStream out = new ObjectOutputStream(student);
		out.writeObject(s1);
		out.flush();
		out.close();
		student.close();
		System.out.println("successfully persisted serialized object");

		// Deserialization
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\Vikas Jagtap\\Desktop\\Backend\\Java\\Core Java\\student.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.toString());
		System.out.println(
				"If you deserialize the object, you will get the default value for transient variable. When JVM reads the transient keyword it ignores the original value of the object and instead stores the default value of the object.");
		in.close();
	}
}
