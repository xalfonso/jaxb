import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "comprobante")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Comprobante {
    @XmlElement(name = "factura")
    private FacturaElement factura;

    @Override
    public String toString() {
        return "Comprobante{" +
                "factura=" + factura +
                '}';
    }

}
