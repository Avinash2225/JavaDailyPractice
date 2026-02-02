package FrequentlyAskedJavaInterviewQuestions;

public class Factorial0326 {

	public static void main(String[] args) {

		int num =8;
		long fact = 1;
		
		for( int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("factorial of a number is :"+ fact);
	}

}
