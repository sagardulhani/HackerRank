package practise;

public class Test {

	public static void main() {
	    int total = 0;
	    int n0 = 0;
	    int n1 = 1;
	    int n2;
	    while ( total < 4000000 ) {
	        n2 = n1;
	        n1 = n0 + n1;
	        n0 = n2;
	        if ( n1 % 2 == 0 ) {
	            total = total + n1;
	        }
	    }
	    System.out.println( total );
	}
}
