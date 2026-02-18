package FrequentlyAskedJavaInterviewQuestions;

import java.util.Arrays;

public class SortAnArray1926 {

	public static void main(String[] args) {

		int a1 [] = {1,2,3,61,23,27,54,34};
		
		int a2 [] = {1,2,3,61,23,27,54};
		
		boolean status = Arrays.equals(a1, a2);
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Arrays are not equal");
		}
		
	}

}
