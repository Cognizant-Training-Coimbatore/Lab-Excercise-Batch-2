
public class program_lstset_1q_accept_posint 
{
	static void checknumber(int num)
	{
		if(num>0)
		{
			System.out.println("The number is accepted");
			
		}
		else
		{
			throw new ArithmeticException("The number cannot be accepted");
			
		}
	}
	public static void main(String[] args)
	{
		checknumber(4);
		checknumber(6);
		checknumber(-3);
	}
}

		
		
		
		// TODO Auto-generated method stub

	


