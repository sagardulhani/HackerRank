package practise;

import java.util.Scanner;

public class BloomNumSeries {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		int temp=0;
		while(N!=1){
			if(N%2==0){
				System.out.print(N + " ");
				temp=N;
				N=N/2;
				
			}
			else{
				System.out.print(N + " ");
				N=N+temp+1;
				
			}
		}
		System.out.print(N);
	}

}
