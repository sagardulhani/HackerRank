package practise;

public class Mulltipes {
	public static void main(String args[]){
		
		int i,sum=0;
		long startTime = System.nanoTime();
		for(i=1;i<1000;i++){
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("1st" + sum);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("1st time: " + totalTime);
		
		i=1;
		sum=0;
		startTime = System.nanoTime();
		while(3*i<1000)
		{
			sum=sum + 3*i;
			i++;
			//if((3*(i+1))>1000)
				//break;
		}
		i=1;
		while(5*i<1000){
			if(((5*i)%3)>0)
				sum=sum+5*i;
			i++;
			//if((5*(i+1))>1000)
				//break;
		}
		System.out.println("2nd: " + sum);
		endTime   = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("2nd time: " + totalTime);
	}

}
