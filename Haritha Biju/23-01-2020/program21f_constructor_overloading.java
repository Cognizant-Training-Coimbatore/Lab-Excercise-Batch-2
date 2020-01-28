package demo;
class disp
{	
	disp()
	{
		System.out.println("Constructor without argument");
	}
	disp(int a)
	{
		System.out.println("Constructor with the integer argument "+a);
	}
	disp(double a)
	{
		System.out.println("Constructor with the argument "+a);
	}
	disp(int a,int b)
	{
		System.out.println("Constructor with the arguments "+a+" "+b );
	}
	
}
public class program21f_constructor_overloading 
{

	public static void main(String[] args) 
	{
		disp obj=new disp();
		disp obj2=new disp(2);
		disp obj3=new disp(2.00);
		disp obj4=new disp(2,4);
		
	}

}


