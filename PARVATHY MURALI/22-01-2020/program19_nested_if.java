
public class program19_nested_if 
{

	public static void main(String[] args) 
	{
		int x=5, y=100;
		if(x>0)
		{
			if(x>99)
			{
				System.out.println(x+" is positive and is more than or equal to 100 ");
			}
			else
			{
				System.out.println(x+" is positive but less than 100 ");
			}
		}
		else
		{
			System.out.println(x+" is negative ");
		}

	}

}
