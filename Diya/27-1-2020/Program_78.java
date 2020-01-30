
public class Program_78 {
	static void validate (int Age)throws myexceptions
	{
		if(Age<18)
			throw new myexceptions("not valid");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}
		

	}

}
