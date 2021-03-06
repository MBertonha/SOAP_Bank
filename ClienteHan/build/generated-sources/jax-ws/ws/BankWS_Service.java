
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/BankWS/BankWS?WSDL")
public class BankWS_Service
    extends Service
{

    private final static URL BANKWS_WSDL_LOCATION;
    private final static WebServiceException BANKWS_EXCEPTION;
    private final static QName BANKWS_QNAME = new QName("http://ws/", "BankWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BankWS/BankWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWS_WSDL_LOCATION = url;
        BANKWS_EXCEPTION = e;
    }

    public BankWS_Service() {
        super(__getWsdlLocation(), BANKWS_QNAME);
    }

    public BankWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWS_QNAME, features);
    }

    public BankWS_Service(URL wsdlLocation) {
        super(wsdlLocation, BANKWS_QNAME);
    }

    public BankWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWS_QNAME, features);
    }

    public BankWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankWS
     */
    @WebEndpoint(name = "BankWSPort")
    public BankWS getBankWSPort() {
        return super.getPort(new QName("http://ws/", "BankWSPort"), BankWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankWS
     */
    @WebEndpoint(name = "BankWSPort")
    public BankWS getBankWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BankWSPort"), BankWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWS_EXCEPTION!= null) {
            throw BANKWS_EXCEPTION;
        }
        return BANKWS_WSDL_LOCATION;
    }

}
