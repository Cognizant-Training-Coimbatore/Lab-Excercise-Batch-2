
public class program_error {

	public static void main(String[] args) 
	{
	try
	{
		int a=10,b=5,c=6;
		int result;
		result=a/(b-c);
		
	}
	catch(Exception er)
	{
		System.out.println("Error in the code" +er);
	}

	
	System.out.println("out of the block.....");

}
}

