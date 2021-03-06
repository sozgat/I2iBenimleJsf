
package i2i_benimle;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "dbi2iBenimle", targetNamespace = "http://i2i_benimle/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Dbi2IBenimle {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getContractId", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetContractId")
    @ResponseWrapper(localName = "getContractIdResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetContractIdResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getContractIdRequest", output = "http://i2i_benimle/dbi2iBenimle/getContractIdResponse")
    public int getContractId(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<i2i_benimle.Campaign>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCampaign", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCampaign")
    @ResponseWrapper(localName = "getCampaignResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCampaignResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getCampaignRequest", output = "http://i2i_benimle/dbi2iBenimle/getCampaignResponse")
    public List<Campaign> getCampaign();

    /**
     * 
     * @param arg0
     * @return
     *     returns i2i_benimle.Balance
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBalance", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetBalance")
    @ResponseWrapper(localName = "getBalanceResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetBalanceResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getBalanceRequest", output = "http://i2i_benimle/dbi2iBenimle/getBalanceResponse")
    public Balance getBalance(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns i2i_benimle.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerCredential", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCustomerCredential")
    @ResponseWrapper(localName = "getCustomerCredentialResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCustomerCredentialResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getCustomerCredentialRequest", output = "http://i2i_benimle/dbi2iBenimle/getCustomerCredentialResponse")
    public Customer getCustomerCredential(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns i2i_benimle.Tariff
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRateplan", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetRateplan")
    @ResponseWrapper(localName = "getRateplanResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetRateplanResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getRateplanRequest", output = "http://i2i_benimle/dbi2iBenimle/getRateplanResponse")
    public Tariff getRateplan(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<i2i_benimle.Tariff>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRateplanList", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetRateplanList")
    @ResponseWrapper(localName = "getRateplanListResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetRateplanListResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getRateplanListRequest", output = "http://i2i_benimle/dbi2iBenimle/getRateplanListResponse")
    public List<Tariff> getRateplanList();

    /**
     * 
     * @param arg0
     * @return
     *     returns i2i_benimle.Wallet
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerWallet", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCustomerWallet")
    @ResponseWrapper(localName = "getCustomerWalletResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.GetCustomerWalletResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/getCustomerWalletRequest", output = "http://i2i_benimle/dbi2iBenimle/getCustomerWalletResponse")
    public Wallet getCustomerWallet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCustomerWallet", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.UpdateCustomerWallet")
    @ResponseWrapper(localName = "updateCustomerWalletResponse", targetNamespace = "http://i2i_benimle/", className = "i2i_benimle.UpdateCustomerWalletResponse")
    @Action(input = "http://i2i_benimle/dbi2iBenimle/updateCustomerWalletRequest", output = "http://i2i_benimle/dbi2iBenimle/updateCustomerWalletResponse")
    public int updateCustomerWallet(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
