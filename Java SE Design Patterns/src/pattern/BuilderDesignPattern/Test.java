package pattern.BuilderDesignPattern;

public class Test {

	public static void main(String[] args) {

		// Create Computer Class instance using Builder

		Computer computer = new Computer.ComputerBuilder("500GB", "8GB").setGraphicsCardEnabled(true).build();

		System.out.println("Object of Computer Product Class: " + computer);
	}

}
