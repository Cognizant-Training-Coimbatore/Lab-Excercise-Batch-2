import java.util.Scanner;

public class prgm19_countodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int a1 = sc.nextInt();
		System.out.println("Enter a number");
		int a2 = sc.nextInt();
		System.out.println("Enter a number");
		int a3 = sc.nextInt();
		System.out.println("Enter a number");
		int a4 = sc.nextInt();
		
if(a%2==0)
{
	a=0;
}if(a1%2==0)
{
	a1=0;
}if(a2%2==0)
{
	a2=0;
}if(a3%2==0)
{
	a3=0;
}if(a4%2==0)
{
	a4=0;
}
int sum = a + a1 + a2 + a3 + a4;
System.out.println(sum);

}}
