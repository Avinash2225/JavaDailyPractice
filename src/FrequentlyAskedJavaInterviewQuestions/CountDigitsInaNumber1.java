package FrequentlyAskedJavaInterviewQuestions;

public class CountDigitsInaNumber1 {

	public static void main(String[] args) {

		long num = 1234555222;
		long count =0;
		
		while(num>0) {
			
			num = num/10;
			count++;
		}
		
		System.out.println("no of the digits is equal to:"+ count);
		
		
	}

}
