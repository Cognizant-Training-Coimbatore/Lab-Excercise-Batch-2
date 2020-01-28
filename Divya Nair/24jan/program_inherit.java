class a
{
	int x=5;
}
class b extends a
{
	int y=10;
}
class inherit extends b
{
	int c=x+y;
	void display()
	{
		System.out.println("The result is:"+c);
	}
}
public class program_inherit {

	public static void main(String[] args) 
	{
		inherit obj=new inherit();
		obj.display();

	}

}
