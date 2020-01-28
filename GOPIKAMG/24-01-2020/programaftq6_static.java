class person
{
	  int a=0;
	static int b=10;
	static void increment()
	{
		b++;
	}
	void display()
	{
		System.out.println("value of b "+b);
		System.out.println("value of a " +a);
	}
}
public class programaftq6_static {

	public static void main(String[] args)
	{
	person p=new person();
	p.display();
	p.b++;
	p.display();

	}

}
