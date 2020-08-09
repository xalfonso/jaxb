
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "autorizacion")
public class FacturaRide2 {
    @XmlElement(name = "comprobante")
    private Comprobante2 comprobante;


    @Override
    public String toString() {
        return "FacturaRide{" +
                "comprobante2 =" + comprobante +
                '}';
    }

    static class Comprobante2 {
        @XmlElement(name = "factura")
        private FacturaElement2 factura;

        @Override
        public String toString() {
            return "Comprobante2{" +
                    "factura=" + factura +
                    '}';
        }
    }

    static class FacturaElement2 {
        @XmlElementWrapper(name = "infoAdicional")
        @XmlElement(name = "campoAdicional")
        private List<String> camposAdicionales;

        @Override
        public String toString() {
            return "FacturaElement2{" +
                    "camposAdicionales=" + camposAdicionales + "size= " +
                    camposAdicionales != null ? String.valueOf(camposAdicionales.size()) : "0" +
                    '}';
        }
    }
}
