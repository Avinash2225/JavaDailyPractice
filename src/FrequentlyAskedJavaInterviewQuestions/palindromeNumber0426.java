package FrequentlyAskedJavaInterviewQuestions;

import java.util.Scanner;

public class palindromeNumber0426 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int orgnum = num;
		
		int rev =0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if( orgnum==num) {
			System.out.println("number is a palindrome");
		}else {
			System.out.println("number is not a palindome");
		}
		
		
		
		
	}

}
