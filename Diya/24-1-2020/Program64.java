class stat
{
	static int a=5;
	static int b=5;
	int c=10, d=10;
	static void sum1()
	{
		int sum1=a+b;
		a=a+5;
		b=b+5;
		System.out.println(sum1);
	}
	void sum2()
	{
		int sum2=c+d;
		c=c+10;
		d=d+10;
		System.out.println(sum2);
	}
}
public class Program64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		stat obj = new stat();	
		stat obj1 = new stat();	
		stat obj2 = new stat();	
		stat obj3 = new stat();	
		System.out.println("Not Static");
		obj.sum2();
		obj1.sum2();
		System.out.println("\n"+ obj.c +" " + obj.d);
		
		System.out.println("Static using class name");
		stat.sum1();
		stat.sum1();
		System.out.println("\n"+ stat.a +" " + stat.b);
		
		System.out.println("Static using object");
		obj2.sum1();
		obj3.sum1();
		System.out.println("\n"+ obj2.a +" " + obj2.b);
}
}