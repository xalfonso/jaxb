import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main2 {
    public static void main(String[] args) throws JAXBException {
        File file = new File("D:\\Trabajo\\kruger\\jaxb example\\jaxb\\src\\main\\resources\\factura.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(FacturaRide2.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        FacturaRide2 facturaElement = (FacturaRide2) jaxbUnmarshaller.unmarshal(file);
        System.out.println(facturaElement);
    }
}
