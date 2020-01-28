import java.util.Scanner;

class z1
{
	int n;
	int a;
	int b;
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		for(n=a;n<=b;n++)
		{
			System.out.println(+n);
		}
		
	}
}
public class program_qs1 {

	public static void main(String[] args) {
		z1 obj=new z1();
		obj.display();
		// TODO Auto-generated method stub

	}

}
