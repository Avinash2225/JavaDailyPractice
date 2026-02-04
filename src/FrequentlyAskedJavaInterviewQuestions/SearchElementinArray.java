package FrequentlyAskedJavaInterviewQuestions;

public class SearchElementinArray {

	public static void main(String[] args) {

		int a [] = {10,20,30,40,50,60};
		
		int searchele = 20;
		
		boolean flag = false;
		
		for( int i=0; i<=a.length; i++){
			if(searchele==a[i]) {
				 flag = true;
					System.out.println("element is found:" + i);

				break;
				
				
			}

		}
		
		if(flag = false) {
			System.out.println("Element is not found");
		}
		
	}

}
