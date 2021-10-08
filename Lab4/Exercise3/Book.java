package Lab4.Exercise3;

public class Book {
    private String title;
    private double price;
    private String IBSN;
    private int pages;

    public Book(){
        this("Not Available", 0, "Not Available", 0);
    }

    public Book(String title, double price, String IBSN, int pages){
        setTitle(title);
        setPrice(price);
        setIBSN(IBSN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }
    public String getIBSN(){
        return IBSN;
    }

    public int getPages(){
        return pages;
    }
    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setIBSN(String IBSN){
        this.IBSN = IBSN;
    }

    public void setPages(int pages){
        if(pages > 0)
            this.pages = pages;
    }

    public void setPrice(double price){
        if(price > 0)
            this.price = price;
    }

    public String toString() {
        return "Title: " + getTitle() + " Price: " + getPrice() + " IBSN: " + getIBSN() +
                " Pages: " + getPages();
    }
}
