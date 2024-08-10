package FrequentlyAskedJavaInterviewQuestions;

public class DublicateElementInarray {

	public static void main(String[] args) {

		String name [] = { "java","python","c", "ruby","java","java"};
		
		// compare each element --o(n*n)  worst solution
		for(int i=0; i<name.length; i++) {
			for(int j= i+1; j<name.length; j++) {
			if(name[i].equals(name[j])) {
				
				System.out.println("duplicate of the element is::" +name[i]);
			}
		}
	// using hashset java collection it stores unique value
			
			

			
			
		
	}

	}
}
