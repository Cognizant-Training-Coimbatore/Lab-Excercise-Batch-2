class overloading
{
	void display(int n,char c)
	{
		System.out.println("the stmt is "+n+c);
	}
	void display(char c,int n)
	{
		System.out.println("the stmt is " +c+n);
	}
}
public class programq9_overloading {

	public static void main(String[] args)
	{
		overloading obj1=new overloading();
		overloading obj2=new overloading();
		obj1.display(10, 'c');
		obj2.display('c', 10);

	}

}
