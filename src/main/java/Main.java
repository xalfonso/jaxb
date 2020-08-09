import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        File file = new File("D:\\Trabajo\\kruger\\jaxb example\\jaxb\\src\\main\\resources\\customer.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
        System.out.println(customer);
    }
}
