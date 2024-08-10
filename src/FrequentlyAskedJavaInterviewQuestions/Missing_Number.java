package FrequentlyAskedJavaInterviewQuestions;

public class Missing_Number {

	public static void main(String[] args) {

		int  a [] = {1,2,3,4,5,6,7,9};
		
		// logic of this program in the mathematics
		// add numbers 1+2+4+5=12
		// minus missing add 1+2+3+4+5=15
		// 15-12=3
		int sum =0;
		for(int i=0; i<a.length;i++) {
			sum = sum + a[i];
			
		}
		System.out.println(sum);
		int sum1=0;

		for(int j=1; j<=9; j++) {
			sum1= sum1 + j;
			}
	System.out.println(sum1);
	System.out.println("missing number is:" + (sum1-sum));
	
	}

}
