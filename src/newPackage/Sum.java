package newPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import static newPackage.Part.getHighestPrice;
import static newPackage.Part.getLowestPrice;

/**
 * Created by Unknown 2 on 03-Oct-16.
 */
public class Sum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.printf("enter the first number: ");
//        int a = in.nextInt();
//        System.out.println("enter second number: ");
//        int b = in.nextInt();
//        System.out.printf("%d + %d = %d\n", a, b, a + b);

        Book c = new Book();
        Book d = new Book("Noel kal","Digiat Math", 29.9, 200, 'P', true);

        Part e = new Part();

        Part af = new Part("Air Filter", 8.75);
        System.out.printf(af.getName());
        af.printPart();
        System.out.printf("%s", af.toString());
        Part.changePrice(af, 20);
        af.printPart();

        Part p = null;
        p = new Part("Air filter",8.75);

        Part[] part = new Part[5];
        part[0] = new Part("Air Filter", 8.75);
        part[1] = new Part("Ball Joint", 29.95);
        part[2] = new Part("Headlamp", 36.99);
        part[3] = new Part("Spark Plug", 5.00);
        part[4] = new Part("Disc Pads", 24.95);

//        Scanner in = null;
//        try
//        {
//            in = new Scanner(new FileReader("parts.dat"));
//        }
//        catch (FileNotFoundException e1)
//        {
//            e1.printStackTrace();
//        }
//        Part[] part = new Part[5];
//        for (int i = 0; i < part.length; i++)
//            part[i] = new Part(in.next(), in.nextDouble());
//
//        for (int h = 0; h < part.length; h++) part[h].printPart();

        System.out.printf("\nPart with lowest price: %s\n", part[getLowestPrice(part, 0, part.length-1)].getName());
        System.out.printf("\nPart with Highest price: %s\n", part[getHighestPrice(part, 0, part.length - 1)].getName());
//        Scanner in = new Scanner(new FileReader("input.txt"));
//        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
    }



}