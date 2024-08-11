import java.lang.reflect.Array;
import java.util.Arrays;

public class InputArray {
	//The Array.toString() method in Java is a way to convert an array into a readable string format. 
	//This method is part of the Arrays class in the java.util package, 
	//and it's especially useful when you want to print the 
	//contents of an array for debugging or display purposes.

	public static void main(String[] args) {

		String input = "Shimla is 120";
		char a1 [] = input.toCharArray();
	//	System.out.println(Arrays.toString(a1));
		
	//	String input1 = "Deoria is 1800";
	//	char c2 [] = input.toCharArray();
		
	//	System.out.println(Arrays.toString(c2));   // Arrays.toString() method converts the array into a human-readable string that shows all the elements.

	/*	System.out.println("finding out the alphabet");
		for(int i=0; i<input.length(); i++) {
			boolean b1 = Character.isAlphabetic(a1[i]);
			System.out.println(b1);

		} */ 
       System.out.println("finding out numeric");
       for(int i=0; i<input.length(); i++) {
    	   boolean b2 = Character.isDigit(a1[i]);
    	   System.out.println(b2);
       }
		
		
	}

}
