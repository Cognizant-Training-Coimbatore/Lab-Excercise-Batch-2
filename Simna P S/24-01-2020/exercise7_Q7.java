class program
{
	static int a=10;
	static int b=10;
	int c=10, d=10;
	static void sum()
	{
		int sum=a+b;
		a=a+10;
		b=b+10;
		System.out.println(sum);
	}
	void nosum()
	{
		int sum=c+d;
		c=c+10;
		d=d+10;
		System.out.println(sum);
	}
}
public class exercise7_Q7 {

	public static void main(String[] args) {
		program obj = new program();	
		program obj1 = new program();	
		program obj2 = new program();	
		program obj3 = new program();	
		System.out.println("Not Static");
		obj.nosum();
		obj1.nosum();
		System.out.println("\n"+ obj.c +" " + obj.d);
		
		System.out.println("Static using class name");
		program.sum();
		program.sum();
		System.out.println("\n"+program.a +" " +program.b);
		
		System.out.println("Static using object");
		obj2.sum();
		obj3.sum();
		System.out.println("\n"+ obj2.a +" " + obj2.b);

	}

}
