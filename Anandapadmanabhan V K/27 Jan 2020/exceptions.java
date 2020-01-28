
public class exceptions {
	static void validate(int age)throws myexceptions
	{
		if(age<18)
			throw new myexceptions("not valid");
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
			System.out.println("Exception occurred:" + m);
		}
	}

}
