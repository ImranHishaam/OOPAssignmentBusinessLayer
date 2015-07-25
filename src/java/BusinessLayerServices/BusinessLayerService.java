/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayerServices;

import DAOImplementation.LoginImplementation;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Imran
 */
@WebService(serviceName = "BusinessLayerService")
public class BusinessLayerService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param email
     * @param password
     * @param rememberMe
     * @return 
     */
    @WebMethod(operationName = "loginToModel")
    public String loginToModel(@WebParam(name = "email") String email, @WebParam(name = "password") String password, @WebParam(name = "rememberMe") String rememberMe) {
        //TODO write your implementation code here:
        
        LoginImplementation login = new LoginImplementation();
               
        login.login(email, password, rememberMe);
        
        return login.login(email, password, rememberMe);
    }
}
