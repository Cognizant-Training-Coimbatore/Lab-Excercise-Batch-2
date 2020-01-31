
public class program78_finally {

	public static void main(String[] args) {
		int a[]=new int[2];
		try
		{
			System.out.println("Element 3 : "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : "+e);
		}
		finally
		{
			a[1]=3;
			System.out.println("Element 2 : "+a[1]);
			System.out.println("Finally block is excecuted");
		}
	}

}
