package FrequentlyAskedJavaInterviewQuestions;

public class SumOfD {

	public static void main(String[] args) {

		int num = 12345;
		int sum =0;
		
		while (num>0) {
			
			int rit = num%10;
			sum = sum +=rit;
			
			num = num/10;

		}
		
		System.out.println(sum)	;	
	}

}
