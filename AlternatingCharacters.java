package practise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {


	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        int i;
        String tempString ="";
        for(i=0;i<T;i++){
          
        	tempString = tempString + " " + in.nextLine(); 
          }
        tempString = tempString.trim();

        String[] stringArrays = tempString.split(" ");
       
        for(i=0;i<T;i++){
            String current=stringArrays[i];
            int j1=0;
            int j2=0;
            int count=0;
            for(j2=1;j2<current.length();j2++)
            {
                if(current.charAt(j1) == current.charAt(j2))
                    count++;
                j1++;
            }
            System.out.println(count);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}