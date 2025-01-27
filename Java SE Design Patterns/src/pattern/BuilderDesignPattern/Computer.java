package pattern.BuilderDesignPattern;

//Product Class
public class Computer {
	// Mandatory fields
	private String HDD;
	private String RAM;

	// Optional fields
	private boolean isGraphicsCardEnabled;

	// Private/protected constructor to enforce object creation through builder
	protected Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + "]";
	}

}
