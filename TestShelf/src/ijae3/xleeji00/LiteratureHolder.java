/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;

/**
 * Interface of Bookshelf
 * 
 * @author leehu
 */
public interface LiteratureHolder {
    public void addLiterature(Literature lit);
    public void removeLiterature(Literature lit);
    public void printShelf();
    public void printBooksBy(Author a);
    public void printBooksBetweenYears(int yearFrom, int yearTo);
    
}
