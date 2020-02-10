import java.util.Scanner;

public class ex8_3integer {

	public static void main(String[] args) 
	{
		int n1,n2,n3;
		System.out.println("enter 1st no.");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("enter 2nd no.");
		n2=sc.nextInt();
		System.out.println("enter 3rd no.");
		n3=sc.nextInt();
		if(n2>n1&&n3>n2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
			}

		}
