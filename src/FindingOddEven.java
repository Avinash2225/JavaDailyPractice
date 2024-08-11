
public class FindingOddEven {

	public static void main(String[] args) {

		int num = 123456;
		int even =0;
		int odd= 0;
		
		while(num>0) {
			
			int rem = num%10;
			
		
		if(num%2==0) {
			even++;
		}else {
			odd++;
			
		}
		num = num /10;
		}
		
		System.out.println("number of even number is:" +even);
		System.out.println("number of odd number is:" +odd);

		
		
		
	}

}
