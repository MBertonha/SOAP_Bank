
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterCadastro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterCadastro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterCadastro", propOrder = {
    "oldNome",
    "newNome",
    "oldSenha",
    "newSenha"
})
public class AlterCadastro {

    protected String oldNome;
    protected String newNome;
    protected String oldSenha;
    protected String newSenha;

    /**
     * Obtém o valor da propriedade oldNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldNome() {
        return oldNome;
    }

    /**
     * Define o valor da propriedade oldNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldNome(String value) {
        this.oldNome = value;
    }

    /**
     * Obtém o valor da propriedade newNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewNome() {
        return newNome;
    }

    /**
     * Define o valor da propriedade newNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewNome(String value) {
        this.newNome = value;
    }

    /**
     * Obtém o valor da propriedade oldSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSenha() {
        return oldSenha;
    }

    /**
     * Define o valor da propriedade oldSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSenha(String value) {
        this.oldSenha = value;
    }

    /**
     * Obtém o valor da propriedade newSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSenha() {
        return newSenha;
    }

    /**
     * Define o valor da propriedade newSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSenha(String value) {
        this.newSenha = value;
    }

}
