package newPackage;

import java.util.Scanner;

/**
 * Created by Unknown 2 on 03-Oct-16.
 */


public class SearchTest {
    public static void main(String[] args) {
// set up an array with 7 persons
        Person[] person = new Person[7];
        person[0] = new Person("Gary", 25, 'M');
        person[1] = new Person("Inga", 21, 'F');
        person[2] = new Person("Abel", 30, 'M');
        person[3] = new Person("Olga", 36, 'F');
        person[4] = new Person("Nora", 19, 'F');
        person[5] = new Person("Mary", 27, 'F');
        person[6] = new Person("Bert", 32, 'M');
        Scanner in = new Scanner(System.in);
        String s;
        System.out.printf("Enter names, one at a time, and I'll tell you\n");
        System.out.printf("their age and gender. To end, press Enter\n\n");
        while (!(s = in.nextLine()).equals("")) {
            int n = sequentialSearch(s, person, person.length);
            if (n >= 0)
                System.out.printf("%d %c\n\n", person[n].age, person[n].gender);
            else System.out.printf("Not found\n\n");
        }
    }

    public static int sequentialSearch(String key, Person[] person, int n) {
        for (int h = 0; h < n; h++)
            if (key.equalsIgnoreCase(person[h].name))
                return h;
        return -1;
    }
}
