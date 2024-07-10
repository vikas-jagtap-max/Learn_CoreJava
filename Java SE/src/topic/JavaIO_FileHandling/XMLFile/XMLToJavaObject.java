package topic.JavaIO_FileHandling.XMLFile;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class XMLToJavaObject {

	public static void main(String[] args) {

		try {
			File file = new File("ValidCustomer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(CustomerDTO.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CustomerDTO customerDTO = (CustomerDTO) jaxbUnmarshaller.unmarshal(file);

			System.out.println(customerDTO);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
