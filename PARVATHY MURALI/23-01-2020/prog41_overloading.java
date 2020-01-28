class overloading
{
	void display(int x, char c)
	{
		System.out.println(x+" "+c);
	}
	void display(char c, int x)
	{
		System.out.println(c+" "+x);
	}
}
public class prog41_overloading 
{

	public static void main(String[] args)
	{
		overloading ob=new overloading();
		ob.display(3,'c');
		ob.display('c', 3);
		
		

	}

}
