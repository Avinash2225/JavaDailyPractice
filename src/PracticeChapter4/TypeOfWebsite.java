package PracticeChapter4;

import java.util.Scanner;

public class TypeOfWebsite {

	public static void main(String[] args) {
		System.out.println("Enter the Website");
		Scanner sc = new Scanner(System.in);
		String web = sc.nextLine();
		
		
if(web.endsWith(".com")) {
	System.out.println("website is commercial website");
}else if(web.endsWith(".org")) {
	System.out.println("website is organizational");
}else if (web.endsWith(".in")) {
	System.out.println("website is indian website");
}
		
		
		
		
		
		
	}

}
