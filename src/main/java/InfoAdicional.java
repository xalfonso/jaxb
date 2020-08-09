import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "infoAdicional")
public class InfoAdicional {
    private List<String> camposAdicionales;

    @XmlElement(name = "campoAdicional")
    public List<String> getCamposAdicionales() {
        return camposAdicionales;
    }

    public void setCamposAdicionales(List<String> camposAdicionales) {
        this.camposAdicionales = camposAdicionales;
    }

    @Override
    public String toString() {
        return "InfoAdicional{" +
                "camposAdicionales=" + camposAdicionales + "size= " +
                camposAdicionales != null ? String.valueOf(camposAdicionales.size()) : "0" +
                '}';
    }
}
