/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijae3.xleeji00;

/**
 * Each Literature is described by its title, author, and 
 * year of publication.
 * 
 * @author leehu
 */
public abstract class Literature implements Comparable<Literature> {
    protected String title;
    protected Author author;
    protected int yearOfPublication;
    
    public Literature (String _title, Author _author, int _yearOfPublication){
        this.title = _title;
        this.author = _author;
        this.yearOfPublication = _yearOfPublication;
    }
    
    public int compareTo(Literature lit){
        if((author.surname.compareTo(lit.author.surname)) < 0){
            return -1;
        }
        else if((author.surname.compareTo(lit.author.surname)) > 0){
            return 1;
        }
        else{
            if((author.name.compareTo(lit.author.name)) < 0){
                return -1;
            }
            else if((author.name.compareTo(lit.author.name)) > 0){
                return 1;
            }
            else{
                if((title.compareTo(lit.title)) < 0){
                    return -1;
                }
                else if((title.compareTo(lit.title)) > 0){
                    return 1;
                }
                else{
                    if(yearOfPublication < lit.yearOfPublication){
                        return -1;
                    }
                    else if(yearOfPublication > lit.yearOfPublication){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
