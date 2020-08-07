
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "/comprobante")
public class FacturaRide {
    String estado;


    @XmlElement
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "FacturaRide{" +
                "estado='" + estado + '\'' +
                '}';
    }
}
