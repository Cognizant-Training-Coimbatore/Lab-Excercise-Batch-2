
public class program84_claaasss {
	static void validate(int age) throws myexceptions
	{
		if (age<18)
			throw new myexceptions("not valid");
		else
			System.out.println("Welcome");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(13);
		}
catch(Exception m)
		{
	System.out.println("Exception Occured:" +m);
		}
	}

}
