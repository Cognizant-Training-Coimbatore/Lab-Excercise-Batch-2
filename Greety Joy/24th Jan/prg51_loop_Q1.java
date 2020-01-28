import java.util.Scanner;

class print22
{
//int a,b,i;


	
	void display( int a, int b)
	{
		int i;
		for(i=a;i<=b;i++)
		{
			System.out.println(i);
		}
		
	}
	


}

public class prg51_loop_Q1 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		print22 obj=new print22();
		obj.display(a,b);
		

	}

}
