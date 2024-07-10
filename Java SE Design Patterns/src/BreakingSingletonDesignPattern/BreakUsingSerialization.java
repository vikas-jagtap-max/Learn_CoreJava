package BreakingSingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class BreakUsingSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SingletonClass o1 = SingletonClass.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
		out.writeObject(o1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));

		SingletonClass o2 = (SingletonClass) in.readObject();
		in.close();

		// To verify
		System.out.println("Hashcode of o1: " + o1.hashCode());
		System.out.println("Hashcode of o2: " + o2.hashCode());
	}

}
