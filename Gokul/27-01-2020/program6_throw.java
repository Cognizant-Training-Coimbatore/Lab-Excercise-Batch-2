

public class program6_throw {
	static void check(int age)throws ArithmeticException
	{
		if(age>=0 && age<=14)
			System.out.println("The person is a child");
			else if(age>=14 && age<=140)
				System.out.println("The person is an adult");
			else
				throw new ArithmeticException("not valid");
				
				
			
		
	}

}

	public static void main(String[] args) 
	{

		try
		{
			check(13);
			
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}

}
	
	