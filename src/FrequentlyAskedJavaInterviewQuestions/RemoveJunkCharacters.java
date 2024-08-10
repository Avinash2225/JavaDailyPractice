package FrequentlyAskedJavaInterviewQuestions;

public class RemoveJunkCharacters {

	public static void main(String[] args) {

	//	String s= "@#@#!testing @#@#! selinium @#@##& java";
//	s=	s.replaceAll("[^a-z A-Z 0-9^]", "");
	String s= "@#&Testing is the#@#!$$% important#@$% part of the @#$development";	
	s= s.replaceAll("[^a-z A-Z 0-9^]", "");
	System.out.println(s);
		
	}

}
