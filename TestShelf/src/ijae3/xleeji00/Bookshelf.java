/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Bookshelf contains a collection of Literature and implements an
 * interface LiteratureHolder.
 * 
 * @author leehu
 */
public class Bookshelf implements LiteratureHolder{
    private Literature literature;
    private Set<Literature> enlisted;
      
    /**
     * add literature to the collection of the pieces of literature 
     * in the shelf.
     * 
     * @param lit : Literature to add
     */
    public void addLiterature(Literature lit){
        if (enlisted == null){
            enlisted = new HashSet<>();
        }
        enlisted.add(lit);
    }
    
    /**
     * removes literature from the collection of literatures in 
     * the shelf.
     * 
     * @param lit : Literature to remove
     */
    public void removeLiterature(Literature lit){
        if(enlisted != null){
            enlisted.remove(lit);
        }
    }
    
    /**
     * prints all of the literature inside shelf sorted by the following key : 
     * 1. author;s surname
     * 2. author's name
     * 3. title of the literature
     * 4. year of publication.
     * Each entry will be printed in the following format :
     * "Author: Title (Year) - Book / Comic (Publisher / Genre)"
     */
    public void printShelf(){
        System.out.println("----- Print Shelf -----");
        
        List<Literature> literatureList = new ArrayList<Literature>(enlisted);
        Collections.sort(literatureList);
        
        for(Object obj : literatureList) {
            Literature l = (Literature) obj;
            if(l instanceof Book){
                Book b = (Book) l;
                System.out.println(b.author.surname + ", " + b.author.name + ": " + b.title + " (" + b.yearOfPublication + ")" + " - " + "Book" + " (" + b.publisher + ")");
            }
            else if(l instanceof Comic){
                Comic c = (Comic) l;
                System.out.println(c.author.surname + ", " + c.author.name + ": " + c.title + " (" + c.yearOfPublication + ")" + " - " + "Comic" + " (" + c.genre + ")");
            }
        }
    }
    
    /**
     * prints all of the literature in the shelf written by the 
     * Author a
     * 
     * @param a : Author name to search
     */
    public void printBooksBy(Author a){
        System.out.println("----- Print Books By Author -----");
        for(Object obj : enlisted){
            Literature l = (Literature) obj;
            if(l.author == a){
                if(l instanceof Book){
                    Book b = (Book) l;
                    System.out.println(b.author.surname + ", " + b.author.name + ": " + b.title + " (" + b.yearOfPublication + ")" + " - " + "Book" + " (" + b.publisher + ")");
                }
                else if(l instanceof Comic){
                    Comic c = (Comic) l;
                    System.out.println(c.author.surname + ", " + c.author.name + ": " + c.title + " (" + c.yearOfPublication + ")" + " - " + "Comic" + " (" + c.genre + ")");
                }
            }
        }
    }
    
    /**
     * prints all of the literature in the shelf that was published
     * between the years yearFrom and yearTo (these years included)
     * 
     * @param yearFrom : start year to search
     * @param yearTo : end year to search
     */
    public void printBooksBetweenYears(int yearFrom, int yearTo){
        System.out.println("----- Print Books Between Years -----");
        
        for(Object obj : enlisted){
            Literature l = (Literature) obj;
            if(yearFrom <= l.yearOfPublication && l.yearOfPublication <= yearTo){
                if(l instanceof Book){
                Book b = (Book) l;
                System.out.println(b.author.surname + ", " + b.author.name + ": " + b.title + " (" + b.yearOfPublication + ")" + " - " + "Book" + " (" + b.publisher + ")");
                }
                else if(l instanceof Comic){
                    Comic c = (Comic) l;
                    System.out.println(c.author.surname + ", " + c.author.name + ": " + c.title + " (" + c.yearOfPublication + ")" + " - " + "Comic" + " (" + c.genre + ")");
                }
            }
        }
    }
}
