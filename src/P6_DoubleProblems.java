/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

/*
 * Question 6
 * 
 * The reason there is no output is because of rounding errors. 
 * When you multiply 3.2 * 3 in Java the answer is 9.600000000000001 
 * Which is not equal to 9.6
 * 
 * 
 */

public class P6_DoubleProblems {

	public static void main(String[] args) {
		double gpa = 3.2;
		
		if(Math.abs((gpa * 3) - 9.6 ) < 0.001 ) {
			System.out.println( "You earned enough credts");
		}
	}

}