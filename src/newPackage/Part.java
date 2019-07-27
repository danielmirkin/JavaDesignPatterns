package newPackage;

/**
 * Created by Unknown 2 on 03-Oct-16.
 */
public class Part {
    public static int NumParts = 0;
    public String name;
    public double price;

    private static final double MinPrice = 0.0;
    private static final double MaxPrice = 99.99;
    private static final double NullPrice = -1;

    public Part(){
        name = "NO PART";
        price = -1;
        NumParts++;
    }

    public static int GetNumParts(){
        return NumParts;

    }

    public Part(String n, double p){
        name = n;
        price = p;
        NumParts++;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        if (p < MinPrice || p > MaxPrice){
            System.out.printf("Part: %s\n", name);
            System.out.printf("Invalid price: %3.2f; set to %3.2f\n", p, NullPrice);
            price = NullPrice;
        }
        else price = p ;


    }

    public void printPart(){
        System.out.printf("\nName of part: %s\n", name);
        System.out.printf("Price: $%3.2f\n", price);

    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void changePrice(Part p, double amount){
        p.price+=amount;
    }

    public static int getLowestPrice(Part[] part, int lo, int hi) {

        int small = lo;
        for (int h = lo + 1; h <= hi; h++)
            if (part[h].getPrice() < part[small].getPrice()) small = h;
        return small;
    }

    public static int getHighestPrice(Part[] part, int lo, int hi) {

        int big = hi;
        for (int h = lo + 1; h <= hi; h++)
            if (part[h].getPrice() > part[big].getPrice()) big = h;
        return big;
    }
}



