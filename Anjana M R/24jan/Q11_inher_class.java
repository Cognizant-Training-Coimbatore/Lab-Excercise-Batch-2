import java.util.Scanner;
class a
{
	
	void display1(int a1)
	{
		System.out.println("roll no"+a1);
	}
}
	class b extends a
	{
		void display2(int b1)
		{
			System.out.println("mark in percentage"+b1);
		}
	}

public class Q11_inher_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int m=sc.nextInt();
		System.out.println("enter mark");
		int n=sc.nextInt();
		b obj=new b();
		obj.display1(m);
		obj.display2(n);
		
	

	}

}
