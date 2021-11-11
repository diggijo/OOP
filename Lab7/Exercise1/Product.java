package Lab7.Exercise1;

public class Product {
    private int id;
    private String name;
    private String description;
    private static int count = 1000000;

    public Product(String name, String description) {
        /*IncrementCount();
        setId(count);*/
        setId();
        setName(name);
        setDescription(description);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /* private void IncrementCount(){
            count++;
       }

       public static int getCount {
            return count;
       }
     */
    public String toString() {
        return "Product details are as follows: id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }
}
