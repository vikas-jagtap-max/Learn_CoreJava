package fileHandling.XML;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

//
public class JavaObjectToXML {

	public static void main(String[] args) throws JAXBException {
		CustomerDTO customer = new CustomerDTO();
		customer.setFirstName("Akash");
		customer.setLastName("Phule");
		customer.setEmailId("akashphule8@gmail.com");
		customer.setCity("Mumbai");
		customer.setState("Bihar");
		customer.setPinCode(415745);
		customer.setAadharId(123456789);
		customer.setAcctType('C');
		customer.setBalance(5689);

		JAXBContext jaxbContext = JAXBContext.newInstance(CustomerDTO.class);

		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		File file = new File("src//main//resources//ValidCustomer.xml");

		jaxbMarshaller.marshal(customer, file);

	}
}
