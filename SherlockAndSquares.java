package practise;

import java.util.*;


public class SherlockAndSquares {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        for(int i=0;i<t;i++){
            String input = s.nextLine();
            long a = Integer.parseInt(input.split(" ")[0]);
            long b = Integer.parseInt(input.split(" ")[1]);
            int a1 = (int)Math.sqrt(a);
            int b1 = (int)Math.sqrt(b);
            int count = 0;
            
            if(a==a1*a1)
                count++;
            
            for(int j=a1+1;j<=b1;j++){
                count++;
            }
            
            
                System.out.println(count);
        }
    }
}