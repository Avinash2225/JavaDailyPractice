package FrequentlyAskedJavaInterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {            // from here to 
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();  // 121   
	// int org_num = num;
	int rev = 0;
	while (num!=0) {
		rev = rev *10 +num%10;   // 0*10+1234%10  
		num = num/10;
	}                                                  // here this program is for reverse the number

	System.out.println("reverse of the number is:" + rev);
//	if(org_num == num) {
//		System.out.println("original number is palindrome");
//	}else {
//		System.out.println("original number is not palindrome");

	}
	}


