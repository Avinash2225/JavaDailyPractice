package Chapter5;

public class StarPatternWhileLoop {

	public static void main(String[] args) {
int n=4;
int i =n;
while (i>0) {
	int j=0;
	while(j<i) {
		j++;
		System.out.print("*");
	}
	System.out.println("\n");
	i--;
}
	}

}
