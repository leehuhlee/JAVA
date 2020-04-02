/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;

/**
 *
 * @author leehu
 */
public class TestShelf {
    
    
    
    /**
     * the functionality of all of the methods
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Author a = new Author ("Tolkien", "John Ronald Reuel");
        Author b = new Author ("Rowling", "Joan Katherine");
        Author c = new Author ("Ditko", "Steve");
        Author d = new Author ("Huh", "Youngman");
        
        Literature first = new Book("The Hobit", a, 1937, "GAU UK");
        Literature second = new Book("Harry Potter", b, 1997, "Bloomsbury Publishing");
        Literature third = new Comic("Spider man", c, 1962, "SF");
        Literature fourth = new Comic("Sik Gaek", d, 2002, "Food");
        
        
        Bookshelf shelf = new Bookshelf();
        
        shelf.addLiterature(first);
        shelf.addLiterature(second);
        shelf.addLiterature(third);
        shelf.addLiterature(fourth);
        
        shelf.printShelf();
        shelf.printBooksBy(a);
        shelf.printBooksBetweenYears(1900,2000);
        
        shelf.removeLiterature(second);
        shelf.printShelf();
        
    }
}
