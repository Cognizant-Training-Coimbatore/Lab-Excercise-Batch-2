 public class p75_ifelsethrow
{
	 static void checkeligibility(int Age)
	 {
	if (Age>20 && Age<60)
		{
			System.out.println("Student entry is valid");	
		}
	else
	{
		throw new ArithmeticException("Student is not eligible for registration");
		
	}
 

	 }
	public static void main(String[] args) 
	{
		checkeligibility(34);
		checkeligibility(15);
		checkeligibility(70);
		
	}

}
