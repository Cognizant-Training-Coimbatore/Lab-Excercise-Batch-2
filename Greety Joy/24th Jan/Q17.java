class pgm
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
public class question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		pgm obj = new pgm();	
		pgm obj1 = new pgm();	
		pgm obj2 = new pgm();	
		pgm obj3 = new pgm();	
		System.out.println("Not Static");
		obj.nosum();
		obj1.nosum();
		System.out.println("\n"+ obj.c +" " + obj.d);
		
		System.out.println("Static using class name");
		pgm.sum();
		pgm.sum();
		System.out.println("\n"+ pgm.a +" " + pgm.b);
		
		System.out.println("Static using object");
		obj2.sum();
		obj3.sum();
		System.out.println("\n"+ obj2.a +" " + obj2.b);
}
}
