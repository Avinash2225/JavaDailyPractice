package FrequentlyAskedJavaInterviewQuestions;

public class SortAnArray1026 {

	public static void main(String[] args) {

		int arr [] = {3,5,7,9,12};
		
		int largest = arr[0];
		
		for (int i=0; i<=arr.length-1; i++){
			
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
		
		
		
	}

}
