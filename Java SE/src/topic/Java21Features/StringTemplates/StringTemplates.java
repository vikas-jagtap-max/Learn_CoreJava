package topic.Java21Features.StringTemplates;

public class StringTemplates {

	public static void main(String[] args) {
		String name1 = "CodeSnippet";
		String welcome1 = "Welcome to " + name1 + " Java 21 features";
		System.out.println(welcome);
		
		String name2 = "CodeSnippet";
		String welcome2 = STR."Welcome to \{name} Java 21 features";
		System.out.println(welcome2);
	}

}
