
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultUser_QNAME = new QName("http://ws/", "consultUser");
    private final static QName _DepositoResponse_QNAME = new QName("http://ws/", "depositoResponse");
    private final static QName _Saque_QNAME = new QName("http://ws/", "saque");
    private final static QName _CadastrarUser_QNAME = new QName("http://ws/", "cadastrarUser");
    private final static QName _SaqueResponse_QNAME = new QName("http://ws/", "saqueResponse");
    private final static QName _ConsultUserResponse_QNAME = new QName("http://ws/", "consultUserResponse");
    private final static QName _SaldoUserResponse_QNAME = new QName("http://ws/", "saldoUserResponse");
    private final static QName _AlterCadastro_QNAME = new QName("http://ws/", "alterCadastro");
    private final static QName _CadastrarUserResponse_QNAME = new QName("http://ws/", "cadastrarUserResponse");
    private final static QName _Deposito_QNAME = new QName("http://ws/", "deposito");
    private final static QName _AlterCadastroResponse_QNAME = new QName("http://ws/", "alterCadastroResponse");
    private final static QName _SaldoUser_QNAME = new QName("http://ws/", "saldoUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultUser }
     * 
     */
    public ConsultUser createConsultUser() {
        return new ConsultUser();
    }

    /**
     * Create an instance of {@link DepositoResponse }
     * 
     */
    public DepositoResponse createDepositoResponse() {
        return new DepositoResponse();
    }

    /**
     * Create an instance of {@link Saque }
     * 
     */
    public Saque createSaque() {
        return new Saque();
    }

    /**
     * Create an instance of {@link CadastrarUser }
     * 
     */
    public CadastrarUser createCadastrarUser() {
        return new CadastrarUser();
    }

    /**
     * Create an instance of {@link SaqueResponse }
     * 
     */
    public SaqueResponse createSaqueResponse() {
        return new SaqueResponse();
    }

    /**
     * Create an instance of {@link ConsultUserResponse }
     * 
     */
    public ConsultUserResponse createConsultUserResponse() {
        return new ConsultUserResponse();
    }

    /**
     * Create an instance of {@link SaldoUserResponse }
     * 
     */
    public SaldoUserResponse createSaldoUserResponse() {
        return new SaldoUserResponse();
    }

    /**
     * Create an instance of {@link AlterCadastro }
     * 
     */
    public AlterCadastro createAlterCadastro() {
        return new AlterCadastro();
    }

    /**
     * Create an instance of {@link CadastrarUserResponse }
     * 
     */
    public CadastrarUserResponse createCadastrarUserResponse() {
        return new CadastrarUserResponse();
    }

    /**
     * Create an instance of {@link Deposito }
     * 
     */
    public Deposito createDeposito() {
        return new Deposito();
    }

    /**
     * Create an instance of {@link AlterCadastroResponse }
     * 
     */
    public AlterCadastroResponse createAlterCadastroResponse() {
        return new AlterCadastroResponse();
    }

    /**
     * Create an instance of {@link SaldoUser }
     * 
     */
    public SaldoUser createSaldoUser() {
        return new SaldoUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultUser")
    public JAXBElement<ConsultUser> createConsultUser(ConsultUser value) {
        return new JAXBElement<ConsultUser>(_ConsultUser_QNAME, ConsultUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositoResponse")
    public JAXBElement<DepositoResponse> createDepositoResponse(DepositoResponse value) {
        return new JAXBElement<DepositoResponse>(_DepositoResponse_QNAME, DepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saque")
    public JAXBElement<Saque> createSaque(Saque value) {
        return new JAXBElement<Saque>(_Saque_QNAME, Saque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cadastrarUser")
    public JAXBElement<CadastrarUser> createCadastrarUser(CadastrarUser value) {
        return new JAXBElement<CadastrarUser>(_CadastrarUser_QNAME, CadastrarUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saqueResponse")
    public JAXBElement<SaqueResponse> createSaqueResponse(SaqueResponse value) {
        return new JAXBElement<SaqueResponse>(_SaqueResponse_QNAME, SaqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultUserResponse")
    public JAXBElement<ConsultUserResponse> createConsultUserResponse(ConsultUserResponse value) {
        return new JAXBElement<ConsultUserResponse>(_ConsultUserResponse_QNAME, ConsultUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saldoUserResponse")
    public JAXBElement<SaldoUserResponse> createSaldoUserResponse(SaldoUserResponse value) {
        return new JAXBElement<SaldoUserResponse>(_SaldoUserResponse_QNAME, SaldoUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterCadastro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "alterCadastro")
    public JAXBElement<AlterCadastro> createAlterCadastro(AlterCadastro value) {
        return new JAXBElement<AlterCadastro>(_AlterCadastro_QNAME, AlterCadastro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cadastrarUserResponse")
    public JAXBElement<CadastrarUserResponse> createCadastrarUserResponse(CadastrarUserResponse value) {
        return new JAXBElement<CadastrarUserResponse>(_CadastrarUserResponse_QNAME, CadastrarUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deposito")
    public JAXBElement<Deposito> createDeposito(Deposito value) {
        return new JAXBElement<Deposito>(_Deposito_QNAME, Deposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterCadastroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "alterCadastroResponse")
    public JAXBElement<AlterCadastroResponse> createAlterCadastroResponse(AlterCadastroResponse value) {
        return new JAXBElement<AlterCadastroResponse>(_AlterCadastroResponse_QNAME, AlterCadastroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saldoUser")
    public JAXBElement<SaldoUser> createSaldoUser(SaldoUser value) {
        return new JAXBElement<SaldoUser>(_SaldoUser_QNAME, SaldoUser.class, null, value);
    }

}
