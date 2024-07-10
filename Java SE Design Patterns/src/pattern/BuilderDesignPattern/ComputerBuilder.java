package pattern.BuilderDesignPattern;

//Builder Class
public static class ComputerBuilder {
	// Mandatory fields
	protected String HDD;
	protected String RAM;

	// Optional fields
	protected boolean isGraphicsCardEnabled;

	//
	public ComputerBuilder(String hDD, String rAM) {
		this.HDD = hDD;
		this.RAM = rAM;
	}

	// setter method for setting optional field
	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	// Method to build the object of computer class
	public Computer build() {
		return new Computer(this);
	}

	@Override
	public String toString() {
		return "ComputerBuilder [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ "]";
	}

}
