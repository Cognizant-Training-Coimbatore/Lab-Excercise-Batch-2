class s
{
	int a=2;
}
class s2 extends s
{
	int b=7;
	void display()
	{
		System.out.println(a+b);
	}
}
class s3 extends s
{
	int c=5;
	void display()
	{
	System.out.println(a+c);
	}
}
class s4 extends s
{
	int d=10;
	void display()
	{
		System.out.println(a+d);
	}
}
public class program_heirarchical_inheritence {

	public static void main(String[] args)
	{
		
		s2 obj1=new s2();
		obj1.display();
		s3 obj2=new s3();
		obj2.display();
		s4 obj3=new s4();
		obj3.display();
		
		

	}

}
