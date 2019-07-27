package HashTable;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Unknown 2 on 03-Oct-16.
 */
public class DistinctNumbers {
    final static int MaxDistinctNumbers = 20;
    final static int N = 23;
    final static int Empty = 0;
    static int count = 0 ;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("src/numbers.in"));
        int[] num = new int[N + 1];
        for (int j = 1; j <= N; j++)
            num[j] = Empty;
            int distinct = 0;
        if (in.hasNextInt()) {
            while (in.hasNextInt()) {

                int key = in.nextInt();
                int loc = key % N + 1;
                while (num[loc] != Empty && num[loc] != key)
                    loc = loc % N + 1;
                if (num[loc] == Empty) { //key is not in the table
                    if (distinct == MaxDistinctNumbers) {
                        System.out.printf("\nTable full: %d not added\n", key);
                        System.exit(1);
                    }
                    num[loc] = key;
                    distinct++;
                }
            }
        }
        else if (in.hasNext()){
            String word = in.next();
            int loc = Integer.parseInt(null);
            loc = hashFunction(word, loc, N);
            if (num[loc] == Empty)
            { //key is not in the table
                if (distinct == MaxDistinctNumbers)
                {
                    System.out.printf("\nTable full: %d not added\n", word);
                    System.exit(1);
                }
                num[loc] = atoi(word);
                distinct++;
            }
        }

        in.close();
        System.out.printf("There are %d distinct numbers\n", distinct);
        //end main
    }

    public static int hashFunction(String word, int loc, int n){
        int wordNum = 0;
        int w = 3;
        for (int h = 0; h < word.length(); h++) {
            wordNum += word.charAt(h) * w;
            w = w + 2;
        }
        loc = wordNum % n + 1; //loc is assigned a value from 1 to n
        return loc;
    }

    public static int atoi(String str) {
        if (str == null || str.length() < 1)
            return 0;

        // trim white spaces
        str = str.trim();

        char flag = '+';

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }

}

