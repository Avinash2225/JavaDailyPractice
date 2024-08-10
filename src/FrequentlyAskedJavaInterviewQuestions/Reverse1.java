package FrequentlyAskedJavaInterviewQuestions;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int org_num = num;  // for storing the variable
		int rev =0;
		while(num!=0) {
			rev = rev*10 +num%10;
			num = num/10;
			
		}
		//System.out.println("Revese of the number is " +rev);
			if(org_num == rev) {  // for checking the no is palindrome or not
			System.out.println("no is palindrome");
			}else {
				System.out.println("no is not a palindrome");
			}
		
	}

}
