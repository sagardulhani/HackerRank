package practise;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Wrapper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
    	long wrap;
    	long no;
    	no = N/C;
        wrap = N/C;
        while(wrap>=M){
        no = no + wrap/M;
        wrap=wrap/M + wrap%M;
        }
        return(no); 
        //Write code to solve each of the test over here
    }
    
    
}

