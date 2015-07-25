/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplementation;

import DAOInterface.LoginInterface;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author Imran
 */
public class LoginImplementation implements LoginInterface {

    /**
     *
     * @param userEmail
     * @param password
     * @param rememberMe
     * @return 
     */
    @Override
    public String login(String userEmail, String password, String rememberMe) {
        return login_1(userEmail, password, rememberMe);
    }

    private static String login_1(java.lang.String email, java.lang.String password, java.lang.String rememberMe) {
        webservices.ModalLayerWebservices_Service service = new webservices.ModalLayerWebservices_Service();
        webservices.ModalLayerWebservices port = service.getModalLayerWebservicesPort();
        return port.login(email, password, rememberMe);
    }  
}
