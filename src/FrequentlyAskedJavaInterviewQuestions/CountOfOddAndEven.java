package FrequentlyAskedJavaInterviewQuestions;

public class CountOfOddAndEven {

	public static void main(String[] args) {

		
		int num= 1234567811;
		int even = 0;
		int odd = 0;
		while(num>0) {
			int rem = num%10;
		if(rem%2==0) {
			even++;
		}else {
			odd++;
		}
		
		num =num/10;
		}
		System.out.println("no of the even count:"+even);	
		System.out.println("no of the odd count:"+
		odd);	
		
	}

}
