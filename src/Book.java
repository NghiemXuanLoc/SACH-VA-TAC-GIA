/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest14.B9;

/**
 *
 * @author PC
 */
public class Book {
    
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName() {
        return name;
    }
    
    public Author[] getAuthors() {
        return authors;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public void getAuthorNames() {
        Author[] x = getAuthors();
        for (int i = 1; i <= x.length; i++) {
            System.out.println("#" + i);
            System.out.println(x[i - 1].toString());
        }
    }

    public String toString() {
        return "-----------------------\nBook information :\nName : " + this.getName() + "\nPrice : " + String.format("%.0f", this.getPrice()) + "\nQuantity : " + this.getQty() + "\nAuthor information :";
    }
}
