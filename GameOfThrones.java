package practise;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
		char[] charArray = inputString.toCharArray();
		String ans;
		int i,j;
		ans="YES";
		int flag=0;
		int count=1;
		for(i=0;i<inputString.length()-1;i++)
		{
			if(charArray[i] != '0')
			{
				count=1;
				for(j=i+1;j<inputString.length();j++){
					if(charArray[i]==charArray[j]){
						count++;
						charArray[j]='0';
					}

				}

				if(count%2==0)
				{
					count=0;
					continue;
				}
				else{
					if(flag==1)
					{
						ans="NO";
						break;
					}

					flag=1;
				}
			}
		}
		// Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
		System.out.println(ans);
		myScan.close();
	}
}

