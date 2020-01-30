package demo;

class myException extends Exception
{
	myException(String S)
	{
		super(S);
	}
}

public class program38_myExceptions {
	
	static void validate(int age) throws myException
	{
		if(age<18)
			throw new myException("Not Valid");
		else
			throw new myException("Welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured " + m);
		}
	}

}
