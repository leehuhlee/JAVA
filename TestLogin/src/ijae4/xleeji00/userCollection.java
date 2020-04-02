/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae4.xleeji00;

/**
 *
 * @author leehu
 */
public class userCollection {
    String username;
    String password;
    
    public userCollection(String _username, String _password){
        username = _username;
        password = _password;
    }
    
    public String setUsername(){
        return username;
    }
    
    public String setPassword(){
        return password;
    }
}
