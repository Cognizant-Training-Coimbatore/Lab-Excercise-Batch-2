package monday;

public class ExceptionFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[2];
		try
		{
			System.out.println("ACCESS ELEMENT THREE: "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds occurs");
		}
		finally
		{
			a[0]=6;
			System.out.println("first element value : "+a[0]);
			System.out.println("the finally statement is executed");
		}
	}

}
