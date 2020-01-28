package demo;

class stat
{
	static int a=100;
	static int b=100;
	int c=10, d=100;
	static void sum()
	{
		int sum=a+b;
		a=a+100;
		b=b+100;
		System.out.println(sum);
	}
	void nosum()
	{
		int sum=c+d;
		c=c+100;
		d=d+100;
		System.out.println(sum);
	}
}
public class program_28_f_static2 
{

	public static void main(String[] args) 
	{
		
		stat obj = new stat();	
		stat obj1 = new stat();	
		stat obj2 = new stat();	
		stat obj3 = new stat();	
		System.out.println("Not Static");
		obj.nosum();
		obj1.nosum();
		System.out.println("\n"+ obj.c +" " + obj.d);
		
		System.out.println("Static using class name");
		stat.sum();
		stat.sum();
		System.out.println("\n"+ stat.a +" " + stat.b);
		
		System.out.println("Static using object");
		obj2.sum();
		obj3.sum();
		System.out.println("\n"+ obj2.a +" " + obj2.b);
	}

}