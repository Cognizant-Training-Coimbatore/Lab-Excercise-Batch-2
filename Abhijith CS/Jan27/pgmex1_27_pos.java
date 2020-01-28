package exceptionhandling;

public class pgmex1_27_pos 
{
	static void pos(int num)
	{
		if (num>0)
		{
			System.out.println("Number is valid");
		}
		else
		{
			throw new ArithmeticException("Negatives and zeroes are not acceptable");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pos(5);
		pos(-5);
	}

}
