package practise;

import java.util.Scanner;

public class BloomFibN {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i;
		int n = Integer.parseInt(in.nextLine());
		int array[];
		array = new int[1000];
		for(i=0;i<n;i++){
			array[i]=1;
		}
		int j;
		for(i=0;i<20;i++){
			for(j=i;j<i+n;j++){
				array[n+i]=array[n+i] + array[j];
			}
		}
		for(i=0;i<20;i++){
			System.out.print(array[i] + " ");
		}
	}

}
