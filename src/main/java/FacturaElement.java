import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "factura")
public class FacturaElement {

    @XmlElementWrapper(name = "infoAdicional")
    @XmlElement(name = "campoAdicional")
    private List<String> camposAdicionales;

    @Override
    public String toString() {
        return "FacturaElement{" +
                "camposAdicionales=" + camposAdicionales +
                "size= " + camposAdicionales.size() +
                '}';
    }
}
