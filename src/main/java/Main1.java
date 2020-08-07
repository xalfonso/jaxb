import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main1 {
    public static void main(String[] args) throws JAXBException {
        File file = new File("/home/eduardo/Desktop/temp/jaxb/src/main/resources/factura.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(FacturaRide.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        FacturaRide facturaRide = (FacturaRide) jaxbUnmarshaller.unmarshal(file);
        System.out.println(facturaRide);
    }
}
