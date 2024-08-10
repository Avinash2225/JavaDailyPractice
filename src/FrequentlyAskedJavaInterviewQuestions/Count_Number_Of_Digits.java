package FrequentlyAskedJavaInterviewQuestions;

public class Count_Number_Of_Digits {

	public static void main(String[] args) {
long a = 123456784;
long num= 0;
while(a>0) {
	a = a/10;
	num++;
}
	System.out.println(num);
		
	}
}
