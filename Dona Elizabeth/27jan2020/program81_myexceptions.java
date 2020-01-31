
public class program81_myexceptions {
	static void validate(int age)throws myexceptions
	{
		if(age<18)
		{
			throw new myexceptions("Not valid");
		}
		else
		{
			System.out.println("Welcome!!!");
		}
	}

	public static void main(String[] args) {
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception : "+m);
		}
	}

}
