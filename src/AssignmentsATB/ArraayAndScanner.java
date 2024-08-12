package AssignmentsATB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraayAndScanner {

	public static void main(String[] args) {
System.out.println("Enter the size of an Array");

try {
		Scanner s1 = new Scanner(System.in);
		 
		int num = s1.nextInt()	;
		
		System.out.println(num);
}
catch( InputMismatchException a3) {
	System.out.println("please Enter Correct input");
}


		
		
	}

}
