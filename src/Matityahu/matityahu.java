package Matityahu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Unknown 2 on 18-Nov-16.
 *
 * x = num of soldiers , y = nearest power of 2 smaller than x
 * using f(x,y) = (x - 2^y) * 2 - 1 // y is dependent on x
 */
public class matityahu {
    public static void main(String[] args) {

        try {
            System.out.println("Enter the number of soldiers : ");
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            int s = Integer.parseInt(bufferRead.readLine());
            int result = func(s);
            System.out.println("The space number he has to stand is : " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected static int func(int x){
       int i = 0;
       while ((x - ((int)Math.pow(2, i))) >= 0)
            i++;
       int result = (x - (int)Math.pow(2, i - 1)) * 2 + 1;
       return result;
    }
}
