package topic.Java17Features.Records;

//POJO Class
public class StudentClass {
	private String name;
	private int age;
	private double percent;

	public StudentClass(String name, int age, double percent) {
		this.name = name;
		this.age = age;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "StudentClass [name=" + name + ", age=" + age + ", percent=" + percent + "]";
	}

}
