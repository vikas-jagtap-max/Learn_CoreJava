package fileHandling.XML;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerDTO implements Serializable {

	private String firstName;
	private String LastName;
	private String emailId;
	private String city;
	private String state;
	private int pinCode;
	private int aadharId;
	private char acctType;
	private double balance;

	public CustomerDTO() {

	}

	public CustomerDTO(String firstName, String lastName, String emailId, String city, String state, int pinCode,
			int aadharId, char acctType, double balance) {
		this.firstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.aadharId = aadharId;
		this.acctType = acctType;
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getAadharId() {
		return aadharId;
	}

	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}

	public char getAcctType() {
		return acctType;
	}

	public void setAcctType(char acctType) {
		this.acctType = acctType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "RegistrationDTO [firstName=" + firstName + ", LastName=" + LastName + ", emailId=" + emailId + ", city="
				+ city + ", state=" + state + ", pinCode=" + pinCode + ", aadharId=" + aadharId + ", acctType="
				+ acctType + ", balance=" + balance + "]";
	}

}
