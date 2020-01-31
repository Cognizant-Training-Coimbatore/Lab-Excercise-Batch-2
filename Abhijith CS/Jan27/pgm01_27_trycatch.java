package exceptionhandling;

public class pgm01_27_trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=5,c=5;
			int result;
			result=a/(b-c);
		}
		catch(Exception e)
		{
			System.out.println("Error encounterd...."+e);
		}
	}

}
