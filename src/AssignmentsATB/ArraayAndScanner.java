package AssignmentsATB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraayAndScanner {

	public static void main(String[] args) {
System.out.println("Enter the size of an Array");

try {
		Scanner s1 = new Scanner(System.in);
		 
		int num = s1.nextInt()	;
		
		int num1 [] = new int [4];
		
		for(int i=0; i<num; i++) {
			num1[i] = i +10;
		}
		
		System.out.println("Attempting to access out of bound index");
		System.out.println(num1[num]);
}

catch( InputMismatchException a3) {
	System.out.println("please Enter Correct input");
}
catch(ArrayIndexOutOfBoundsException e1) {
	System.out.println("Please Enter your input in size of the array");
}

		
		
	}

}
