package FrequentlyAskedJavaInterviewQuestions;

public class ReverseString2 {

	public static void main(String[] args) {

		String s = "RADAR";
		String rev = "";
		String old = s;
		for(int i= s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println("reverse of the String:" + rev);
		if(old.equals(rev)) {
			System.out.println("string is a palindrome");

		}else {
			System.out.println("String is not a palindrome");

		}
		
		
		
		
		
	}

}
