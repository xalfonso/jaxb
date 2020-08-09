
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "autorizacion")
public class FacturaRide {
    @XmlElement(name = "comprobante")
    private Comprobante comprobante;


    @Override
    public String toString() {
        return "FacturaRide{" +
                "comprobante=" + comprobante +
                '}';
    }
}
