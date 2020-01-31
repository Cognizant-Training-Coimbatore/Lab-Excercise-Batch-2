
public class prog79_exception3 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("Arrayindexoutofbounds occurs");
		}
		catch(Exception e)
		{
		System.out.println("Parent exception occurs");	
		}
		// TODO Auto-generated method stub

	}

}
