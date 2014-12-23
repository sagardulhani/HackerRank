package practise;

import java.util.Random;

public class MergeSort {
	public static void main(String args[]){
		int array[] = new int[10];
		 for(int i=0;i<10;i++){
			 Random randomGenerator = new Random();
			 array[i]=randomGenerator.nextInt(100);
			 System.out.println(array[i]);
		 }
		 
		int[] sortedArray =  Sort(array,0,array.length-1);
		
		System.out.println("After Sort:");
		for(int i=0;i<10;i++){
			 
			 System.out.println(sortedArray[i]);
		 }
		
	}
	
	static int[] Sort(int[] array,int start,int end){
		if(start<end){
			System.out.println(":::" + start);
			int mid= (end + start)/2;
			int array1[] = Sort(array,start,mid);
			int array2[] = Sort(array,mid+1,end);
			array = Merge(array1, array2,start,mid,end);
		}
		return array;
	}
	
	
	static int[] Merge(int[] array1,int[] array2, int start, int mid, int end){
		int sortedArray[] = new int[10];
		int i = start;
		int j = mid+1;
		int k = 0;
		
		while(i<mid && j<end){
			if(array1[i]<=array2[j])
			{
				sortedArray[k]=array1[i];
				i++;
				k++;
			}
			else if(array1[i]>array2[j]){
				sortedArray[k]=array2[j];
				j++;
				k++;
			}
			
		}
		while(i<mid){
			sortedArray[k] = array1[i];
			i++;
			k++;
		}
		while(j<end){
			sortedArray[k] = array2[j];
			j++;
			k++;
		}
		
		return sortedArray;
	}

}
