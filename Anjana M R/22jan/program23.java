import java.util.Scanner;

public class program23 {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1");
		n1=sc.nextInt();
		System.out.println("Enter number2");
		n2=sc.nextInt();
		System.out.println("Enter number3");
		n3=sc.nextInt();
		System.out.println("Enter number4");
		n4=sc.nextInt();
		System.out.println("Enter number5");
		n5=sc.nextInt();
		if(n1%2!=0)
		{
			s++;
		}
		if(n2%2!=0)
		{
			s++;
		}
		if(n3%2!=0)
		{
			s++;
		}
		if(n4%2!=0)
		{
			s++;
		}
		if(n5%2!=0)
		{
			s++;
		}
		
		System.out.println("Odd numbers="+s);
	}

}
