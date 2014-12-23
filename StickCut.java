package practise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StickCut {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int i;
        int arr[];
        arr = new int[N];
        String input="";
        input=in.nextLine();
        String[] array=input.split(" ");
        for(i=0;i<N;i++)
        {
        	arr[i]=Integer.parseInt(array[i]);
        }
        int min = 9999999;
        int count=99;
        while(count>0){
        	
        	min=999999;
        	for(i=0;i<N;i++)
            {
        		
            	if(arr[i]>0 && arr[i]<min)
            		min=arr[i];
            }
        	count=0;
        	for(i=0;i<N;i++){
        		if(arr[i]>0)
        		{
        			count++;
            		arr[i]=arr[i]-min;
        		}
        		else
        			arr[i]=-1;
        	}
        	if(count!=0)
        	System.out.println(count);
        }
    }
}
