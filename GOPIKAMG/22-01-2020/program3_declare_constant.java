
public class program3_declare_constant 
{

	public static void main(String[] args)
	{
		int x=10;
		x=20;
		final int y=100;
		y=200;//error comes as y cannot change the value
		System.out.println("the value of y is "+y);

	}

}
