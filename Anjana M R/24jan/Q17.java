class stats
{
	static int a=10;
	static int b=110;
	int c=10,d=10;
	static void  sum()
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
public class Q17 {

	public static void main(String[] args) {
stats obj1=new stats();
stats obj2=new stats();
stats obj3=new stats();
stats obj4=new stats();
System.out.println("not static");
obj1.nosum();
obj2.nosum();
System.out.println("\n"+obj1.c+""+obj1.d);
System.out.println("static using class name");
stats.sum();
stats.sum();
System.out.println("\n"+stats.a+""+stats.b);
System.out.println("Static usimg object");
obj3.sum();
obj4.sum();
System.out.println("\n"+obj3.a+""+obj4.b);
	}

}
