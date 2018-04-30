package pe.gob.sunat.servicio2.registro.electronico.comppago.consulta.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import pe.gob.sunat.service.BillService;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-28T13:05:40.473-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "billConsultService",
                  wsdlLocation = "file:/home/admin/git/sunat-web-services/src/main/resources/wsdl/consulta_cdr.wsdl",
                  targetNamespace = "http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/")
public class BillConsultService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/", "billConsultService");
    public final static QName BillConsultServicePort = new QName("http://service.ws.consulta.comppago.electronico.registro.servicio2.sunat.gob.pe/", "BillConsultServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/admin/git/sunat-web-services/src/main/resources/wsdl/consulta_cdr.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BillConsultService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/admin/git/sunat-web-services/src/main/resources/wsdl/consulta_cdr.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BillConsultService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BillConsultService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillConsultService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BillConsultService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BillConsultService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BillConsultService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BillService
     */
    @WebEndpoint(name = "BillConsultServicePort")
    public BillService getBillConsultServicePort() {
        return super.getPort(BillConsultServicePort, BillService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillService
     */
    @WebEndpoint(name = "BillConsultServicePort")
    public BillService getBillConsultServicePort(WebServiceFeature... features) {
        return super.getPort(BillConsultServicePort, BillService.class, features);
    }

}