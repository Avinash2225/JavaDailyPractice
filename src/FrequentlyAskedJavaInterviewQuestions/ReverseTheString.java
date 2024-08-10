package FrequentlyAskedJavaInterviewQuestions;

// Reverse the string 
// Difference between String and string buffer
// we do have reverse function in the string  ans no 

//    1st method 
public class ReverseTheString {

	public static void main(String[] args) { 
		String s = "There is not water present";
		//String s = "My Name is Avinash";
		int l = s.length(); 
		 String rev = "";          
		for(int i=l-1; i>=0; i--) {  
			rev = rev + s.charAt(i);
			
		}
		 System.out.println(rev);
		 
	}

}

// 2nd method by using string buffer

//StringBuffer sf = new StringBuffer(s);
//System.out.println(sf.reverse());
//}
//}