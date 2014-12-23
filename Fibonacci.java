package practise;

public class Fibonacci {

	public static void main(String[] args){
		int fib1=1;
		int fib2=2;
		int sum=0;
		int temp;
		int temp1=0;
		int temp2=0;
		while(sum<4000000){
			
			if(temp1>0 && temp2 > 0)
			{
				sum=sum+temp1+temp2;
				temp1=0;
				temp2=0;
			}
			
			temp=fib1;
			fib1=fib2;
			fib2=temp+fib2;

			if(temp1>0 && fib1%2==0)
			{
				temp2=fib1;
				
			}
			if(fib1%2==0){
				temp1=fib1;
			}
			
		}
		System.out.print("ans: " + sum);
	}
}
