import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class MainString {
    public static void main(String[] args) throws JAXBException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<autorizacion>\n" +
                "    <estado>AUTORIZADO</estado>\n" +
                "    <numeroAutorizacion>0308202001099132737100120020110002230422381406514</numeroAutorizacion>\n" +
                "    <fechaAutorizacion>2020-08-03 05:34:15</fechaAutorizacion>\n" +
                "    <comprobante>\n" +
                "        <estado>AUTORIZADO</estado>\n" +
                "        <factura id=\"comprobante\" version=\"1.0.0\">\n" +
                "            <estado>AUTORIZADO</estado>\n" +
                "            <infoTributaria>\n" +
                "                <ambiente>2</ambiente>\n" +
                "                <tipoEmision>1</tipoEmision>\n" +
                "                <razonSocial>TELCONET SA</razonSocial>\n" +
                "                <nombreComercial>TELCONET SA</nombreComercial>\n" +
                "                <ruc>0991327371001</ruc>\n" +
                "                <claveAcceso>0308202001099132737100120020110002230422381406514</claveAcceso>\n" +
                "                <codDoc>01</codDoc>\n" +
                "                <estab>002</estab>\n" +
                "                <ptoEmi>011</ptoEmi>\n" +
                "                <secuencial>000223042</secuencial>\n" +
                "                <dirMatriz>AV LUIS ORRANTIA SOLAR 21 Y AV VICTOR HUGO SICOURET</dirMatriz>\n" +
                "            </infoTributaria>\n" +
                "            <infoFactura>\n" +
                "                <fechaEmision>03/08/2020</fechaEmision>\n" +
                "                <dirEstablecimiento>AV 12 DE OCTUBRE N24660 Y FRANCISCO SALAZAR</dirEstablecimiento>\n" +
                "                <contribuyenteEspecial>0176</contribuyenteEspecial>\n" +
                "                <obligadoContabilidad>SI</obligadoContabilidad>\n" +
                "                <tipoIdentificacionComprador>04</tipoIdentificacionComprador>\n" +
                "                <razonSocialComprador>CORPORACION FAVORITA C.A.</razonSocialComprador>\n" +
                "                <identificacionComprador>1790016919001</identificacionComprador>\n" +
                "                <totalSinImpuestos>59.83</totalSinImpuestos>\n" +
                "                <totalDescuento>0.00</totalDescuento>\n" +
                "                <totalConImpuestos>\n" +
                "                    <totalImpuesto>\n" +
                "                        <codigo>2</codigo>\n" +
                "                        <codigoPorcentaje>2</codigoPorcentaje>\n" +
                "                        <baseImponible>68.80</baseImponible>\n" +
                "                        <valor>8.26</valor>\n" +
                "                    </totalImpuesto>\n" +
                "                    <totalImpuesto>\n" +
                "                        <codigo>3</codigo>\n" +
                "                        <codigoPorcentaje>3093</codigoPorcentaje>\n" +
                "                        <baseImponible>59.83</baseImponible>\n" +
                "                        <valor>8.97</valor>\n" +
                "                    </totalImpuesto>\n" +
                "                </totalConImpuestos>\n" +
                "                <propina>0.00</propina>\n" +
                "                <importeTotal>77.06</importeTotal>\n" +
                "                <moneda>DOLAR</moneda>\n" +
                "                <pagos>\n" +
                "                    <pago>\n" +
                "                        <formaPago>20</formaPago>\n" +
                "                        <total>77.06</total>\n" +
                "                    </pago>\n" +
                "                </pagos>\n" +
                "            </infoFactura>\n" +
                "            <detalles>\n" +
                "                <detalle>\n" +
                "                    <codigoPrincipal>COU</codigoPrincipal>\n" +
                "                    <descripcion>[COU LINEAS TELEFONIA FIJA] [ NUMEROS TELEFONICOS: 2-3922037, 2-3922038, 2-3922039, 2-3922040] [125.03 MIN CONSUMO CELULAR $15.00][126.60 MIN CONSUMO LOCAL $2.34][124.73 MIN CONSUMO NACIONAL $2.49][1.00 UNI PENSION BASICA $40.00]</descripcion>\n" +
                "                    <cantidad>1</cantidad>\n" +
                "                    <precioUnitario>59.83</precioUnitario>\n" +
                "                    <descuento>0.00</descuento>\n" +
                "                    <precioTotalSinImpuesto>59.83</precioTotalSinImpuesto>\n" +
                "                    <impuestos>\n" +
                "                        <impuesto>\n" +
                "                            <codigo>2</codigo>\n" +
                "                            <codigoPorcentaje>2</codigoPorcentaje>\n" +
                "                            <tarifa>12</tarifa>\n" +
                "                            <baseImponible>68.80</baseImponible>\n" +
                "                            <valor>8.26</valor>\n" +
                "                        </impuesto>\n" +
                "                        <impuesto>\n" +
                "                            <codigo>3</codigo>\n" +
                "                            <codigoPorcentaje>3093</codigoPorcentaje>\n" +
                "                            <tarifa>15</tarifa>\n" +
                "                            <baseImponible>59.83</baseImponible>\n" +
                "                            <valor>8.97</valor>\n" +
                "                        </impuesto>\n" +
                "                    </impuestos>\n" +
                "                </detalle>\n" +
                "            </detalles>\n" +
                "            <infoAdicional>\n" +
                "                <campoAdicional nombre=\"EMAILCLIENTE\">CRFLORESR@FAVORITA.COM\tJTOWNSEND@FAVORITA.COM</campoAdicional>\n" +
                "                <campoAdicional nombre=\"DIRCLIENTE\">VIA A COTOGCHOA AV. GENERAL ENRIQUEZ S N</campoAdicional>\n" +
                "                <campoAdicional nombre=\"TELFCLIENTE\">099801990\t022996500</campoAdicional>\n" +
                "                <campoAdicional nombre=\"CIUDADCLIENTE\">RUMINAHUI</campoAdicional>\n" +
                "                <campoAdicional nombre=\"NUMEROCLIENTE\">000223042</campoAdicional>\n" +
                "                <campoAdicional nombre=\"CONSUMOCLIENTE\">JULIO      2020</campoAdicional>\n" +
                "                <campoAdicional nombre=\"LOGINCLIENTE\">FAVORITA-POMSQUITELEF-UIO</campoAdicional>\n" +
                "                <campoAdicional nombre=\"CONTRATOCLIENTE\">CON-001-001-0008525</campoAdicional>\n" +
                "                <campoAdicional nombre=\"FPAGOCLIENTE\">TRANSFERENCIA</campoAdicional>\n" +
                "                <campoAdicional nombre=\"SUBTOTALDOS\">59.83</campoAdicional>\n" +
                "                <campoAdicional nombre=\"VALORPAGAR\">77.06</campoAdicional>\n" +
                "                <campoAdicional nombre=\"NOTIFICACION\">SU SALDO A LA FECHA ES $0.00 DE NO CONFIRMAR DESACUERDO AL CORREO COBRANZAS_GYE@TELCONET.EC EN EL LAPSO DE 72 HS. DE HABER RECIBIDO LA FACTURA\t SE CONSIDERARA ACEPTADO FORMALMENTE POR UD.</campoAdicional>\n" +
                "            </infoAdicional>\n" +
                "        </factura>\n" +
                "    </comprobante>\n" +
                "</autorizacion>";

        int inicioInfoAdicional = xml.indexOf("<infoAdicional");
        int finInfoAdicional = xml.indexOf("</infoAdicional>") + 16;
        String infoAdicionalXML = xml.substring(inicioInfoAdicional,finInfoAdicional);
        JAXBContext jaxbContext = JAXBContext.newInstance(InfoAdicional.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        InfoAdicional infoAdicional = (InfoAdicional) jaxbUnmarshaller.unmarshal(new StringReader(infoAdicionalXML));
        System.out.println(infoAdicional);

        /*JAXBContext jaxbContext = JAXBContext.newInstance(FacturaRide2.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        FacturaRide2 facturaElement = (FacturaRide2) jaxbUnmarshaller.unmarshal(new StringReader(xml));
        System.out.println(facturaElement);*/
    }
}
