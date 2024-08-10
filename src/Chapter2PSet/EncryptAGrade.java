package Chapter2PSet;

public class EncryptAGrade {

public static void main(String[] args) {

	char grade = 'B';
	grade =    (char) (grade + 8);
	System.out.println(grade);
	
	// Decrypt the grade
	grade =    (char) (grade - 8);
	System.out.println(grade);
	
	}
}


