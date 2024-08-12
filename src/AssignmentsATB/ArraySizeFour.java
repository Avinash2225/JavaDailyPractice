package AssignmentsATB;

public class ArraySizeFour {

	public static void main(String[] args) {

		int num [] = new int [5];
		try {
		num [0] = 55;
		
		 num [1] = 53;
			
		
		 num [2] = 52;
			
		 num [3] = 57;
			
		
		 num [4] = 58;
			
		 num [5] = 50;
	
		 System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException a2) {
			System.out.println("Array index out of bound exception you are try to access element out of bound");
			
		}
	}

}
