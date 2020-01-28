class test1
{
	int a,b;
    test1()
	{
		a=15;
		b=35;
	}
	void dispaly()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class program30_constructors {

	public static void main(String[] args) 
	{
		test1 obj= new test1();
		obj.dispaly();
		
	}

}
