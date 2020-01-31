
public class program76_ArrayIndexOutofBound {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[2];
			System.out.println("Element 3 : "+a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception : "+e);
		}
		System.out.println("out of block");
		
	}

}
