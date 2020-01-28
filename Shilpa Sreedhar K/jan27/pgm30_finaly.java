
public class pgm30_finaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		try
		{
			System.out.println("access element three :" +a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown" +e);
		}
		finally
		{
			a[0]=6;
			System.out.println("first element value" +a[0]);
			System.out.println("the finally stmt executed");
		}

	}

}
