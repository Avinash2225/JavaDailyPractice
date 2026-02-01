package Day2;

public class CountOddAndEven1 {
public static void main(String[] args) {

		int num = 1234568786;
		int Even = 0;
		int odd =0;
		
		while(num>0) {
	int rem = num%10;
			if(rem%2==0) {
				Even++;
			}else {
				odd++;
			}
			num = num/10;	
		}
		
		System.out.println("count of the Even no is:" + Even);
		System.out.println("count of the odd no is:" + odd);

		}

}
