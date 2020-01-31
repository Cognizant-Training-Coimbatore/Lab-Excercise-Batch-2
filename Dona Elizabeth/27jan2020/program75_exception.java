
public class program75_exception {

	public static void main(String[] args) {
		try
		{
			int a=9,b=4,c=4;
			int result;
			result=a/(b-c);
		}
		catch (Exception e)
		{
			System.out.println("Error in code : "+e);
		}
		System.out.println("Out of block");
	}

}
