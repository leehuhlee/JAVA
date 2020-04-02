/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;

/**
 * Book has the property publisher in addition to the basic properties
 * of Literature.
 * 
 * @author leehu
 */
public class Book extends Literature{
    String publisher;
    
    public Book (String _title, Author _author, int _yearOfPublication, String _publisher){
        super(_title, _author, _yearOfPublication);
        this.publisher = _publisher;
    }
    
}
