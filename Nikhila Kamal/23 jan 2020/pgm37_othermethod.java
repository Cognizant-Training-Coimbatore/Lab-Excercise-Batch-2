import java.util.Scanner;

class arithm
{
	int res;
	void add(int x,int y)
	{
		res=x+y;
	}
	void sub(int x,int y)
	{
		res=x-y;
	}
	void mul(int x,int y)
	{
		res=x*y;
		
	}
	void div(int x,int y)
	{
		res=x/y;
	}
	void display()
	{
		
	
	System.out.println(res);
	}

}

public class pgm37_othermethod {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		System.out.println("enter second number");
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		arithm obj=new arithm();
		obj.add(w,z);
		obj.display();
		obj.sub(w, z);
		obj.display();
		obj.mul(w, z);
		obj.display();
		obj.div(w, z);
		obj.display();
		

	}

}
