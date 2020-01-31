
public class program77_multiple_catch {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : "+e);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		
	}

}
