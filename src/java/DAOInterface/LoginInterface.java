/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

/**
 *
 * @author Imran
 */
public interface LoginInterface {
    String login(String userEmail, String password, String rememberMe);
}
