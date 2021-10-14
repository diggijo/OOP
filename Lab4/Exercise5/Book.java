package Lab4.Exercise5;

import javax.swing.*;

public class Book {
    String title;
    double price;
    String ISBN;
    int pages;

    public Book(){
        this("Not Available", 0, "Not Available", 0);
    }

    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }
    public String getISBN(){
        return ISBN;
    }

    public int getPages(){
        return pages;
    }
    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        if(title == null || title.equals(""))
        {
            this.title = "No Valid Title Supplied";
        }
         else
        {
            this.title = title;
        }
    }

    public void setISBN(String ISBN){
        if(ISBN == null || ISBN.equals(""))
        {
            this.ISBN = "No Valid ISBN Supplied";
        }
        else
        {
            this.ISBN = ISBN;
        }

    }

    public void setPages(int pages){
        if(pages > 0 && pages < 4000)
        {
            this.pages = pages;
        }
        else
        {
            this.pages = 0;
        }
    }

    public void setPrice(double price){
        if(price > 0 && price <= 50000)
        {
            this.price = price;
        }
        else
        {
            this.price = 0;
        }
    }

    public String toString() {
        return "Title: " + getTitle() + " Price: " + getPrice() + " ISBN: " + getISBN() +
                " Pages: " + getPages();
    }
}
