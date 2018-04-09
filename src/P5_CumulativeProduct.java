import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		System.out.print( "How many nymbers will you multiply? ");
		int x = input.nextInt();
	
		int product = 1;
		
		for(int i = 0; i < x; i++) {
			System.out.print( "Enter number " + (i + 1) + ": " );
			int n = input.nextInt();
			product *= n;
		}
		
		input.close();
		System.out.println("The final product is " + product);
	}

}
