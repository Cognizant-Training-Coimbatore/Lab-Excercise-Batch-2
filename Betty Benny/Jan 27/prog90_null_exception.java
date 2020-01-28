
public class prog90_null_exception {

	public static void main(String[] args) 
	{
	
		try
		{
			String str=null;
			System.out.println("Entered string length is : "+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception caught...");
		}
		
	}

}
