package practise;

import java.util.Random;

public class InsertionSort {

	public static void main(String args[]){
	int[] array= new int[10];
	int[] sortedArray= new int[10];
	Random randomGenerator = new Random();
	
	 for(int i=0;i<10;i++){
		 array[i]=randomGenerator.nextInt(100);
		 System.out.println(array[i]);
	 }
	 
	sortedArray = insertionSort(array);
	System.out.println("After Sort:");
	for(int i=0;i<10;i++){
		 
		 System.out.println(sortedArray[i]);
	 }
	}
	
	static int[] insertionSort(int[] array){
	int i=0, j=0;
	int temp;
		for(i=0;i<10;i++){
			for(j=i;j>0;j--){
				if(array[j-1]>array[j])
				{
					temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		
		return array;	
	}
	
}
