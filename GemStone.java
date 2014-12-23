package practise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
       HashSet<Character> first = new HashSet<Character>();
       HashSet<Character> second = new HashSet<Character>();
       int i=0;
       char temp = 'a';
       for(temp='a';temp<='z';temp++){
    	   first.add(temp);
       }
       int j;
       while(i<N){
    	   second.clear();
    	   char[] stringArray = in.nextLine().toCharArray();
    	   for(j=0;j<stringArray.length;j++){
    		 second.add(stringArray[j]);  
    	   }
    	   first.retainAll(second);
    	   i++;
       }
        System.out.println(first.size());
    }
}
