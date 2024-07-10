package fileHandling.XML;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

//
public class XMLToJavaObject {

	public static void main(String[] args) throws JAXBException {

		File file = new File("src//main//resources//Customer.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(CustomerDTO.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		CustomerDTO customerDTO = (CustomerDTO) jaxbUnmarshaller.unmarshal(file);

		System.out.println(customerDTO);

	}

}
