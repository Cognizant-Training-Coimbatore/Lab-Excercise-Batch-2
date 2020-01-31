package exceptionhandling;

public class pgm07_27_ext02
{
	static void validate(int age)throws pgm07_27_extending_exc
	{
		if(age<18)
		{
			throw new pgm07_27_extending_exc("Not valid...");
		}
		else
		{
			System.out.println("Eligible for voting...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Error encounterd..."+m);
		}
	}

}
