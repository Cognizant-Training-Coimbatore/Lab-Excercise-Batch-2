
public class prog49 {
	static void checkeligibility(int a)
	{
		if(a>20 && a<60)
		{
			System.out.println("valid");
		}
		else
		{
			throw new ArithmeticException("not valid");
		}
	}

	public static void main(String[] args) {
		checkeligibility(45);
		checkeligibility(70);
		

	}

}
