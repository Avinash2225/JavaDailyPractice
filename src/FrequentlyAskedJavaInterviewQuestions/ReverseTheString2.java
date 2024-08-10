package FrequentlyAskedJavaInterviewQuestions;

public class ReverseTheString2 {

	public static void main(String[] args) {

		String s = "MADAM";
		String rev = "";
		for(int i=4; i>=0; i--) {
	  	rev = rev + s.charAt(i);
		}
	//	System.out.println("Reverse of the String is:" + rev);
		if (rev== s) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
		
	
	}

}
