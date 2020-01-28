import java.util.Scanner;

public class program8_positive_neg {

	public static void main(String[] args) {
int a;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
if(a>0)
{
	System.out.println(a + " is positive");
}
else
{
	System.out.println(a + " is negative");
}
	}

}
