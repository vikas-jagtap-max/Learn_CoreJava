package topic.Variables.InstanceOrNonStaticVariables;

public class Student {
	private int studenId;
	private char gender;
	private double percent;
	private long mobileNumber;
	private float GPA;
	private short age;
	private byte image;
	private boolean NCCCadate;

	public Student() {
		super();
	}

	public int getStudenId() {
		return studenId;
	}

	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public byte getImage() {
		return image;
	}

	public void setImage(byte image) {
		this.image = image;
	}

	public boolean isNCCCadate() {
		return NCCCadate;
	}

	public void setNCCCadate(boolean nCCCadate) {
		NCCCadate = nCCCadate;
	}

}
