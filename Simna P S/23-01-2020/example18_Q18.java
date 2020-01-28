class programming
{
	String name;
	programming()
	{
		System.out.println("I love programming languages.");
	}
	programming(String s)
	{
		name=s;
		System.out.println("I love "+name+ ".");
	}
}
public class example18_Q18 
{

	public static void main(String[] args) 
	{
		programming obj1 = new programming();
		programming obj2 = new programming("Java");

	}

}
