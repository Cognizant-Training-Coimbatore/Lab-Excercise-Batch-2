
public class pgm30_exception2 {
	
	static void validate(int age)throws pgm30_custom_exc
	{
		if(age<18)
		throw new pgm30_custom_exc("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured" +m);
		}
	}

}
