public class prob6 {

	static void validate(int num)throws myexceptions
	{
		if(num<0)
		throw new myexceptions("not valid");
		else
			System.out.println("Welcome to vote");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(-23);
		}
		catch(Exception m) {
			System.out.println("Exception occured: "+m);
		}

	}

}