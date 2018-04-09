/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

/*
3. What problems did you identify in the sumTo method below?

 	I remove the sum integer definition from inside the loop to outside the loop. 
 	Also added a return value for the method sumTo.

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) {    
		
		int sum = 0; 
	   
		for (int i = 1; i <= n; i++) { 
	        sum += i;
	    }
		
		return sum;
	}

}
