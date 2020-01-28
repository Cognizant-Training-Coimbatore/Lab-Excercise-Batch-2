class a
{
	int x=10;
}
class b extends  a
{
	int y=10;
}
class inherit extends b
{
	void display()
	{
		System.out.println(x+y);
	}
}
public class exercise1_Q1 
{

	public static void main(String[] args) 
	{
		inherit obj = new inherit();
		obj.display();

	}

}
