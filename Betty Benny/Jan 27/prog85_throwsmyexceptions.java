
public class prog85_throwsmyexceptions 
{
	static void validate(int age)throws prog84_myexceptions
	
	{
		if(age<18)
			throw new prog84_myexceptions("not valid");
			
			else
				System.out.println("Welcome to vote");
		
	}

	public static void main(String[] args)
	{
		try
		{
			validate(13);
			
		}
		catch(Exception m)
		{
			System.out.println("Exception occures : " +m);
		}
		// TODO Auto-generated method stub

	}

}

