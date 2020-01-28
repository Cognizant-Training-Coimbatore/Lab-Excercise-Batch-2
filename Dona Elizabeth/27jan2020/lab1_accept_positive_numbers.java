
public class lab1_accept_positive_numbers {
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
		pos(5);
		pos(-5);
		
	}

}
