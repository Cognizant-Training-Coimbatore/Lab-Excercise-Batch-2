import java.util.Scanner;

class proper{
	
	int a,b,i,j;
	void z()
	{
		System.out.println("enter a value");
	Scanner sc =new Scanner(System.in);
	a= sc.nextInt();
	System.out.println("enter b value");
	Scanner sc1 =new Scanner (System.in);
	b= sc1.nextInt();
	}
	void display() {
		if(a>b)
		{
			for(i=b+1;i<a;i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			for(j=a+1;j<b;j++)
			{
				System.out.println(j);
			}
		}
	}
}

public class integer_proper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proper obj=new proper();
		obj.z();
		obj.display();
		
	}

}
