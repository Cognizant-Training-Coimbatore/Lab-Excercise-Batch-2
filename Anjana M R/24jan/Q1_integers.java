import java.util.Scanner;
class val
{
	void display(int a,int b)
	{
	for(int i=a;i<b;i++)
	{
		System.out.println(i);
	}
	}
}

public class Q1_integers {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the start value");
int n=sc.nextInt();
System.out.println("Enter the end value");
int m=sc.nextInt();
val obj=new val();
obj.display(n,m);
	}

}
