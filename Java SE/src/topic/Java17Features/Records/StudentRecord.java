package topic.Java17Features.Records;

public record StudentRecord(String name, int age, Double percent) {

	public StudentRecord(String name, int age, Double percent) {
		this.name = name;
		this.age = age;
		this.percent = percent;
	}

}
