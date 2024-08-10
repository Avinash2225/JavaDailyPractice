package FrequentlyAskedJavaInterviewQuestions;

public class ReverseTheInterger {

	public static void main(String[] args) {

	int num = 12345;
	int rev= 0;
	while(num!=0) {
		rev = rev*10 + num % 10; // 5432
		num = num/10;
	}
	System.out.println(rev);
	
	


// 2nd solution using String buffer reverse method
long num1 = 12345;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
}
}
