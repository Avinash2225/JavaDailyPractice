package PracticeChapter4;

import java.util.Scanner;

public class Probleum2 {

	public static void main(String[] args) {
int m1, m2, m3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Physics marks");
m1 = sc.nextInt();

System.out.println("Enter the Chemistry marks");
m2 = sc.nextInt();

System.out.println("Enter the biology marks");
m3 = sc.nextInt();





float avg  = (m1+ m2+ m3)/3.0f;
//System.out.println("your overall percentage is:" + avg);
if( avg>=40 && m1>=33 && m2>=33 && m3>=33) {
	
	System.out.println("Student is pass");
}else {
	System.out.println("student is fail");
}
System.out.println(avg);
		
	}

}
