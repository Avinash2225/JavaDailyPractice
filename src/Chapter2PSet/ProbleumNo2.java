package Chapter2PSet;

import java.util.Scanner;

public class ProbleumNo2 {

	public static void main(String[] args) {
System.out.println("Enter the Subjects of the students");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the subject1 marks");
int sub1 = sc.nextInt();

System.out.println("Enter the subject2 marks");
int sub2 = sc.nextInt();

System.out.println("Enter the subject3 marks");
int sub3 = sc.nextInt();

System.out.println("Enter the subject4 marks");
int sub4 = sc.nextInt();

System.out.println("Enter the subject5 marks");
int sub5 = sc.nextInt();

double percentage = ((sub1+sub2+sub3+sub4+sub5)/500.0)*100;

System.out.println("percentage:" + percentage + "%");

sc.close();
	}

}
