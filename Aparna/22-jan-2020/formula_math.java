import java.util.Scanner;

public class formula_math {

	public static void main(String[] args) {
		int a,b,c,i;
		System.out.println("enter the a value");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		
		System.out.println("enter the b value");
		Scanner scanner1=new Scanner(System.in);
		b=scanner.nextInt();
		c=a*a + 2*a*b+b*b;
		System.out.println("ansswer is" +c);

	}

}

