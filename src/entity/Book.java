/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Book {
    private String bookName;
    private Author[] authors;
    private int publishedYear;
    private int quantity;

    public Book() {
        authors=new Author[0];
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author){
        Author[] newAuthors = Arrays.copyOf(authors,authors.length+1);
        newAuthors[newAuthors.length-1] = author;
        authors = newAuthors;
    }
            
    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{"
                + "bookName=" + bookName
                + ", authors=" + Arrays.toString(authors)
                + ", publishedYear=" + publishedYear
                + ", quantity=" + quantity + '}';
    }

    public void setPublisedYear(int publishedYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeAuthor(int numDeleteAuthor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
