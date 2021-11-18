package Lab11.Exercise2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class TestArrayList {
    public static void main(String[] args) {
        int menuChoice=0;

        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen", "This is a black pen");
        Product p12 = new Product(12, "Blue Pen", "This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15));

        do {
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product" + "\n2. Amend a Product" + "\n3. Remove a Product" + "\n4. View all Products" + "\n5. Quit" +
                        "\n\nEnter your choice"));

            while(menuChoice<1 || menuChoice>5)
                menuChoice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product" + "\n2. Amend a Product" + "\n3. Remove a Product" + "\n4. View all Products" + "\n5. Quit" +
                        "\n\nInvalid choice entered! Must be between 1 & 5 inclusive"));

            switch(menuChoice) {
                case 1:
                    addProduct(allProducts);
                    break;

                case 2:
                    amendProduct(allProducts);
                    break;

                case 3:
                    removeProduct(allProducts);
                    break;

                case 4:
                    viewProducts(allProducts);
            }

        }while(menuChoice!=5);

        JOptionPane.showMessageDialog(null, "Thanks for using the system!", "Farewell" , JOptionPane.INFORMATION_MESSAGE );

        System.exit(0);
    }

    public static void addProduct(ArrayList<Product> allProducts){
        int ID;
        String name, description;

        ID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product ID"));
        name = JOptionPane.showInputDialog("Please enter the product name");
        description = JOptionPane.showInputDialog("Please enter the product description");

        Product p = new Product(ID, name, description);
        allProducts.add(p);

        JOptionPane.showMessageDialog(null, "Product now created and added to the array list!", "Product Added", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void amendProduct(ArrayList<Product> allProducts){

        ArrayList<Product> foundProducts = new ArrayList<Product>();
        String amendSearch, output="";
        int idChoice, amendChoice;

        amendSearch = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");

        for(Product p:allProducts)
        {
            if(p.getName().toLowerCase().contains(amendSearch.toLowerCase()))
            {
               foundProducts.add(p);
            }
        }

        for (Product p:foundProducts)
        {
            if(p!=null)
                output += p + "\n";
        }

        idChoice = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + output + "\n\nEnter the ID of the product you wish to amend"));

        String text="";

        for(Product p:foundProducts)
        {
            if(idChoice==p.getId())
            {
                text += p;
            }
        }

        Product productToAmend = null;

        for(Product p:foundProducts)
            if(p!=null && p.getId()==idChoice)
                productToAmend=p;


        amendChoice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" + text +
                "\n\n1. Amend Name\n2.Amend Description\n3.Cancel Amendment\n\nPlease enter your choice"));

        while(amendChoice<1 || amendChoice>3) {

            amendChoice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" + text +
                    "\n\n1. Amend Name\n2.Amend Description\n3.Cancel Amendment\n\nInvalid choice entered!! Must be a value between 1 & 3 inclusive"));
        }

        switch (amendChoice)
        {
            case 1:
                String name = JOptionPane.showInputDialog("Please enter the new name for the product");
                productToAmend.setName(name);
                break;

            case 2:
                String desc = JOptionPane.showInputDialog("Please enter the new description for the product");
                productToAmend.setDescription(desc);
                break;
        }

        JOptionPane.showMessageDialog(null, "Product details now amended!", "Product Amended", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void removeProduct(ArrayList<Product> allProducts)
    {
        ArrayList<Product> foundProducts = new ArrayList<Product>();
        String removeSearch, output="";
        int idChoice, removeChoice;

        removeSearch = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");

        for(Product p:allProducts)
        {
            if(p.getName().toLowerCase().contains(removeSearch.toLowerCase()))
            {
                foundProducts.add(p);
            }
        }

        for (Product p:foundProducts)
        {
            if(p!=null)
                output += p + "\n";
        }

        idChoice = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + output + "\n\nEnter the ID of the product you wish to remove"));

        Product productToRemove;
        productToRemove=null;

        for(Product p:foundProducts){
            if(p!=null && p.getId()==idChoice)
                productToRemove = p;
        }

        removeChoice = JOptionPane.showConfirmDialog(null, "The details of the product you wish to remove are\n\n" + productToRemove +
                "\n\nAre you sure you wish to remove this product?", "Product Removal Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);

        if(removeChoice==JOptionPane.YES_OPTION){
            allProducts.remove(productToRemove);
            JOptionPane.showMessageDialog(null, "Product now removed from the array list!", "Product Removed", JOptionPane.INFORMATION_MESSAGE);
        }

        else
            JOptionPane.showMessageDialog(null, "Product removal cancelled", "Product Not Removed", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void viewProducts(ArrayList<Product> allProducts)
    {
        String output="";

        for(Product p:allProducts)
            output += p + "\n";

        JOptionPane.showMessageDialog(null, output, "List of All Products", JOptionPane.INFORMATION_MESSAGE);
    }

}





