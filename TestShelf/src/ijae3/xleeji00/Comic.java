/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;

/**
 * Comic has property genre in addition to the basic properties of
 * Literature.
 * 
 * @author leehu
 */
public class Comic extends Literature{
    String genre;
    
    public Comic (String _title, Author _author, int _yearOfPublication, String _genre){
        super(_title, _author, _yearOfPublication);
        this.genre = _genre;
    }
}
