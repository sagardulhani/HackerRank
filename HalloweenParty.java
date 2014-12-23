package practise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenParty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        int i;
        long array[];
        array =new long[10];
        for(i=0;i<T;i++){
            array[i] = Integer.parseInt(in.nextLine());
        }
        for(i=0;i<T;i++){
            if(array[i]%2==0)
                System.out.println((array[i]/2)*(array[i]/2));
            else
                System.out.println((array[i]/2)*(array[i]/2 +1));
        }
        
    }
}
