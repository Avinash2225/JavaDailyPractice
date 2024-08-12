package AssignmentsATB;

public class StringOutOfBound {

	public static void main(String[] args) {
try {
		String s = "Avinash";
		String rev = "";
		for(int i=8; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println("rev of the string:"+ rev);
}
	catch (StringIndexOutOfBoundsException g1) {
	System.out.println("Please Enter correct value of the i");	
	}	
		
		
		
	}

}
