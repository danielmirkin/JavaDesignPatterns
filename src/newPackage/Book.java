package newPackage;

/**
 * Created by Unknown 2 on 03-Oct-16.
 */
public class Book {

    private static double Discount = 0.25;
    private static int MinBooks = 5;

    private String author = "No Author";
    private String title;
    private double price;
    private int pages;
    private char binding = 'P';
    private boolean inStock = true;

    public Book(){

    }
    public Book(String a, String t){
        author = a;
        title = t;
    }
    public Book(String a, String t, double p, int g, char b, boolean s) {
        author = a;
        title = t;
        price = p;
        binding = b;
        inStock = s;
    }
}

