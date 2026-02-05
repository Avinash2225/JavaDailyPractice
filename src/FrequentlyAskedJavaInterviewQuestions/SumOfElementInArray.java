package FrequentlyAskedJavaInterviewQuestions;

public class SumOfElementInArray {

	public static void main(String[] args) {

		int Arr [] = {2,4,7,6};
		int sum =0;
		
		for ( int i=0; i<=Arr.length-1; i++) {
			
			
			sum = sum + Arr[i];
			
		}
	System.out.println("sum of the elements in array is:"+ sum);	
	
	}
	

}
